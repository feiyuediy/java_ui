package xiaoaiai.Login;

import com.xiaoaiai.Moudle.Account;
import com.xiaoaiai.Moudle.BaseCase;
import com.xiaoaiai.Pages.LoginPages.LoginPage;
import com.xiaoaiai.Pages.LoginPages.StarupPage;
import com.xiaoaiai.Utils.DriverCommon;
import com.xiaoaiai.Utils.GetResources;
import macaca.client.MacacaClient;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class LoginTest extends BaseCase {
    private LoginPage loginPage;
    private Logger logger = Logger.getLogger(Logger.class);
    private MacacaClient driver;
    private Account account;

    @BeforeClass
    public void setup() throws FileNotFoundException {
        driver = DriverCommon.getDriver(port1,udid1);
        account = GetResources.getAccout(evn, "g", "y");
    }
    @Test
    public void login() throws Exception {

        //启动页点击登录
        StarupPage starupPage = new StarupPage(driver);
        starupPage.click_login();
        //登录
        loginPage = new LoginPage(driver);
        loginPage.login(account.getAcc(), "2324234");
        boolean toast = DriverCommon.findToast(driver,"账号或密码错误1");
        logger.info("toast:" + toast);
        //退出登录
        loginPage.quitLogin();
    }

    @Test
    public void QQlogin() throws Exception {
        loginPage.QQlogin();
        //退出登录
        loginPage.quitLogin();
    }

    @Test
    public void weiChatLogin() throws Exception {
        loginPage.weiChatLogin();

        //退出登录
        loginPage.quitLogin();
    }

    @Test
    public void weiboLogin() throws Exception {
        loginPage.weiboLogin();
        //退出登录
        loginPage.quitLogin();
    }

}
