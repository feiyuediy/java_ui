package com.xiaoaiai.Pages.LoginPages;

import com.xiaoaiai.PagesBeans.LoginBeans.QQloginBean;
import macaca.client.MacacaClient;

public class QQloginPage {
    private MacacaClient macacaClient;
    private QQloginBean qQloginBean;

    public QQloginPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        qQloginBean = new QQloginBean(macacaClient);
    }

    //点击登录按钮
    public void click_login() throws Exception {
        qQloginBean.login.click();
    }
}
