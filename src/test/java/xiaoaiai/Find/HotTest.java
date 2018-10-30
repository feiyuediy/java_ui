package xiaoaiai.Find;


import com.xiaoaiai.Moudle.BaseCase;
import com.xiaoaiai.Pages.AccostPages.AccostPage;
import com.xiaoaiai.Pages.FindPages.HotPage;
import com.xiaoaiai.Pages.FindPages.MoreTopicPage;
import com.xiaoaiai.Pages.FindPages.RemindPage;
import com.xiaoaiai.Pages.FindPages.ThemeFeedsPage;
import com.xiaoaiai.Pages.LoginPages.LoginPage;
import com.xiaoaiai.Utils.DriverCommon;
import macaca.client.MacacaClient;
import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.asserts.Assertion;

import java.net.MalformedURLException;

/**
 * Created by admin on 2017/9/5.
 */

public class HotTest extends BaseCase{
    private HotPage hotPage;
    private AccostPage accostPage;
    private MoreTopicPage moreTopicPage;
    private RemindPage remindPage;
    private MacacaClient driver;

    @BeforeClass
    public void setup() throws MalformedURLException {
        driver = DriverCommon.getDriver(port1, udid1); }

    @Test
    public void test_click_remind(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("18676390321","123456");
        accostPage = new AccostPage(driver);
        accostPage.go_find();
        hotPage = new HotPage(driver);
        hotPage.click_remind();
        DriverCommon.back(driver);
    }

    @Test
    public void test_click_zan() throws InterruptedException {
        DriverCommon.swipeToUp(driver,500,1);
        while (true){
//            if (hotPage.iszan()){
//                DriverCommon.swipeToUp(driver,500,1);
//            }else {
//                System.out.println("没有点赞,进行点赞");;
//                hotPage.click_zan();
//                break;
//            }
        }
    }


    @Test
    public void test_click_publsh() throws InterruptedException {
        hotPage.click_publsh();
        Assert.assertEquals(true,hotPage.isExitFeed());
        hotPage.click_cancle_publish();
        Assert.assertEquals(false,hotPage.isExitFeed(),"点击弹窗中的取消，对话框消失");
        hotPage.click_publsh();
        hotPage.click_publisc_vedio();
//       Assert.assertEquals(".shortvideo.ShortVideoRecordActivity",driver.currentActivity(),"点击发布动态-视频，跳转到录制视频页面");
        DriverCommon.back(driver);
        hotPage.click_publsh();
        hotPage.click_publish_text();
//       Assert.assertEquals(".ui.PostNewsGridActivity",driver.currentActivity(),"点击发布动态，文字/图片进入到发布动态页面");
        DriverCommon.back(driver);
    }
    @Test
    public void test_click_banner() throws InterruptedException {
        hotPage.click_banner();
//       Assert.assertEquals(".ui.H5Activity",driver.currentActivity(),"点击banner图进入到H5页面");
//        System.out.println(driver.currentActivity());
        Thread.sleep(1000);
        DriverCommon.back(driver);
    }

    @Test
    public void test_check_cr_topic(){
        boolean is = false;
        for (int t=0;t<10;t++){
            System.out.println("第"+t+"此尝试");
            try{
                is = hotPage.isExitCRToptic();
                break;
            }catch (Exception e){

            }
        }
       Assert.assertEquals(is,true,"检查轮播话题是否存在");

    }

    @Test
    public void test_click_cr_topic(){
        hotPage.click_CRToptic();
//       Assert.assertEquals(".ui.ThemeFeedsActivity",driver.currentActivity(),"点击轮播话题，进入到该话题列表");
        DriverCommon.back(driver);
    }

    @Test

    public void test_click_moreTopic(){
        hotPage.cick_moreTopic();
//        System.out.println(driver.currentActivity());
//       Assert.assertEquals(".ui.CircleAllActivity",driver.currentActivity(),"点击轮播话题，进入到该话题列表");
        DriverCommon.back(driver);
    }

    @Test

