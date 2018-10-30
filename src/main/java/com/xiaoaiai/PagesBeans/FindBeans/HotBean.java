package com.xiaoaiai.PagesBeans.FindBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;


public class HotBean extends BaseBean {

    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']")
    @Description(description="发现")
    public TextView title;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_left']")
    @Description(description="")
    public ImageView icon_left;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/icon_right']")
    @Description(description="")
    public  ImageView  icon_right;


    @Android(xpath="//android.support.v4.view.ViewPager[@resource-id='com.zkj.guimi:id/adv_viewpager']")
    @Description(description="")
    public  ImageView  banner;




    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/vti_img']")
    @Description(description="")
    public  ImageView  carouselImg;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv1']")
    @Description(description="啊骑单车")
    public  TextView  carouselTopic;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/tv2']")
    @Description(description="企鹅氛围非常")
    public  TextView  carouselDesc;



    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/tbtv']")
    @Description(description="")
    public  ImageView  moreTopics;




    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_name']")
    @Description(description="南海")
    public  TextView  publisherNickName;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/level']")
    @Description(description="8")
    public  TextView  publisherLevel;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_img_gender']")
    @Description(description="")
    public  ImageView  publisherGender;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_img_device_state']")
    @Description(description="")
    public  ImageView  publishDevice;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_img_signature_audio']")
    @Description(description="")
    public  ImageView  publishSignature;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_num_1']")
    @Description(description="115295")
    public  TextView  publishAfNum1;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_num_2']")
    @Description(description="282048")
    public  TextView  publishAfNum2;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_img_upest']")
    @Description(description="")
    public ImageView  upestTag;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_img_hot']")
    @Description(description="")
    public ImageView  hotTag;


    @Android(xpath="//android.view.View[@resource-id='com.zkj.guimi:id/af_divider_line']")
    @Description(description="")
    public ImageView  view25;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_content']")
    @Description(description="阿萨德的发反反复复")
    public  TextView  content;


    @Android(xpath="//android.view.View[@resource-id='com.zkj.guimi:id/pic_container']")
    @Description(description="")
    public ImageView  pic_container;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/ldnt_tv_recommend_title']")
    @Description(description="热门")
    public  TextView  hot;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/ldnt_tv_theme_title']")
    @Description(description="视频")
    public  TextView  video;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/ldnt_tv_newest_title']")
    @Description(description="关注")
    public  TextView  follow;


    @Android(xpath="//android.view.View[@resource-id='com.zkj.guimi:id/fa_divider_line']")
    @Description(description="")
    public ImageView  view27;


    @Android(xpath="//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_0']/android.view.View[1]")
    @Description(description="")
    public ImageView  view28;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_0']")
    @Description(description="")
    public ImageView  imageView29;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_0']")
    @Description(description="搭讪")
    public  TextView  accost;


    @Android(xpath="//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_1']/android.view.View[1]")
    @Description(description="")
    public ImageView  view30;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_1']")
    @Description(description="")
    public ImageView  imageView31;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_1']")
    @Description(description="发现")
    public  TextView  find;


    @Android(xpath="//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_2']/android.view.View[1]")
    @Description(description="")
    public ImageView  view32;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_2']")
    @Description(description="")
    public ImageView  imageView33;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_2']")
    @Description(description="消息")
    public  TextView  news;


    @Android(xpath="//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_3']/android.view.View[1]")
    @Description(description="")
    public ImageView  view34;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_3']")
    @Description(description="")
    public ImageView  imageView35;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_3']")
    @Description(description="约跳")
    public  TextView  yuetiao;


    @Android(xpath="//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/tab_4']/android.view.View[1]")
    @Description(description="")
    public ImageView  view36;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/image_4']")
    @Description(description="")
    public ImageView  imageView37;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/text_4']")
    @Description(description="我")
    public  TextView  mine;




    @Android(xpath="//android.view.View[@resource-id='com.zkj.guimi:id/pic_container']")
    @Description(description="")
    public ImageView  view15;

    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_image_header']")
    @Description(description="")
    public ImageView  headImg;

    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_label']")
    @Description(description="#呵呵哒#")
    public  TextView  topicTag;


