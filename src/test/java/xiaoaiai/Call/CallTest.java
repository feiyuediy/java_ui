package xiaoaiai.Call;

import com.xiaoaiai.Moudle.Account;
import com.xiaoaiai.Moudle.BaseCase;
import com.xiaoaiai.Pages.AccostPages.AccostPage;
import com.xiaoaiai.Pages.CallPages.*;
import com.xiaoaiai.Pages.LoginPages.LoginPage;
import com.xiaoaiai.Pages.MinePages.MinePage;
import com.xiaoaiai.Pages.MinePages.PersonalInfoPage;
import com.xiaoaiai.Pages.NewsPages.*;
import com.xiaoaiai.Utils.DriverCommon;
import com.xiaoaiai.Utils.GetResources;
import macaca.client.MacacaClient;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import java.io.FileNotFoundException;
import java.util.logging.Logger;

public class CallTest extends BaseCase {
    private Logger logger = Logger.getLogger(String.valueOf(CallTest.class));
    private Account lauch;
    private Account accpet;
    private MacacaClient lauch_driver;
    private MacacaClient accpet_driver;
    private LoginPage loginPage_lauch;
    private LoginPage loginPage_accpet;
    private AccostPage accostPage;
    private MinePage minePage;
    private int aiai_banlce;

    @BeforeClass
    public void setUp() throws FileNotFoundException {
        //获取macaca
        lauch_driver = DriverCommon.getDriver(port1, udid1);
        accpet_driver = DriverCommon.getDriver(port2, udid2);

        lauch = GetResources.getAccout(evn,"g","y");
        accpet = GetResources.getAccout(evn,"b","n");

        //登录发起方账号
        loginPage_lauch = new LoginPage(lauch_driver);
        loginPage_lauch.login(lauch.getAcc(),lauch.getPwd());

        //登录接收方
        loginPage_accpet = new LoginPage(accpet_driver);
        loginPage_accpet.login(accpet.getAcc(),accpet.getPwd());

    }
    @Test
    public void nofansVideoCall() throws Exception {

        //发起方查询一下剩余爱爱豆
        accostPage = new AccostPage(lauch_driver);
        accostPage.go_mine();

        minePage = new MinePage(lauch_driver);
        aiai_banlce = Integer.valueOf(minePage.get_banlce());

        //进入到消息页面
        accostPage.go_news();

        //进入到联系人页面
        NewsPage newsPage = new NewsPage(lauch_driver);
        newsPage.click_contact();

        //搜索接受人的账号，并且进入到他的个人资料
        ContactPage contactPage = new ContactPage(lauch_driver);
        contactPage.seach(accpet.getAiaiNum());

        //点击发起视频
        PersonalInfoPage personalInfoPage = new PersonalInfoPage(lauch_driver);
        personalInfoPage.lauch_video();
        DriverCommon.Hand_permission(lauch_driver);
        DriverCommon.Hand_permission(lauch_driver);

        //接收方接受
        ComingCallPage comingCallPage = new ComingCallPage(accpet_driver);
        comingCallPage.answer();
        DriverCommon.Hand_permission(accpet_driver);
        DriverCommon.Hand_permission(accpet_driver);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //接受方挂断
        VideoCallIngPage videoCallIngPage = new VideoCallIngPage(accpet_driver);
        videoCallIngPage.refuse_handup();

        //返回到首页
        personalInfoPage.click_back();
        SeachPage seachPage = new SeachPage(lauch_driver);
        seachPage.click_back();
        seachPage.click_back();
        //查询通话后爱爱豆余额
        accostPage.go_mine();
        int after_banlce = Integer.valueOf(minePage.get_banlce());
        Assert.assertEquals(aiai_banlce-after_banlce,40);
    }