    public void test_click_ui_feed() throws InterruptedException {
//        int width = driver.manage().window().getSize().width;
//        int height = driver.manage().window().getSize().height;
//        Duration duration=Duration.ofSeconds(1);
//        TouchAction action1 = new TouchAction(driver).press(width / 2, height *3/ 4).waitAction(duration).moveTo(width / 2, height * 7 / 20).release();
//        action1.perform();
//        driver.swipe(width / 2, height *3/ 4, width / 2, height * 7 / 20, 500);
       DriverCommon.swipeToUp(driver,1,1);
        Thread.sleep(2);
        boolean is = hotPage.isExitPublisherTag();
       Assert.assertEquals(true,is,"检查发布人的各种标签");
    }

    @Test

    public void test_click_head(){
        hotPage.click_head();
//       Assert.assertEquals(".ui.UserInfoActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        DriverCommon.back(driver);
    }

    @Test

    public void test_click_feed(){
        hotPage.click_feed();
//        System.out.println(driver.currentActivity());
//       Assert.assertEquals(".ui.FeedDetailActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        DriverCommon.back(driver);
    }

    @Test

    public void test_click_img_container(){
        hotPage.click_img();
        DriverCommon.goSleep(1);
//        System.out.println(driver.currentActivity());
//       Assert.assertEquals(".ui.DraweeGalleryActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        DriverCommon.back(driver);
    }

    @Test

    public void test_click_topicTag(){
        hotPage.click_topicTags();
//        System.out.println(driver.currentActivity());
//       Assert.assertEquals(".ui.ThemeFeedsActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        DriverCommon.back(driver);
    }

    @Test

    public void test_click_report(){
        hotPage.click_report();
        boolean is = hotPage.repotrFrameIsExit();
       Assert.assertEquals(true,is,"点击举报按钮，弹出举报弹窗");
        hotPage.click_cancle_report();
        boolean is1 = hotPage.repotrFrameIsExit();
       Assert.assertEquals(false,is1,"点击举报按钮弹窗中的取消按钮，弹窗消失");
        hotPage.click_report();
        hotPage.click_confirm_report();
//        DriverCommon.findToast(driver,"您已经举报过了。");
        boolean is2 = hotPage.repotrFrameIsExit();
       Assert.assertEquals(false,is2,"点击举报按钮弹窗中的确定按钮，弹窗消失");
    }

    @Test

    public void test_click_comment(){
        hotPage.click_comment();
//        System.out.println(driver.currentActivity());
//       Assert.assertEquals(".ui.FeedDetailActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        DriverCommon.back(driver);
    }

    @Test

    public void test_click_zan_headImg(){
        hotPage.click_zan_imgHead();
//        System.out.println(driver.currentActivity());
//       Assert.assertEquals(".ui.UserInfoActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        DriverCommon.back(driver);
    }
    @Test

    public void test_click_zan_more(){
        hotPage.click_zan_more();
//        System.out.println(driver.currentActivity());
//       Assert.assertEquals(".ui.FeedDetailActivity",driver.currentActivity(),"点击动态中的用户头像跳转到用户资料页面");
        DriverCommon.back(driver);
    }


    @Test
    public void test_check_ui() throws Exception {
        DriverCommon.swipeToDown(driver,500,1);

        AccostPage accostPage = new AccostPage(driver);
        accostPage.go_find();
        hotPage = new HotPage(driver);
        hotPage.cick_moreTopic();
        moreTopicPage = new MoreTopicPage(driver);
        String title = moreTopicPage.getTitle();
       Assert.assertEquals("圈子",title,"检查title名称：圈子");

        boolean isExitBack = moreTopicPage.isBackExit();
       Assert.assertEquals(true,isExitBack,"检查返回按钮是否存在");

        boolean isExitEdit = moreTopicPage.isEditExit();
       Assert.assertEquals(true,isExitEdit,"检查编辑按钮是否存在");
    }


