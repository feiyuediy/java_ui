package com.xiaoaiai.doctorCriclePages.LoginPages;

import com.xiaoaiai.doctorCriclePagesBeans.LoginBeans.LoginBean;
import macaca.client.MacacaClient;

public class LoginPage {
    private MacacaClient macacaClient;
    private LoginBean loginBean;

    public LoginPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        loginBean = new LoginBean(macacaClient);
    }

    //登录
    public void login(String acc, String pwd){
        loginBean.phone_numer_edit.input(acc);
        loginBean.password_edit.input(pwd);
        loginBean.login_btn.click();
    }
}
