package xiaoaiai.Accost;

import com.xiaoaiai.Moudle.Account;
import com.xiaoaiai.Moudle.BaseCase;

import com.xiaoaiai.Pages.AccostPages.AccostPage;
import com.xiaoaiai.Pages.AccostPages.IDphotoPage;
import com.xiaoaiai.Pages.AccostPages.MoodPage;
import com.xiaoaiai.Pages.AccostPages.UploadIdphotoPage;
import com.xiaoaiai.Pages.LoginPages.LoginPage;
import com.xiaoaiai.Pages.NewsPages.ContactPage;
import com.xiaoaiai.Pages.NewsPages.MyAttentionPage;
import com.xiaoaiai.Pages.NewsPages.NewsPage;
import com.xiaoaiai.Utils.Common;
import com.xiaoaiai.Utils.DriverCommon;
import com.xiaoaiai.Utils.GetResources;
import com.xiaoaiai.Utils.Screenshot;
import macaca.client.MacacaClient;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.HashMap;

/**
 * Created by admin on 2017/9/4.
 */

@Features("搭讪")

public class AccostTest extends BaseCase{
    private IDphotoPage iDphotoPage;
    private UploadIdphotoPage uploadIdphotoPage;
    private MoodPage moodPage;
    private MacacaClient driver;
    private Account account;

    @BeforeClass
    public void setup() throws MalformedURLException, FileNotFoundException {
        driver = DriverCommon.getDriver(port1, udid1);
        account = GetResources.getAccout(evn,"g","y");
    }

    @Test
    @Stories("ID照")
    @Title("点击上传")
    public void test_click_uploas(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(account.getAcc(), account.getPwd());

        iDphotoPage = new IDphotoPage(driver);
        iDphotoPage.click_upload();
//
//        System.out.println(driver.currentActivity());
//        Assertion.verifyEquals(".ui.EditIdPhotoActivity",driver.currentActivity());
        DriverCommon.back(driver);
    }
    @Test
    @Stories("ID照")
    @Title("切换列表类型")
    public void test_change_list(){
        iDphotoPage.changeList("最近注册");
    }

    @Test
    @Stories("ID照")
    @Title("点击id照")
    public void test_click_idPhoto(){
        iDphotoPage.click_idphoto();
//        Assertion.verifyEquals(".ui.UserInfoActivity",driver.currentActivity());
        DriverCommon.back(driver);
    }

    @Test
    @Stories("上传id照")
    @Title("上传id照页面点击返回")
    public void test_back_idphotoUpload(){
        uploadIdphotoPage = new UploadIdphotoPage(driver);
//        System.out.println(driver.currentActivity());
//        Assertion.verifyEquals(".ui.MainActivity",driver.currentActivity());
    }

    @Test
    @Stories("上传id照")
    @Title("上传id照页面title")
    public void test_UIcheck_idphotoUpload(){
        iDphotoPage.click_upload();
        String title = uploadIdphotoPage.getTile();
//        System.out.println(driver.currentActivity());
//        Assertion.verifyEquals("ID照上传",title);
        DriverCommon.back(driver);
    }

    @Test
    @Stories("上传id照")
    @Title("点击更新之后点击取消按钮")
    public void test_dphotoUpload(){
        uploadIdphotoPage.click_uploadIdphoto();
        uploadIdphotoPage.click_cance();
        boolean is = uploadIdphotoPage.is();
//        Assertion.verifyEquals(false,is);
    }

    @Test
    @Stories("上传id照")
    @Title("删除id照弹窗检查")
    public void test_deleteIdphoto(){
        uploadIdphotoPage.click_uploadIdphoto();
        uploadIdphotoPage.click_delete();
        String tips = uploadIdphotoPage.getDelectTips();
//        Assertion.verifyEquals("您确认要删除已选ID照？",tips);
        uploadIdphotoPage.click_deleteCance();
        boolean is = uploadIdphotoPage.isdelect();
//        Assertion.verifyEquals(false,is);
        uploadIdphotoPage.click_uploadIdphoto();
        uploadIdphotoPage.click_delete();
        uploadIdphotoPage.click_deleteSure();
        boolean isExitUploadButton = uploadIdphotoPage.isExitUpload();
//        Assertion.verifyEquals(false,isExitUploadButton);
    }


