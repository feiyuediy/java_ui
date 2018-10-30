package xiaoaiai.Find;

import com.xiaoaiai.Moudle.Account;
import com.xiaoaiai.Moudle.BaseCase;
import com.xiaoaiai.Pages.AccostPages.AccostPage;
import com.xiaoaiai.Pages.FindPages.HotPage;
import com.xiaoaiai.Pages.FindPages.RecordVideoPage;
import com.xiaoaiai.Pages.FindPages.UploadVideoPage;
import com.xiaoaiai.Pages.LoginPages.LoginPage;
import com.xiaoaiai.Utils.DriverCommon;
import com.xiaoaiai.Utils.GetResources;
import macaca.client.MacacaClient;
import org.testng.Assert;
import org.testng.annotations.*;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;


@Features("视频动态")
//@Listeners({com.appium.Listener.AssertionListener.class })

public class VideoTest extends BaseCase{
    private RecordVideoPage recordVideoPage;
    private HotPage hotPage;
    private UploadVideoPage uploadVideoPage;
    private MacacaClient driver;
    private Account account;

//    @BeforeClass
//    public void setup()  {
//        System.out.println("login setup");
//        driver.launchApp();
//    }

    @BeforeClass
    public void setup() throws MalformedURLException, FileNotFoundException {
        driver = DriverCommon.getDriver(port1, udid1);
        account = GetResources.getAccout(evn,"b","n");
    }
    @Stories("录制视频动态")
    @Title("没有录制时退出录制")
    @Test
    public void test_noRecord_colse(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(account.getAcc(), account.getPwd());
        AccostPage accostPage = new AccostPage(driver);
        accostPage.go_find();
        hotPage = new HotPage(driver);
        hotPage.click_publsh();
        hotPage.click_publisc_vedio();
        recordVideoPage = new RecordVideoPage(driver);
        recordVideoPage.click_colse();
//       Assert.assertEquals(".ui.MainActivity",driver.currentActivity(),"没有录制时点击关闭直接返回到主界面");
    }

    @Stories("录制视频动态")
    @Title("已经录制了退出")
    @Test
    public void test_record_close() throws InterruptedException {
//        ReportUtil.log("发现右上角的发布按钮，进入到录制视频页面");
        hotPage.click_publsh();
        hotPage.click_publisc_vedio();

        Thread.sleep(4000);//有一个toast。要等这个王八蛋消失了才可以点击录制
        recordVideoPage.click_record();
        Thread.sleep(3000);
        recordVideoPage.click_colse();

        //判断是否存在弹窗
        boolean isDialog = recordVideoPage.isExitDialog();
       Assert.assertEquals(true,isDialog,"录制时点击关闭弹出对话框");

        String dialogTitle = recordVideoPage.get_dialog_title();
        System.out.println(dialogTitle);
       Assert.assertEquals("您正在录制视频， 是否放弃录制？",dialogTitle,"点击对话框中的取消，关闭对话框");

        recordVideoPage.click_dialog_cancle();
        boolean isDialog1 = recordVideoPage.isExitDialog();
       Assert.assertEquals(false,isDialog1,"点击对话框中的取消，关闭对话框");

        recordVideoPage.click_colse();
        recordVideoPage.click_dialog_ok();
        boolean isDialog2 = recordVideoPage.isExitDialog();
       Assert.assertEquals(false,isDialog2,"点击对话框中的确定，关闭对话框");
//       Assert.assertEquals(".ui.MainActivity",driver.currentActivity(),"点击对话框中的确定,返回到主界面");
    }