    @Test
    public void nofansVioceCall(){
        //进入到消息页面
        accostPage.go_news();

        //进入到联系人页面
        NewsPage newsPage = new NewsPage(lauch_driver);
        newsPage.click_contact();

        //搜索接受人的账号，并且进入到他的个人资料
        ContactPage contactPage = new ContactPage(lauch_driver);
        contactPage.seach(accpet.getAiaiNum());

        //点击发起视频
        PersonalInfoPage personalInfoPage = new PersonalInfoPage(lauch_driver);
        personalInfoPage.lauch_voice();

        //接收方接受
        ComingCallPage comingCallPage = new ComingCallPage(accpet_driver);
        comingCallPage.answer();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //接受方挂断
        VoiceCallIngPage voiceCallIngPage = new VoiceCallIngPage(accpet_driver);
        voiceCallIngPage.refuse_handup();

        //返回到首页
        personalInfoPage.click_back();
        SeachPage seachPage = new SeachPage(lauch_driver);
        seachPage.click_back();
        seachPage.click_back();
        //查询通话后爱爱豆余额
        accostPage.go_mine();
        int after_banlce = Integer.valueOf(minePage.get_banlce());
        Assert.assertEquals(aiai_banlce-after_banlce,70);
    }


    @Test
    public void nofansyuetiao() throws InterruptedException {
        //进入到消息页面
        accostPage.go_news();

        //进入到联系人页面
        NewsPage newsPage = new NewsPage(lauch_driver);
        newsPage.click_contact();

        //搜索接受人的账号，并且进入到他的个人资料
        ContactPage contactPage = new ContactPage(lauch_driver);
        contactPage.seach(accpet.getAiaiNum());

        //点击发起约跳
        PersonalInfoPage personalInfoPage = new PersonalInfoPage(lauch_driver);
        personalInfoPage.lauch_yuetiao();

        //接收方接受
        ComingYuetiaoPage comingYuetiaoPage = new ComingYuetiaoPage(accpet_driver);
        comingYuetiaoPage.answer();

        //权限弹窗
        DriverCommon.Hand_permission(accpet_driver);
        DriverCommon.Hand_permission(lauch_driver);
        //接收方挂断
        YuetiaoingPage yuetiaoingPage = new YuetiaoingPage(accpet_driver);
        yuetiaoingPage.click_deviceWaring_cancle();
        Thread.sleep(4000);
        yuetiaoingPage.off();
        yuetiaoingPage.click_offDialog_ok();

        //发起方还要点击连接已关闭弹出中的我知道了
        YuetiaoingPage yuetiaoingPage1 = new YuetiaoingPage(lauch_driver);
        yuetiaoingPage1.click_offDialog_ok();

        //发起方返回到首页
        personalInfoPage.click_back();
        SeachPage seachPage = new SeachPage(lauch_driver);
        seachPage.click_back();
        seachPage.click_back();
        //查询通话后爱爱豆余额
        accostPage.go_mine();
        int after_banlce = Integer.valueOf(minePage.get_banlce());
        Assert.assertEquals(aiai_banlce-after_banlce,110);

    }

    @Test
    public void fansVideoCall(){
        //接听方关注拨打方
        AccostPage accostPageAccpect = new AccostPage(accpet_driver);
        accostPageAccpect.go_news();
        //接收方进入到联系人界面
        NewsPage newsPageAccpect = new NewsPage(accpet_driver);
        newsPageAccpect.click_contact();

        //关注拨打方
        ContactPage contactPageAccpect = new ContactPage(accpet_driver);
        contactPageAccpect.seach(lauch.getAiaiNum());
        PersonalInfoPage personalInfoPageAccpect = new PersonalInfoPage(accpet_driver);
        personalInfoPageAccpect.attion();
        personalInfoPageAccpect.click_back();

        SeachPage seachPageAccpect = new SeachPage(accpet_driver);
        seachPageAccpect.click_back();
        seachPageAccpect.click_back();


        //拨打方拨打电话

        //进入到消息页面
        accostPage.go_news();

        //进入到联系人页面
        NewsPage newsPage = new NewsPage(lauch_driver);
        newsPage.click_contact();

        //搜索接受人的账号，并且进入到他的个人资料
        ContactPage contactPage = new ContactPage(lauch_driver);
        contactPage.seach(accpet.getAiaiNum());

        //点击发起视频
        PersonalInfoPage personalInfoPage = new PersonalInfoPage(lauch_driver);
        personalInfoPage.lauch_video();

        //接收方接受
        ComingCallPage comingCallPage = new ComingCallPage(accpet_driver);
        comingCallPage.answer();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //接受方挂断
        VideoCallIngPage videoCallIngPage = new VideoCallIngPage(accpet_driver);
        videoCallIngPage.refuse_handup();

        //返回到首页
        personalInfoPage.click_back();
        SeachPage seachPage = new SeachPage(lauch_driver);
        seachPage.click_back();
        seachPage.click_back();
        //查询通话后爱爱豆余额
        accostPage.go_mine();
        int after_banlce = Integer.valueOf(minePage.get_banlce());
        Assert.assertEquals(aiai_banlce-after_banlce,110);

    }