    @Test
    @Stories("上传id照")
    @Title("更新id照")
    public void test_upload() throws InterruptedException {
        uploadIdphotoPage.upload();
        Thread.sleep(5000);
        String tips = uploadIdphotoPage.getIdphotostatiu();
//        Assertion.verifyEquals("审核中",tips);
        String text = uploadIdphotoPage.getUploadText();
//        Assertion.verifyEquals("审核中",text);
        DriverCommon.back(driver);
    }


    @Test
    @Stories("心情")
    @Title("点击心情列表中的头像")
    public void test_click_head() {
        AccostPage accostPage = new AccostPage(driver);
        accostPage.click_mood();
        moodPage = new MoodPage(driver);
        moodPage.changeScreen("女");
        moodPage.click_head(2);
//        Assertion.verifyEquals(".ui.UserInfoActivity",driver.currentActivity(),"点击心情列表中的头像跳转到个人资料");
        DriverCommon.back(driver);
    }

    @Test
    @Stories("心情")
    @Title("发布信息")
    public void test_edit_mood()  {
        String mood = "心情测试test"+Integer.toString((int)(Math.random()*9+1)*100000);
        moodPage.editMood(mood);
//        Assertion.verifyEquals("心情："+mood,moodPage.getMyMood(),"检查发布心情是否成功");
    }

    @Test
    @Stories("心情")
    @Title("检查标签")
    public void test_UI_tag()  {
//        boolean levilTag = moodPage.getLevilTag();
//        boolean sexTag = moodPage.getSexTag();
//        boolean device = moodPage.getdeviceTag();
//        boolean chang = moodPage.getChaneTag();
//        Assertion.verifyEquals(true,levilTag,"检查等级标签存在");
//        Assertion.verifyEquals(true,sexTag,"检查性别标签存在");
//        Assertion.verifyEquals(true,device,"检查设备标签存在");
//        Assertion.verifyEquals(true,chang,"检查魅力值标签存在");
    }

    @Test
    @Stories("心情")
    @Title("心情页面关注")
    public void test_mood_floow() throws Exception {
        for (int i = 2;i<=6;i++){
            String xpth = "//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout["+Integer.valueOf(i)+"]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.ImageView[1]";
            String file = Screenshot.snapshotWithElement(driver,driver.waitForElement("xpath",xpth));
            System.out.println(file);
            boolean isNoFllow = Common.comparePint(file,"D:\\GitProject\\Xiaoaiai_appium\\Xiaoaiai_Appium\\src\\main\\resources\\png\\noFllow.png",90);
            //判断是否关注了
            if (isNoFllow){
                //没有关注就点击关注
                driver.waitForElement("xpath",xpth).click();
                moodPage.click_ok();
                //获取那个人的昵称
                String nick = driver.waitForElementByXPath("//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout["+Integer.valueOf(i)+"]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.TextView[1]").getText();
                //进入消息页面
                AccostPage accostPage = new AccostPage(driver);
                accostPage.go_news();
                //点击联系人进入到联系人页面
                NewsPage newsPage = new NewsPage(driver);
                newsPage.click_contact();

                //点击我的关注进入到关注列表
                ContactPage chatNewPage = new ContactPage(driver);
                chatNewPage.click_myAttention();

                MyAttentionPage myAttentionPage = new MyAttentionPage(driver);
                //取消关注刚才的那个人
                myAttentionPage.canle_attention(nick);
                break;
            }
        }

    }
    @Test
    public void test(){
        HashMap<String, String > s = new HashMap<String, String>();
        s.put("dddd","ddddd");

    }

    @AfterClass
    public void teardown(){
//        driver.closeApp();
    }
}
