package com.xiaoaiai.PagesBeans.MineBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class ReportBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(name  = "")
    @Description(description="返回")
    public TextView back;

    @Android(id = "com.zkj.guimi:id/txt_title")
    @IOS(name  = "")
    @Description(description="标题")
    public TextView txt_title;

    @Android(xpath = "//android.widget.TextView[@text='色情']")
    @IOS(name  = "")
    @Description(description="色情")
    public TextView pornographic;

    @Android(xpath = "//android.widget.TextView[@text='广告骚扰']")
    @IOS(name  = "")
    @Description(description="广告骚扰")
    public TextView advertisingHarassment;

    @Android(xpath = "//android.widget.TextView[@text='欺诈']")
    @IOS(name  = "")
    @Description(description="欺诈")
    public TextView cheat;

    @Android(xpath = "//android.widget.TextView[@text='违法（恐怖，违禁品）']")
    @IOS(name  = "")
    @Description(description="违法（恐怖，违禁品）")
    public TextView illegal;

    @Android(id = "//android.widget.TextView[@text='政治敏感']")
    @IOS(name  = "")
    @Description(description="政治敏感")
    public TextView politicalSensitivities;


    public ReportBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
