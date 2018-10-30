package com.xiaoaiai.PagesBeans.AccostBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class AccostBean extends BaseBean {

    @Android(name = "ID照")
    @IOS(name  = "")
    @Description(description="ID照")
    public TextView idPhoto;

    @Android(name = "心情")
    @IOS(name  = "")
    @Description(description="心情")
    public TextView mood;

    @Android(name = "榜单")
    @IOS(name  = "")
    @Description(description="榜单")
    public TextView list;

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



    public AccostBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