    @Test
    public void test_click_edit(){
        moreTopicPage.click_edit();
//        String activity = driver.currentActivity();

//       Assert.assertEquals(".ui.PostNewsGridActivity",activity,"点击编辑按钮跳转到发布话题界面");
        DriverCommon.back(driver);
    }

    @Test
    public void test_click_recommend() throws InterruptedException {
        moreTopicPage.click_recommend(1);
//        String activity = driver.currentActivity();

//       Assert.assertEquals(".ui.ThemeFeedsActivity",activity,"点击推荐话题跳转到该话题的页面");
        DriverCommon.back(driver);
        Thread.sleep(3000);
    }

//
//    @Test
//    public void test_swip_recommend(){
//        String imgAfter = moreTopicPage.screenshotFristRecommendImg();
//        moreTopicPage.swipRecommend(3,1);
//        String imgBefore = moreTopicPage.screenshotFristRecommendImg();
//        boolean is = Common.comparePint(imgAfter,imgBefore,90);
//       Assert.assertEquals(false,is,"滑动推荐话题");
//    }


    @Test
    public void test_click_moreRecommend(){
        moreTopicPage.click_recommend(2);
//        System.out.println(driver.currentActivity());
        DriverCommon.back(driver);
    }


    @Test
    public void test_click_topicList(){
        String topicName = moreTopicPage.getTopicName(2);
        moreTopicPage.click_topic(2);
//       Assert.assertEquals(".ui.ThemeFeedsActivity",driver.currentActivity(),"点击话题跳转到该话题的页面");
        ThemeFeedsPage themeFeedsPage = new ThemeFeedsPage(driver);
        String title = themeFeedsPage.getTitle();
       Assert.assertEquals(title,topicName,"检查跳转的主题动态是否是该动态");
        DriverCommon.back(driver);
    }

    @Test
    public void test_swip() throws InterruptedException {
        for(int i=0;i<6;i++){
            DriverCommon.swipeToUp(driver,500,1);
            Thread.sleep(1000);
        }
        boolean is = moreTopicPage.isExitState();
       Assert.assertEquals(true,is,"检查最后的没有多数据是否存在");

        String txt = moreTopicPage.getStateTxt();
       Assert.assertEquals("没有更多数据了",txt,"检查最后的没有多数据文字");
        DriverCommon.back(driver);
    }


    @Test
    public void test_check_ui_remade(){
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("18676390321","123456");
        AccostPage accostPage = new AccostPage(driver);
        accostPage.go_find();
        hotPage = new HotPage(driver);
        hotPage.click_remind();
        remindPage = new RemindPage(driver);
        String title = remindPage.getTitle();
       Assert.assertEquals("全部提醒",title,"检查title名称：全部提醒");
    }

    @Test
    public void test_click_back_remde(){
        remindPage.click_back();
//        System.out.println(driver.currentActivity());
//       Assert.assertEquals(".ui.MainActivity",driver.currentActivity(),"点击返回按钮返回到主页面");
        hotPage.click_remind();
    }


    @Test
    public void test_click_vedioFeed(){
        remindPage.click_video_feed(0);
//       Assert.assertEquals(".ui.VideoFeedDetailActivity",driver.currentActivity(),"点击视频动态提醒进入到视频动态");
        DriverCommon.back(driver);
    }

//    @Test
//    public void test_click_textFeed(){
//        remindPage.click_txt_feed();
//
//       Assert.assertEquals(".ui.FeedDetailActivity",driver.currentActivity(),"点击图文动态提醒进入到图文动态");
//        System.out.println(driver.currentActivity());
//        DriverCommon.back(driver);
//    }


    @Test
    public void test_click_headImg() throws InterruptedException {
        remindPage.click_name(2);
//        driver.currentContext()
//        System.out.println(driver.currentActivity());
//        Assert.assertEquals(".ui.UserInfoActivity",driver.currentActivity(),"点击头像进入到用户资料页面");
        DriverCommon.back(driver);
        Thread.sleep(2000);
        DriverCommon.back(driver);
    }

    @AfterClass
    public void tear() {
//     driver.quit();
//        DriverCommon.quit(driver);
    }
}
