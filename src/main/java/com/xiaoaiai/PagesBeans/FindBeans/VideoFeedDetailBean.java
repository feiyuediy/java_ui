package com.xiaoaiai.PagesBeans.FindBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;

import com.lazy.bean.BaseBean;

import com.lazy.controls.Button;
import com.lazy.controls.EditText;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;


public class VideoFeedDetailBean extends BaseBean {

    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/lvdui_image_header']")
    @Description(description="")
    public ImageView headImg;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvdui_tv_name']")
    @Description(description="Vivi")
    public  TextView  name;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvdui_tv_level']")
    @Description(description="3")
    public  TextView  level;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/lvdui_img_gender']")
    @Description(description="")
    public  ImageView  genderImg;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvdui_tv_value']")
    @Description(description="26280")
    public  TextView  tv_value;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/lvdui_img_follow']")
    @Description(description="")
    public  ImageView  followImg;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/lvdui_img_close']")
    @Description(description="")
    public  ImageView  close;

    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/play_img']")
    @Description(description="")
    public  ImageView  play;

    @Android(xpath="//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/lvfdh_layout_gift_title']/android.view.View[1]")
    @Description(description="")
    public  ImageView  view5;


    @Android(xpath="//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/lvfdh_layout_gift_title']/android.widget.ImageView[1]")
    @Description(description="")
    public  ImageView  imageView6;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvfdh_tv_get_gift_total']")
    @Description(description="收到礼物（2）")
    public  TextView  textView2;


    @Android(xpath="//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/lvfdh_layout_gift_title']/android.view.View[2]")
    @Description(description="")
    public  ImageView  view7;


    @Android(xpath="//android.widget.GridView[@resource-id='com.zkj.guimi:id/lvfdh_gv_gift']")
    @Description(description="")
    public  ImageView  gridView8;


    @Android(xpath="//android.widget.GridView[@resource-id='com.zkj.guimi:id/lvfdh_gv_gift']/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]")
    @Description(description="")
    public  ImageView  imageView9;


    @Android(xpath="//android.widget.GridView[@resource-id='com.zkj.guimi:id/lvfdh_gv_gift']/android.widget.RelativeLayout[1]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")
    @Description(description="")
    public  ImageView  gift_list_headImg;


    @Android(xpath="//android.widget.GridView[@resource-id='com.zkj.guimi:id/lvfdh_gv_gift']/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]")
    @Description(description="")
    public  ImageView  imageView11;


    @Android(xpath="//android.widget.GridView[@resource-id='com.zkj.guimi:id/lvfdh_gv_gift']/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.ImageView[2]")
    @Description(description="")
    public  ImageView  moreGift;


    @Android(xpath="//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/layout_label_time']/android.view.View[1]")
    @Description(description="")
    public  ImageView  view13;


    @Android(xpath="//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/layout_label_time']/android.widget.ImageView[1]")
    @Description(description="")
    public  ImageView  imageView14;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/timestamp' and @text='08月18日 14:33']")
    @Description(description="08月18日 14:33")
    public  TextView  feedTime;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/report']")
    @Description(description="举报")
    public  TextView  report;



    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/iv_gift']")
    @Description(description="")
    public  ImageView  giftImg;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv_gift']")
    @Description(description="2")
    public  TextView  giftNum;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/iv_like']")
    @Description(description="")
    public  ImageView  likeImg;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv_like']")
    @Description(description="1")
    public  TextView  likeNum;


    @Android(xpath="//android.widget.LinearLayout[@resource-id='com.zkj.guimi:id/other']/android.widget.ImageView[3]")
    @Description(description="")
    public  TextView  commentImg;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv_comment']")
    @Description(description="1")
    public  TextView  commentNUM;


    @Android(xpath="//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/scroll']/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.view.View[1]")
    @Description(description="")
    public  TextView  view19;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/name']")
    @Description(description="156大哥")
    public  TextView  textView8;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/comment']")
    @Description(description="妈呀")
    public  TextView  textView9;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/timestamp' and @text='08月21日 10:52']")
    @Description(description="08月21日 10:52")
    public  TextView  textView10;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvdui_tv_name']")
    @Description(description="sina")
    public  TextView  textView11;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvdui_tv_level']")
    @Description(description="9")
    public  TextView  textView12;



    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/lvdui_tv_value']")
    @Description(description="2202731")
    public  TextView  textView13;



    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/avfd_img_gift']")
    @Description(description="")
    public  ImageView  giveGiftImg;


    @Android(xpath="//android.widget.EditText[@resource-id='com.zkj.guimi:id/edit_text']")
    @Description(description="")
    public EditText commontEdit;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/edit_hint']")
    @Description(description="")
    public  TextView  textView14;


    @Android(xpath="//android.widget.Button[@resource-id='com.zkj.guimi:id/avfd_btn_comment']")
    @Description(description="评论")
    public Button commontButton;


    public VideoFeedDetailBean(MacacaClient aDriver){super(aDriver);}

}