package com.xiaoaiai.PagesBeans.LoginBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.Button;
import com.xiaoaiai.Moudle.BaseCase;
import macaca.client.MacacaClient;

public class QQloginBean extends BaseBean{

    @Android(xpath = "//android.widget.Button[@resource-id='com.tencent.mobileqq:id/name']")
    @IOS(name  = "")
    @Description(description="登录按钮")
    public Button login;

    public QQloginBean(MacacaClient macacaClient){
        super(macacaClient);
    }
}
