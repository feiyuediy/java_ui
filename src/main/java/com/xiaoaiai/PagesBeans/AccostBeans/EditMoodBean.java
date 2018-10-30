package com.xiaoaiai.PagesBeans.AccostBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;

import com.lazy.bean.BaseBean;
import com.lazy.controls.EditText;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;


public class EditMoodBean extends BaseBean {


    @Android(xpath="//android.widget.FrameLayout[1]/android.view.View[1]")
    @Description(description="")
   public ImageView view1;


    @Android(xpath="//android.view.View[@resource-id='android:id/action_bar_overlay_layout']")
    @Description(description="")
   public ImageView  view2;


    @Android(xpath="//android.view.View[@resource-id='android:id/action_bar']")
    @Description(description="")
   public ImageView  view3;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']")
    @Description(description="心情宣言")
    public  TextView  textView1;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']")
    @Description(description="")
   public ImageView  imageView4;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']")
    @Description(description="返回")
    public  TextView  back;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_right']")
    @Description(description="保存")
    public  TextView  save;


    @Android(xpath="//android.widget.EditText[@resource-id='com.zkj.guimi:id/mood']")
    @Description(description="肥过快。家这")
    public EditText editText1;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_num']")
    @Description(description="6/20字")
    public  TextView  textView4;




    public EditMoodBean(MacacaClient aDriver){super(aDriver);}

}