package com.xiaoaiai.PagesBeans.NewsBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class NewsBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/icon_left")
    @IOS(name  = "")
    @Description(description="公告")
    public ImageView icon_left;

    @Android(id = "com.zkj.guimi:id/icon_right")
    @IOS(name  = "")
    @Description(description="icon_right")
    public ImageView icon_right;

    @Android(xpath = "//android.widget.LinearLayout/android.widget.TextView[1]")
    @IOS(name  = "")
    @Description(description="消息tab")
    public TextView new_tab;

    @Android(xpath = "//android.widget.TextView[@text='群组']")
    @IOS(name  = "")
    @Description(description="群組tab")
    public TextView group_tab;

    @Android(xpath = "//android.widget.TextView[@text='联系人']")
    @IOS(name  = "")
    @Description(description="联系人tab")
    public TextView contact_tab;


    @Android(id = "com.zkj.guimi:id/animation_image_0")
    @IOS(name  = "")
    @Description(description="搭讪tab")
    public ImageView accost_tab;

    @Android(id = "com.zkj.guimi:id/animation_image_1")
    @IOS(name  = "")
    @Description(description="发现tab")
    public ImageView find_tab;

    @Android(id = "com.zkj.guimi:id/animation_image_3")
    @IOS(name  = "")
    @Description(description="DIDItab")
    public ImageView didi_tab;

    @Android(id = "com.zkj.guimi:id/animation_image_2")
    @IOS(name  = "")
    @Description(description="消息tab")
    public ImageView news_tab;

    @Android(id = "com.zkj.guimi:id/animation_image_4")
    @IOS(name  = "")
    @Description(description="我的tab")
    public ImageView mine_tab;

    public NewsBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