    @Android(xpath="//android.widget.RelativeLayout/android.widget.ImageView[8]")
    @Description(description="")
    public ImageView  imageView16;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_feeds_time']")
    @Description(description="06月01日 14:22")
    public  TextView  feedTime;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_report']")
    @Description(description="举报")
    public  TextView  report;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_zan_vip_1']")
    @Description(description="")
    public ImageView  imageView17;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_image_zan_1']")
    @Description(description="")
    public ImageView  zan_imgHead1;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_zan_vip_2']")
    @Description(description="")
    public ImageView  imageView19;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_image_zan_2']")
    @Description(description="")
    public ImageView  zan_imgHead2;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_image_zan_3']")
    @Description(description="")
    public ImageView  imageView21;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_img_zan_more']")
    @Description(description="")
    public ImageView  zan_more;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_img_feeds_zan']")
    @Description(description="")
    public ImageView  zan;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_feeds_zan_num']")
    @Description(description="5")
    public  TextView  zanNum;


    @Android(xpath="//android.widget.ImageView[@resource-id='com.zkj.guimi:id/af_img_feeds_comment']")
    @Description(description="")
    public ImageView  comment;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/af_tv_feeds_comment_num']")
    @Description(description="6")
    public  TextView  commentNum;
    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/video']")
    @Description(description="视频")
    public  TextView  vedioFeed;


    @Android(xpath="//android.view.View")
    @Description(description="")
    public ImageView  view1;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/img_tex']")
    @Description(description="文字/图片")
    public  TextView  textFeed;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/cancel']")
    @Description(description="取消")
    public  TextView  cancel;

    @Android(xpath="//android.widget.TextView[@text='色情']")
    @Description(description="色情")
    public  TextView  pornographic;


    @Android(xpath="//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/dr_layout_sex']/android.widget.ImageView[1]")
    @Description(description="")
    public ImageView  imageView1;


    @Android(xpath="//android.widget.LinearLayout/android.widget.LinearLayout[1]/android.view.View[1]")
    @Description(description="")
    public ImageView  view2;


    @Android(xpath="//android.widget.TextView[@text='欺诈']")
    @Description(description="欺诈")
    public  TextView  cheat;


    @Android(xpath="//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/dr_layout_cheat']/android.widget.ImageView[1]")
    @Description(description="")
    public ImageView  imageView3;


    @Android(xpath="//android.widget.LinearLayout/android.view.View[2]")
    @Description(description="")
    public ImageView  view4;


    @Android(xpath="//android.widget.TextView[@text='广告骚扰']")
    @Description(description="广告骚扰")
    public  TextView  advertisingHarassment;


    @Android(xpath="//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/dr_layout_ads']/android.widget.ImageView[1]")
    @Description(description="")
    public ImageView  imageView5;


    @Android(xpath="//android.widget.LinearLayout/android.view.View[3]")
    @Description(description="")
    public ImageView  view6;


    @Android(xpath="//android.widget.TextView[@text='违法（恐怖，违禁品）']")
    @Description(description="违法（恐怖，违禁品）")
    public  TextView  illegal;


    @Android(xpath="//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/dr_layout_illegal']/android.widget.ImageView[1]")
    @Description(description="")
    public ImageView  imageView7;


    @Android(xpath="//android.widget.LinearLayout/android.view.View[4]")
    @Description(description="")
    public ImageView  view8;


    @Android(xpath="//android.widget.TextView[@text='政治敏感']")
    @Description(description="政治敏感")
    public  TextView  politicallySensitive;


    @Android(xpath="//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/dr_layout_political']/android.widget.ImageView[1]")
    @Description(description="")
    public ImageView  imageView9;


    @Android(xpath="//android.widget.FrameLayout[@resource-id='android:id/content']/android.widget.LinearLayout[1]/android.view.View[1]")
    @Description(description="")
    public ImageView  view10;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/dr_tv_cancel']")
    @Description(description="取消")
    public  TextView  cancelReport;


    @Android(xpath="//android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.View[1]")
    @Description(description="")
    public ImageView  view11;


    @Android(xpath="//android.widget.TextView[@resource-id='com.zkj.guimi:id/dr_tv_confirm']")
    @Description(description="确认举报")
    public  TextView  confirmReport;

    public HotBean(MacacaClient aDriver){super(aDriver);}

}