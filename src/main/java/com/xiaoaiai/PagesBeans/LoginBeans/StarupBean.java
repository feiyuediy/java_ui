package com.xiaoaiai.PagesBeans.LoginBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;

import com.lazy.bean.BaseBean;
import com.lazy.controls.Button;

import macaca.client.MacacaClient;


public class StarupBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/btn_register")
    @IOS(name  = "")
    @Description(description="注册")
    public Button regist;

    @Android(xpath = "//android.widget.Button[@resource-id='com.zkj.guimi:id/btn_login']")
    @IOS(name  = "")
    @Description(description="登录")
    public  Button  login;

    public StarupBean(MacacaClient aDriver){super(aDriver);}
}