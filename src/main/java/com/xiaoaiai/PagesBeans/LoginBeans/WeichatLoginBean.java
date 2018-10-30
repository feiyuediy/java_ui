package com.xiaoaiai.PagesBeans.LoginBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.Button;
import macaca.client.MacacaClient;

public class WeichatLoginBean extends BaseBean {
    @Android(id = "com.tencent.mm:id/bw7")
    @IOS(name  = "")
    @Description(description="微信登录")
    public Button login;


    public WeichatLoginBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
