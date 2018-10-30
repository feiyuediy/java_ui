package com.xiaoaiai.PagesBeans.FindBeans;
import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;


public class PreviewVideoBean extends BaseBean {



    @Android(xpath="//android.view.View[@resource-id='android:id/action_bar_overlay_layout']")
    @Description(description="")
    public ImageView view2;


    @Android(xpath="//android.view.View[@resource-id='android:id/action_bar']")
    @Description(description="")
    public ImageView  view3;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']")
    @Description(description="视频预览")
    public TextView title;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']")
    @Description(description="")
    public ImageView  imageView4;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']")
    @Description(description="视频")
    public  TextView  back;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']")
    @Description(description="确定")
    public  TextView  sure;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/CoverView']")
    @Description(description="")
    public ImageView  imageView5;


    @Android(xpath="//android.widget.FrameLayout[@resource-id='com.zkj.guimi:id/VideoView']/android.view.View[1]")
    @Description(description="")
    public ImageView  view6;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/avp_play_btn']")
    @Description(description="")
    public ImageView  play;

    public PreviewVideoBean(MacacaClient aDriver){super(aDriver);}

}