package com.xiaoaiai.PagesBeans.FindBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;

import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;


public class LoadVideoBean extends BaseBean {



    @Android(xpath="//android.view.View[@resource-id='android:id/action_bar_overlay_layout']")
    @Description(description="")
    public ImageView view2;


    @Android(xpath="//android.view.View[@resource-id='android:id/action_bar']")
    @Description(description="")
    public ImageView  view3;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']")
    @Description(description="视频")
    public TextView title;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']")
    @Description(description="")
    public ImageView  icon_left;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']")
    @Description(description="返回")
    public  TextView  back;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']")
    @Description(description="取消")
    public  TextView  cancle;


    @Android(xpath="//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']")
    @Description(description="")
    public ImageView  gridView5;


    @Android(xpath="//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]")
    @Description(description="")
    public ImageView  fristVideo;


    @Android(xpath="//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")
    @Description(description="")
    public ImageView  imageView7;


    @Android(xpath="//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
    @Description(description="")
    public ImageView  imageView8;


    @Android(id="com.zkj.guimi:id/chatting_length_iv")
    @Description(description="时间")
    public  TextView  time;


    @Android(xpath="//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]")
    @Description(description="")
    public ImageView  seccVideo;


    @Android(xpath="//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")
    @Description(description="")
    public ImageView  imageView10;


    @Android(xpath="//android.widget.GridView[@resource-id='com.zkj.guimi:id/gridView']/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
    @Description(description="")
    public ImageView  imageView11;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/chatting_length_iv' and @text='00:23']")
    @Description(description="00:23")
    public  TextView  textView5;


    //android.widget.FrameLayout[1]/android.view.View[1]/android.widget.FrameLayout[2]/android.widget.GridView[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout[1]/android.widget.TextView[1]
    public LoadVideoBean(MacacaClient aDriver){super(aDriver);}

}