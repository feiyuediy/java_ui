package com.xiaoaiai.PagesBeans.MineBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class AccountEditBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(name  = "")
    @Description(description="返回")
    public TextView back;

    @Android(id = "com.zkj.guimi:id/txt_title")
    @IOS(name  = "")
    @Description(description="标题")
    public TextView txt_title;

    @Android(id = "com.zkj.guimi:id/api_img_header")
    @IOS(name  = "")
    @Description(description="头像")
    public TextView api_layout_header;

    @Android(id = "//android.widget.TextView[@text='ID照']")
    @IOS(name  = "")
    @Description(description="头像")
    public TextView idphoto;

    @Android(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
    @IOS(name  = "")
    @Description(description="昵称")
    public TextView nickName;

    @Android(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[4]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
    @IOS(name  = "")
    @Description(description="爱爱号")
    public TextView aiaiNum;

    @Android(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[5]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
    @IOS(name  = "")
    @Description(description="性别")
    public TextView sex;

    @Android(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[6]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
    @IOS(name  = "")
    @Description(description="地区")
    public TextView addr;

    @Android(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[7]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
    @IOS(name  = "")
    @Description(description="年龄")
    public TextView age;

    @Android(xpath = "//android.widget.FrameLayout[1]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[8]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[2]")
    @IOS(name  = "")
    @Description(description="星座")
    public TextView constellation;

    @Android(id = "com.zkj.guimi:id/api_tv_signature")
    @IOS(name  = "")
    @Description(description="个性签名")
    public TextView api_tv_signature;

    @Android(id = "   //android.widget.TextView[@text='语音签名']")
    @IOS(name  = "")
    @Description(description="个性签名")
    public TextView voiceSignature;

    @Android(xpath = "//android.widget.TextView[@text='个人标签']")
    @IOS(name  = "")
    @Description(description="个人签名tab")
    public TextView tags;

    public AccountEditBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
