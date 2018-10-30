package com.xiaoaiai.PagesBeans.NewsBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class ContactBean extends BaseBean{
    @Android(xpath = "//android.widget.TextView[@text='输入用户昵称或者爱爱号搜索']")
    @IOS(name  = "")
    @Description(description="搜索")
    public TextView seach;

    @Android(xpath = "//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt' and @text='我的关注']")
    @IOS(name  = "")
    @Description(description="我的关注")
    public TextView my_attontion;

    @Android(xpath = "//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt' and @text='我的粉丝']")
    @IOS(name  = "")
    @Description(description="我的粉丝")
    public TextView my_fans;

    @Android(xpath = "//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt' and @text='黑名单']")
    @IOS(name  = "")
    @Description(description="黑名单")
    public TextView my_black_list;


    public ContactBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
