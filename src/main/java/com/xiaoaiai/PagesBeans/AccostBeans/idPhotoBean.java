package com.xiaoaiai.PagesBeans.AccostBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;

import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;


public class idPhotoBean extends BaseBean {


    @Android(xpath="//android.widget.TextView[@text='最近在线']")
    @Description(description="最近在线")
    public TextView textView1;




    @Android(xpath="//android.widget.TextView[@text='最近注册']")
    @Description(description="最近注册")
    public  TextView  newReght;



    @Android(xpath="//android.widget.TextView[@text='最近更新']")
    @Description(description="最近更新")
    public  TextView  newUpdata;



    @Android(xpath="//android.widget.TextView[@text='今日热门']")
    @Description(description="今日热门")
    public  TextView  todatHot;



    @Android(xpath="//android.widget.TextView[@text='粉丝红人']")
    @Description(description="粉丝红人")
    public  TextView  funRed;


    @Android(xpath="//android.widget.TextView[@text='爱天使']")
    @Description(description="爱天使")
    public  TextView  loveAngle;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']")
    @Description(description="搭讪")
    public  TextView  title;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']")
    @Description(description="上传")
    public  TextView  upload;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_right_2']")
    @Description(description="最近在线")
    public  TextView  rightTable;




    @Android(xpath="//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.TextView[1]' and @text='asd2']")
    @Description(description="asd2")
    public  TextView  firstName;


    @Android(xpath="//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
    @Description(description="")
    public ImageView isFun;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/liip_favourite_num' and @text='23']")
    @Description(description="23")
    public  TextView  fristfunNum;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/liip_photo']")
    @Description(description="")
    public  ImageView  fristidPhtot;


    @Android(xpath="//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]")
    @Description(description="")
    public  ImageView  imageView11;


    @Android(xpath="//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[2]/android.widget.ImageView[1]")
    @Description(description="")
    public  ImageView  imageView12;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/liip_name_tv' and @text='Vivi']")
    @Description(description="Vivi")
    public  TextView  textView6;


    @Android(xpath="//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.RelativeLayout[3]/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
    @Description(description="")
    public  ImageView  imageView13;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/liip_favourite_num' and @text='19']")
    @Description(description="19")
    public  TextView  textView7;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/fa_id_photo']")
    @Description(description="ID照")
    public  TextView  idPhotoTabe;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/fc_tv_group']")
    @Description(description="心情")
    public  TextView  moodTable;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/fm_tv_top_list']")
    @Description(description="榜单")
    public  TextView  chartsTable;


    @Android(xpath="//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_0']/android.view.View[1]")
    @Description(description="")
    public  ImageView  view14;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_0']")
    @Description(description="")
    public  ImageView  imageView15;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_0']")
    @Description(description="搭讪")
    public  TextView  textView11;



    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_1']")
    @Description(description="发现")
    public  TextView  foundTable;




    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_2']")
    @Description(description="消息")
    public  TextView  newsTable;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_3']")
    @Description(description="约跳")
    public  TextView  yueTable;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_4']")
    @Description(description="我")
    public  TextView  mineTable;




    public idPhotoBean(MacacaClient aDriver){super(aDriver);}

}