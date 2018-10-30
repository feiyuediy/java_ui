package com.xiaoaiai.Pages.LoginPages;

import com.lazy.exceptions.NoSuchElementException;
import com.xiaoaiai.Pages.AccostPages.AccostPage;
import com.xiaoaiai.Pages.MinePages.MinePage;
import com.xiaoaiai.Pages.MinePages.SettingPage;
import com.xiaoaiai.PagesBeans.AccostBeans.AccostBean;
import com.xiaoaiai.PagesBeans.LoginBeans.LoginBean;
import com.xiaoaiai.PagesBeans.LoginBeans.WeichatLoginBean;
import macaca.client.MacacaClient;
import org.apache.log4j.Logger;


public class LoginPage {
    private LoginBean loginBean;
    private MacacaClient macacaClient;
    private StarupPage starupPage;
    private Logger logger = Logger.getLogger(Logger.class);

    public LoginPage(MacacaClient macacaClient){
        loginBean = new LoginBean(macacaClient);
        this.macacaClient = macacaClient;
    }
    //账号密码登录
    public void login(String acc, String pwd) {
        //点击启动页中的登录按钮
        try{
            starupPage = new StarupPage(macacaClient);
            starupPage.click_login();
        }catch (NoSuchElementException e){
            logger.info("不是从启动页开始的");
        }


        //输入账号和密码
        loginBean.input_username.input(acc);
        loginBean.input_password.input(pwd);
        loginBean.btn_login.click();
    }

    //获取返回按钮的txt
    public String getBackText(){
        return loginBean.back.getText();
    }

    //获取标题
    public String getTitle(){
        return loginBean.txt_title.getText();
    }

    //QQ登录
    public void QQlogin() throws Exception {
        //点击启动页中的登录按钮
        starupPage = new StarupPage(macacaClient);
        starupPage.click_login();
        //点击登录界面中的QQ登录
        loginBean.QQlogin.click();
        //点击QQ登录界面中的登录
        QQloginPage qQloginPage = new QQloginPage(macacaClient);
        qQloginPage.click_login();
    }

    //微信登录
    public void weiChatLogin(){
        loginBean.weichatLogin.click();
        //点击微信登录授权界面的确定登录
        try{
            //首次授权会有，授权之后直接登录
            WeichatLoginBean weichatLoginBean = new WeichatLoginBean(macacaClient);
            weichatLoginBean.login.click();
        }catch (Exception e){

        }

    }

    //微博登录
    public void weiboLogin(){
        loginBean.weiboLogin.click();
    }

    //退出登录
    public void quitLogin()  {
        //进入到我的页面
        AccostPage accostPage = new AccostPage(macacaClient);
        accostPage.go_mine();

        //点击设置进入到设置界面
        MinePage minePage = new MinePage(macacaClient);
        minePage.go_setting();

        //点击退出登录
        SettingPage settingPage = new SettingPage(macacaClient);
        settingPage.click_quit();
    }
}
