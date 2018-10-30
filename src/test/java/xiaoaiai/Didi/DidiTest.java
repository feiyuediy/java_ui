package xiaoaiai.Didi;

import com.xiaoaiai.Moudle.Account;
import com.xiaoaiai.Moudle.BaseCase;
import com.xiaoaiai.Pages.AccostPages.AccostPage;
import com.xiaoaiai.Pages.CallPages.VideoCallIngPage;
import com.xiaoaiai.Pages.CallPages.VoiceCallIngPage;
import com.xiaoaiai.Pages.CallPages.YuetiaoingPage;
import com.xiaoaiai.Pages.DidiPages.DidiPage;
import com.xiaoaiai.Pages.DidiPages.EvaluatePage;
import com.xiaoaiai.Pages.DidiPages.FollowFramePage;
import com.xiaoaiai.Pages.DidiPages.OrderFramPage;
import com.xiaoaiai.Pages.LoginPages.LoginPage;
import com.xiaoaiai.Pages.MinePages.MinePage;
import com.xiaoaiai.Pages.MinePages.PersonalInfoPage;
import com.xiaoaiai.Pages.NewsPages.ContactPage;
import com.xiaoaiai.Pages.NewsPages.MyAttentionPage;
import com.xiaoaiai.Pages.NewsPages.NewsPage;
import com.xiaoaiai.PagesBeans.FindBeans.PreviewVideoBean;
import com.xiaoaiai.Utils.DriverCommon;
import com.xiaoaiai.Utils.GetResources;
import macaca.client.MacacaClient;
import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

import java.io.FileNotFoundException;


public class DidiTest extends BaseCase {
    private MacacaClient launchDriver;
    private MacacaClient acceptDriver;
    private Account acceptAccount;
    private Account launchAccount;
    private int aiaiBanlce;
    private static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(DidiTest.class);
    private AccostPage accostPageLaunch;
    private DidiPage didiPage;

    @BeforeClass
    public void setUp() throws FileNotFoundException {
        //获取macaca
        launchDriver = DriverCommon.getDriver(port1, udid1);
        acceptDriver = DriverCommon.getDriver(port2, udid2);

        launchAccount = GetResources.getAccout(evn,"g","y");
        acceptAccount = GetResources.getAccout(evn,"b","n");

        //登录发起方账号
        LoginPage loginPageLaunch = new LoginPage(launchDriver);
        loginPageLaunch.login(launchAccount.getAcc(),launchAccount.getPwd());

        //登录接收方
        LoginPage loginPageAccept = new LoginPage(acceptDriver);
        loginPageAccept.login(acceptAccount.getAcc(),acceptAccount.getPwd());
    }

    @Test
    public void didiFollow() throws InterruptedException {
        //获取乘客爱爱豆
        accostPageLaunch = new AccostPage(launchDriver);
        accostPageLaunch.go_mine();

        MinePage minePage = new MinePage(launchDriver);
        aiaiBanlce = Integer.valueOf(minePage.get_banlce());
        //进入到didi界面
        accostPageLaunch.go_didi();

        //获取免费互粉的次数
        didiPage = new DidiPage(launchDriver);
        String price = didiPage.getPrice();

        //消耗掉免费的次数
        if (price.contains("免费")){
            int b = Integer.valueOf(price.substring(4,price.length()-1));
            logger.info("免费次数："+b);
            for (int i = 0;i<b;i++){
                didiPage.launchFollow();

                FollowFramePage followFramePage = new FollowFramePage(launchDriver);
                followFramePage.view();
                PersonalInfoPage personalInfoPage = new PersonalInfoPage(launchDriver);
                personalInfoPage.black();
                Thread.sleep(2000);
                personalInfoPage.unblack();
                personalInfoPage.click_back();
                //到滴滴界面
                accostPageLaunch.go_didi();
            }
        }

        //使用爱爱豆互粉
        didiPage.launchFollow();

        FollowFramePage followFramePage = new FollowFramePage(launchDriver);
        String nick = followFramePage.getNick();
        followFramePage.view();
        //点击查看资料跳转到司机的资料
        PersonalInfoPage personalInfoPage = new PersonalInfoPage(launchDriver);
        Assert.assertEquals(nick,personalInfoPage.get_title());

        //清理环境，取消关注
        personalInfoPage.black();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        personalInfoPage.unblack();
        personalInfoPage.click_back();
        //司机查看是否扣除爱爱豆
        accostPageLaunch.go_mine();
        int afterFollow = Integer.valueOf(minePage.get_banlce());
        Assert.assertEquals(aiaiBanlce - afterFollow, 10);
    }

