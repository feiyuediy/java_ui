package com.xiaoaiai.Pages.LoginPages;

import com.xiaoaiai.PagesBeans.LoginBeans.StarupBean;
import macaca.client.MacacaClient;

public class StarupPage {
    private MacacaClient macacaClient;
    private StarupBean starupBean;

    public StarupPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        starupBean = new StarupBean(macacaClient);
    }

    //点击登录按钮
    public void click_login()  {
        starupBean.login.click();
    }

    //点击注册按钮
    public void click_regist()  {
        starupBean.regist.click();
    }
}
