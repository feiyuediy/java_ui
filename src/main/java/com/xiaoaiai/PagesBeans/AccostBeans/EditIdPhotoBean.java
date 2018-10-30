package com.xiaoaiai.PagesBeans.AccostBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;

import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;


public class EditIdPhotoBean extends BaseBean {


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
    @Description(description="ID照上传")
    public  TextView  textView1;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']")
    @Description(description="")
   public ImageView  imageView4;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_left']")
    @Description(description="返回")
    public  TextView  textView2;


    @Android(xpath="//android.widget.ScrollView")
    @Description(description="")
   public ImageView  scrollView5;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/aeip_img']")
    @Description(description="")
   public ImageView  imageView6;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_tip']")
    @Description(description="审核通过")
    public  TextView  textView3;


    @Android(xpath="//android.view.View[@resource-id='com.zkj.guimi:id/aeip_divid_line']")
    @Description(description="")
   public ImageView  view7;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_upload_tip_1']")
    @Description(description="1. 照片内必须显示当前爱爱号；")
    public  TextView  textView4;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_upload_tip_2']")
    @Description(description="2. 须展示清晰的头部或其他身体部位；")
    public  TextView  textView5;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_upload_tip_3']")
    @Description(description="3. 不得盗用他人图片，或上传露点及其他违规内容；")
    public  TextView  textView6;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_upload_tip_4']")
    @Description(description="4. ID照需经过人工审核，以审核结果为准；")
    public  TextView  textView7;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_upload_tip_5']")
    @Description(description="5. 审核通过后可以更新您的ID照。")
    public  TextView  textView8;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/aeip_upload_photo_tv']")
    @Description(description="更新ID照")
    public  TextView  textView9;




    public EditIdPhotoBean(MacacaClient aDriver){super(aDriver);}

}