package com.xiaoaiai.PagesBeans.FindBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;

import com.lazy.bean.BaseBean;
import com.lazy.controls.EditText;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;


public class UploadVideoBean extends BaseBean {


    @Android(xpath="//android.widget.FrameLayout[1]/android.view.View[1]")
    @Description(description="")
    public ImageView view1;


    @Android(xpath="//android.widget.VideoView")
    @Description(description="")
    public ImageView  videoView2;


    @Android(xpath="//android.widget.ScrollView")
    @Description(description="")
    public ImageView  scrollView3;


    @Android(xpath="//android.widget.FrameLayout[@resource-id='com.zkj.guimi:id/video']/android.view.View[1]")
    @Description(description="")
    public ImageView  view4;


    @Android(xpath="//android.widget.EditText[@resource-id='com.zkj.guimi:id/asp_et_video_content']")
    @Description(description="说点什么吧...")
    public EditText video_content;


    @Android(xpath="//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/asp_root_view']/android.view.View[1]")
    @Description(description="")
    public ImageView  view5;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/asp_tv_back']")
    @Description(description="返回")
    public  TextView  back;


    @Android(xpath="//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/asp_layout_bottom']/android.view.View[1]")
    @Description(description="")
    public ImageView  view6;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/asp_img_mix_music']")
    @Description(description="")
    public ImageView  mix_music;


    @Android(xpath="//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/asp_layout_bottom']/android.view.View[2]")
    @Description(description="")
    public ImageView  view8;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/asp_img_cut']")
    @Description(description="")
    public ImageView  img_cut;


    @Android(xpath="//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/asp_layout_bottom']/android.view.View[3]")
    @Description(description="")
    public ImageView  view10;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/asp_tv_upload']")
    @Description(description="上传")
    public  TextView  upload;

    @Android(xpath="//android.widget.ProgressBar[@resource-id='com.zkj.guimi:id/dialog_progressbar']")
    @Description(description="上传进度条")
    public  TextView  dialog_progressbar;

    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/dc_dialog_txt_content']")
    @Description(description="")
    public  TextView  dc_dialog_txt_content;

    @Android(xpath="//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']")
    @Description(description="")
    public  TextView  dc_dialog_btn_ok;


    public UploadVideoBean(MacacaClient aDriver){super(aDriver);}

}