    @Test
    public void didiVoice(){
        //进入到didi界面
        accostPageLaunch.go_didi();
        //发起didi语音
        String msg = "45345d打大师傅";
        didiPage.launchVoice(false,msg);

        //乘客获取的内容
        OrderFramPage orderFramPage = new OrderFramPage(acceptDriver);
        String msgForOrder = orderFramPage.getMsg();
        String nickForOrder = orderFramPage.getNick();
        Assert.assertEquals(nickForOrder,launchAccount.getNickName());
        Assert.assertEquals(msg, msgForOrder.split("：")[1]);
        //乘客接单
        orderFramPage.answer();
        DriverCommon.Hand_permission(acceptDriver);
        //通话四秒钟
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //司机挂断
        VoiceCallIngPage voiceCallIngPage = new VoiceCallIngPage(acceptDriver);
        voiceCallIngPage.refuse_handup();

        //乘客评价
        EvaluatePage evaluatePage = new EvaluatePage(launchDriver);
        evaluatePage.evaluate(2,"很尴尬");

        //乘客查看爱爱豆情况
        accostPageLaunch.go_mine();
        MinePage minePage = new MinePage(launchDriver);
        int afterVoice = Integer.valueOf(minePage.get_banlce());
        Assert.assertEquals(aiaiBanlce - afterVoice,10+30);
    }
    @Test
    public void didiVideo(){
        //接單后后要1分钟才能再次接单
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //进入到didi界面
        accostPageLaunch.go_didi();
        //发起didi视频
        String msg = "45345d打大师傅";
        didiPage.launchVideo(false);

        //乘客获取的内容
        OrderFramPage orderFramPage = new OrderFramPage(acceptDriver);
//        String msgForOrder = orderFramPage.getMsg();
        String nickForOrder = orderFramPage.getNick();
        Assert.assertEquals(nickForOrder,launchAccount.getNickName());
//        Assert.assertEquals(msg, msgForOrder.split("：")[1]);
        //乘客接单
        orderFramPage.answer();
        DriverCommon.Hand_permission(acceptDriver);
        //通话四秒钟
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //司机挂断
        VideoCallIngPage videoCallIngPage = new VideoCallIngPage(acceptDriver);
        videoCallIngPage.refuse_handup();

        //乘客评价
        EvaluatePage evaluatePage = new EvaluatePage(launchDriver);
        evaluatePage.evaluate(2);

        //乘客查看爱爱豆情况
        accostPageLaunch.go_mine();
        MinePage minePage = new MinePage(launchDriver);
        int afterVoice = Integer.valueOf(minePage.get_banlce());
        Assert.assertEquals(aiaiBanlce - afterVoice,10+30+40);
    }

    @Test
    public void didiYuetiao(){
        //接單后后要1分钟才能再次接单
        try {
            Thread.sleep(40000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //进入到didi界面
        accostPageLaunch.go_didi();
        //发起didi视频
        String msg = "45345d打大师傅";
        didiPage.launchYuetiao(false);

        //乘客获取的内容
        OrderFramPage orderFramPage = new OrderFramPage(acceptDriver);
//        String msgForOrder = orderFramPage.getMsg();
        String nickForOrder = orderFramPage.getNick();
        Assert.assertEquals(nickForOrder,launchAccount.getNickName());
//        Assert.assertEquals(msg, msgForOrder.split("：")[1]);
        //乘客接单
        orderFramPage.answer();
        YuetiaoingPage yuetiaoingPage = new YuetiaoingPage(acceptDriver);
        yuetiaoingPage.click_deviceWaring_cancle();
        //通话四秒钟
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //司机挂断

        yuetiaoingPage.off();
        yuetiaoingPage.click_offDialog_ok();


        YuetiaoingPage yuetiaoingPageLaunch = new YuetiaoingPage(launchDriver);
        yuetiaoingPageLaunch.click_offDialog_ok();

        //乘客评价
        EvaluatePage evaluatePage = new EvaluatePage(launchDriver);
        evaluatePage.evaluate(4);

        //乘客查看爱爱豆情况
        accostPageLaunch.go_mine();
        MinePage minePage = new MinePage(launchDriver);
        int afterVoice = Integer.valueOf(minePage.get_banlce());
        Assert.assertEquals(aiaiBanlce - afterVoice,10+30+40+40);
    }
}