    @Stories("录制视频动态")
    @Title("未录制时不显示删除按钮和完成按钮")
    @Test
    public void test_check_deleteAndConnat() throws InterruptedException {
        hotPage.click_publsh();
        hotPage.click_publisc_vedio();

        boolean isDelectExist = recordVideoPage.isDeleteExist();
        boolean isConcatExist = recordVideoPage.isConcatExist();

       Assert.assertEquals(false,isConcatExist,"未录制时不显示提交按钮");
       Assert.assertEquals(false,isDelectExist,"未录制时不显示删除按钮");

        Thread.sleep(4000);//有一个toast。要等这个王八蛋消失了才可以点击录制
        recordVideoPage.click_record();
        Thread.sleep(3000);
        recordVideoPage.click_record();

        boolean isDelectExist1 = recordVideoPage.isDeleteExist();
        boolean isConcatExist1 = recordVideoPage.isConcatExist();

       Assert.assertEquals(true,isConcatExist1,"录制后显示提交按钮");
       Assert.assertEquals(true,isDelectExist1,"录制后显示删除按钮");

    }

    @Stories("录制视频动态")
    @Title("删除已录制的视频")
    @Test
    public void test_delete(){
        recordVideoPage.click_delete();
//        boolean is = recordVideoPage.isRecord();
//       Assert.assertEquals(is,false,"点击删除按钮删除已经录制的视频");
    }

    @Stories("录制视频动态")
    @Title("点击录制页面的文件夹")
    @Test
    public void test_click_folder(){
        recordVideoPage.click_open_folder();
//        System.out.println(driver.currentActivity());
//       Assert.assertEquals(".ui.ImageGridActivity",driver.currentActivity(),"点击录制节目的问文件夹按钮，进入到文件选择页面");
        DriverCommon.back(driver);
    }

    @Stories("录制视频动态")
    @Title("选择本地视频")
    @Test
    public void test_local_video(){
        recordVideoPage.selectLocalVideo();
//       Assert.assertEquals(".shortvideo.ShortVideoUploadActivity",driver.currentActivity(),"进入发布视频页面");
//        System.out.println(driver.currentActivity());
    }

    @Stories("录制视频动态")
    @Title("发布本地视频")
    @Test
    public void test_upload_local_video(){
        uploadVideoPage = new UploadVideoPage(driver);
        uploadVideoPage.add_content("test123");
        uploadVideoPage.click_upload();
//        boolean isDialog_progressbar = uploadVideoPage.isDialog_progressbarExit();
//       Assert.assertEquals(true,isDialog_progressbar,"点击上传后弹窗进度条");
//
//        boolean isOkDialog = uploadVideoPage.isOkExit();
//       Assert.assertEquals(true,isOkDialog,"上传成功后弹窗上传成功");
//        String title = uploadVideoPage.get_ok_title();
//       Assert.assertEquals("上传成功",title,"检查上传成功的弹窗文案：上传成功");
        uploadVideoPage.click_ok();
//       Assert.assertEquals(".ui.MainActivity",driver.currentActivity(),"点击我知道了，返回到主页面");
    }

    @Stories("录制视频动态")
    @Title("发布录制的视频")
    @Test
    public void test_upload_video() throws InterruptedException {
        hotPage.click_publsh();
        hotPage.click_publisc_vedio();
        Thread.sleep(4000);//有一个toast。要等这个王八蛋消失了才可以点击录制
        recordVideoPage.click_record();
        Thread.sleep(5000);
        recordVideoPage.click_record();
        Thread.sleep(1000);
        recordVideoPage.click_record();
        Thread.sleep(3000);
        recordVideoPage.click_record();
        recordVideoPage.click_concat();
        uploadVideoPage.add_content("test1235");
        uploadVideoPage.click_upload();

//        boolean isDialog_progressbar = uploadVideoPage.isDialog_progressbarExit();
//       Assert.assertEquals(true,isDialog_progressbar,"点击上传后弹窗进度条");

        String title = uploadVideoPage.get_ok_title();
       Assert.assertEquals("上传成功",title,"检查上传成功的弹窗文案：上传成功");
        uploadVideoPage.click_ok();
//       Assert.assertEquals(".ui.MainActivity",driver.currentActivity(),"点击我知道了，返回到主页面");
    }

    @AfterClass
    public void teardown(){
//        driver.quit();
//        driver.closeApp();
    }
}
