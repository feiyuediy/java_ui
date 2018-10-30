package xiaoaiai.Mine;

import com.xiaoaiai.Moudle.Account;
import com.xiaoaiai.Moudle.BaseCase;
import com.xiaoaiai.Pages.AccostPages.AccostPage;
import com.xiaoaiai.Pages.LoginPages.LoginPage;
import com.xiaoaiai.Pages.MinePages.AccountEditPage;
import com.xiaoaiai.Pages.MinePages.AccountInfoPage;
import com.xiaoaiai.Pages.MinePages.MinePage;
import com.xiaoaiai.Utils.Command;
import com.xiaoaiai.Utils.Common;
import com.xiaoaiai.Utils.DriverCommon;
import com.xiaoaiai.Utils.GetResources;
import macaca.client.MacacaClient;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.Title;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Features("我的")
public class MineTest extends BaseCase {
    private MacacaClient driver;
    private Account account;
    private AccountInfoPage accountInfoPage;
    private AccountEditPage accountEditPage;
    private static Logger logger = Logger.getLogger(MineTest.class);
    @BeforeClass
    public void setup() throws FileNotFoundException {
        driver = DriverCommon.getDriver(port1,udid1);
        account = GetResources.getAccout(evn, "g", "n");
    }
    @Stories("修改资料")
    @Title("修改头像")
    @Test
    public void modifyHeadImg(){
        //登录
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(account.getAcc(),account.getPwd());

        //进入到我的页面
        AccostPage accostPage = new AccostPage(driver);
        accostPage.go_mine();
        //进入到主人态的个人资料界面
        MinePage minePage = new MinePage(driver);
        minePage.click_head();
        //进入到编辑界面
        accountInfoPage = new AccountInfoPage(driver);
        //获取现在的头像数量
        int photoNum = accountInfoPage.getPhotoNum();
        logger.info("photoNum:" + photoNum);
        //进入到编辑界面
        accountInfoPage.goEdit();
        //增加一张头像
        accountEditPage = new AccountEditPage(driver);
        accountEditPage.addHeadImg();
        accountEditPage.back();
        //返回到主人态的个人账户信息界面，获取当前的头像数量
        int photoNumAfterAdd = accountInfoPage.getPhotoNum();
        logger.info("phototNumAfterAdd:" + photoNumAfterAdd);
        Assert.assertEquals(photoNumAfterAdd - photoNum,1);

        //进入到编辑界面删除最后一张相片
        accountInfoPage.goEdit();
        accountEditPage.deleteHeadImg(photoNumAfterAdd-2);//因为有照片墙这个账号，所以要照片墙中的1张
        accountEditPage.back();

        //返回到主人态的个人账户信息界面，获取当前的头像数量
        int photoNumAfterDelete = accountInfoPage.getPhotoNum();
        logger.info("photoNumAfterDelete:" + photoNumAfterDelete);

        Assert.assertEquals(photoNumAfterDelete ,photoNum);
    }
    @Stories("修改资料")
    @Title("修改昵称")
    @Test
    public void modifyNickName(){
        //进入到编辑的界面
        accountInfoPage.goEdit();
        Random random = new Random();
        int i = random.nextInt(10000);
        String nickName = "昵称df" + String.valueOf(i);
        accountEditPage.modifyNick(nickName);
        accountEditPage.back();

        String modifyAfterNick = accountInfoPage.getNick();

        Assert.assertEquals(nickName,modifyAfterNick);
    }
    @Stories("修改资料")
    @Title("修改地区")
    @Test
    public void moidfyAddr(){
        accountInfoPage.goEdit();

        List<String> addr = new ArrayList<String>();
        addr.add("成都");
        addr.add("北京");
        addr.add("黄山");
        addr.add("深圳");
        addr.add("上海虹桥");
        addr.add("广州");
        addr.add("呼和浩特");
        addr.add("万县");
        addr.add("武夷山");
        addr.add("延安");
        Random random = new Random();
        int i = random.nextInt(9);

        accountEditPage.modifyAddr(addr.get(i));
        String modifyAddr = accountEditPage.getAddr();

        Assert.assertEquals(modifyAddr,addr.get(i));
    }

    @Stories("修改资料")
    @Title("修改年龄和星座")
    @Test
    public void modifyAge(){
        String year = "1979";
        String mony = "6";
        String day = "29";

        accountEditPage.modifyAge(year, mony, day);
        int age = Common.getAge(year, mony, day);
        int ageAfterModify = Integer.valueOf(accountEditPage.getAge());

        String constellation = Common.getConstellation(Integer.valueOf(mony),Integer.valueOf(day));
        String constellationAfterModify = accountEditPage.getConstellation();

        Assert.assertEquals(age,ageAfterModify);
        Assert.assertEquals(constellation,constellationAfterModify);
    }

}
