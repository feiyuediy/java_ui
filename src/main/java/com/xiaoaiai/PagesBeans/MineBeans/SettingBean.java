package com.xiaoaiai.PagesBeans.MineBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class SettingBean extends BaseBean {

    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(name  = "")
    @Description(description="返回")
    public TextView back;

    @Android(id = "com.zkj.guimi:id/txt_title")
    @IOS(name  = "")
    @Description(description="标题")
    public TextView txt_title;


    @Android(xpath = "//android.widget.TextView[@text='退出登录']")
    @IOS(name  = "")
    @Description(description="退出登录")
    public TextView quitLogin;


    public SettingBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
