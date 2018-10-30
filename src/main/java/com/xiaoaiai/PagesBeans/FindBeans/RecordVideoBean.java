package com.xiaoaiai.PagesBeans.FindBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;

import com.lazy.bean.BaseBean;

import com.lazy.controls.Button;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;


public class RecordVideoBean extends BaseBean {


    @Android(xpath="//android.widget.FrameLayout/android.view.View[1]")
    @Description(description="")
    public ImageView view11;


    @Android(xpath="//android.view.View[@resource-id='com.zkj.guimi:id/preview']")
    @Description(description="")
    public ImageView  view22;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/ar_img_close']")
    @Description(description="")
    public ImageView  close;


    @Android(xpath="//android.widget.ImageButton[@resource-id='com.zkj.guimi:id/switch_camera']")
    @Description(description="")
    public ImageView  switch_camera;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/delete']")
    @Description(description="")
    public ImageView  delete;


    @Android(xpath="//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/ar_layout_bottom_btn']/android.widget.LinearLayout[1]/android.view.View[1]")
    @Description(description="")
    public ImageView  view6;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/ar_img_open_folder']")
    @Description(description="")
    public ImageView  open_folder;


    @Android(xpath="//android.widget.LinearLayout/android.view.View[2]")
    @Description(description="")
    public ImageView  view8;


    @Android(xpath="//android.widget.ToggleButton[@resource-id='com.zkj.guimi:id/record']")
    @Description(description="")
    public ImageView  record;


    @Android(xpath="//android.widget.LinearLayout/android.view.View[3]")
    @Description(description="")
    public ImageView  view10;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/ar_img_hx_effect']")
    @Description(description="")
    public ImageView  hx_effect;


    @Android(xpath="//android.widget.LinearLayout/android.view.View[4]")
    @Description(description="")
    public ImageView  view12;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/concat']")
    @Description(description="")
    public ImageView  concat;


    @Android(xpath="//android.view.View[@resource-id='com.zkj.guimi:id/record_progressbar']")
    @Description(description="")
    public ImageView  record_progressbar;

    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/dc_dialog_txt_content']")
    @Description(description="您正在录制视频， 是否放弃录制？")
    public  TextView  dialog_content;


    @Android(xpath="//android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.view.View[1]")
    @Description(description="")
    public ImageView  view1;


    @Android(xpath="//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_cancel']")
    @Description(description="取消")
    public Button dialog_cancel;


    @Android(xpath="//android.view.View[@resource-id='com.zkj.guimi:id/dc_dialog_view_line_v']")
    @Description(description="")
    public ImageView  view2;


    @Android(xpath="//android.widget.Button[@resource-id='com.zkj.guimi:id/dc_dialog_btn_ok']")
    @Description(description="确定")
    public  Button  dialog_ok;


    public RecordVideoBean(MacacaClient aDriver){super(aDriver);}

}