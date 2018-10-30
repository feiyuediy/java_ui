package com.xiaoaiai.PagesBeans.CommonBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;

import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;

import com.lazy.controls.TextView;

import macaca.client.MacacaClient;


public class PhotoSelectBean extends BaseBean {

    @Android(xpath="//android.widget.GridView[@resource-id='com.zkj.guimi:id/photo_choice_grid']/android.widget.FrameLayout[8]/android.widget.ToggleButton[1]")
    @Description(description="")
    public  ImageView  toggleButton21;

    @Android(xpath = "//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']")
    @Description(description="图片")
    public  TextView  textView1;




    @Android(xpath = "//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']")
    @Description(description="返回")
    public TextView textView2;


    @Android(xpath = "//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']")
    @Description(description="确认(0/1)")
    public  TextView  sure;






    @Android(xpath = "//android.widget.TextView[@resource-id='com.zkj.guimi:id/directory_switch']")
    @Description(description="所有图片")
    public  TextView  textView4;


    @Android(xpath = "//android.widget.ImageView[@resource-id='com.zkj.guimi:id/directory_switch_icon']")
    @Description(description="")
    public ImageView imageView36;


    @Android(xpath = "//android.widget.TextView[@resource-id='com.zkj.guimi:id/photo_preview']")
    @Description(description="预览")
    public  TextView  textView5;

    @Android(xpath = "")
    @Description(description="")
    public  ImageView  mySelect;


    public PhotoSelectBean(MacacaClient aDriver){super(aDriver);}

}