    @Test
    public void fansVioceCall() {
        //进入到消息页面
        accostPage.go_news();

        //进入到联系人页面
        NewsPage newsPage = new NewsPage(lauch_driver);
        newsPage.click_contact();

        //搜索接受人的账号，并且进入到他的个人资料
        ContactPage contactPage = new ContactPage(lauch_driver);
        contactPage.seach(accpet.getAiaiNum());

        //点击发起视频
        PersonalInfoPage personalInfoPage = new PersonalInfoPage(lauch_driver);
        personalInfoPage.lauch_voice();

        //接收方接受
        ComingCallPage comingCallPage = new ComingCallPage(accpet_driver);
        comingCallPage.answer();


        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //接受方挂断
        VoiceCallIngPage voiceCallIngPage = new VoiceCallIngPage(accpet_driver);
        voiceCallIngPage.refuse_handup();

        //返回到首页
        personalInfoPage.click_back();
        SeachPage seachPage = new SeachPage(lauch_driver);
        seachPage.click_back();
        seachPage.click_back();
        //查询通话后爱爱豆余额
        accostPage.go_mine();
        int after_banlce = Integer.valueOf(minePage.get_banlce());
        Assert.assertEquals(aiai_banlce - after_banlce, 110);
    }
    @Test
    public void fansYuetiao() throws InterruptedException {
        //进入到消息页面
        accostPage.go_news();

        //进入到联系人页面
        NewsPage newsPage = new NewsPage(lauch_driver);
        newsPage.click_contact();

        //搜索接受人的账号，并且进入到他的个人资料
        ContactPage contactPage = new ContactPage(lauch_driver);
        contactPage.seach(accpet.getAiaiNum());

        //点击发起约跳
        PersonalInfoPage personalInfoPage = new PersonalInfoPage(lauch_driver);
        personalInfoPage.lauch_yuetiao();

        //接收方接受
        ComingYuetiaoPage comingYuetiaoPage = new ComingYuetiaoPage(accpet_driver);
        comingYuetiaoPage.answer();

        //接收方挂断
        YuetiaoingPage yuetiaoingPage = new YuetiaoingPage(accpet_driver);
        Thread.sleep(4000);
        yuetiaoingPage.off();
        yuetiaoingPage.click_offDialog_ok();


        //发起方还要点击连接已关闭弹出中的我知道了
        YuetiaoingPage yuetiaoingPage1 = new YuetiaoingPage(lauch_driver);
        yuetiaoingPage1.click_offDialog_ok();


        //发起方返回到首页
        personalInfoPage.click_back();
        SeachPage seachPage = new SeachPage(lauch_driver);
        seachPage.click_back();
        seachPage.click_back();
        //查询通话后爱爱豆余额
        accostPage.go_mine();
        int after_banlce = Integer.valueOf(minePage.get_banlce());
        Assert.assertEquals(aiai_banlce-after_banlce,110);

        //清理环境
        ContactPage contactPage1 = new ContactPage(accpet_driver);
        contactPage1.click_myAttention();

        MyAttentionPage myAttentionPage = new MyAttentionPage(accpet_driver);
        System.out.println(lauch.getNickName());
        myAttentionPage.canle_attention(lauch.getNickName());
    }

    @AfterClass
    public void teardown(){

    }
}
