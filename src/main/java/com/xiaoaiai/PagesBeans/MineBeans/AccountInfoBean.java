package com.xiaoaiai.PagesBeans.MineBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class AccountInfoBean extends BaseBean{
    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(name  = "")
    @Description(description="返回")
    public TextView back;

    @Android(id = "com.zkj.guimi:id/txt_title")
    @IOS(name  = "")
    @Description(description="标题")
    public TextView txt_title;

    @Android(id = "com.zkj.guimi:id/txt_right")
    @IOS(name  = "")
    @Description(description="编辑")
    public TextView edit;

    @Android(xpath = "//android.view.ViewGroup[@resource-id='com.zkj.guimi:id/au_vp_photo']/android.widget.ImageView[1]")
    @IOS(name  = "")
    @Description(description="照片")
    public ImageView au_vp_photo;

    @Android(id = "com.zkj.guimi:id/au_tv_active_time")
    @IOS(name  = "")
    @Description(description="活跃时间")
    public TextView au_tv_active_time;


    @Android(id = "com.zkj.guimi:id/au_img_header")
    @IOS(name  = "")
    @Description(description="头像")
    public ImageView au_img_header;

    @Android(id = "com.zkj.guimi:id/au_tv_name")
    @IOS(name  = "")
    @Description(description="昵称")
    public TextView au_tv_name;

    @Android(id = "com.zkj.guimi:id/au_tv_sex")
    @IOS(name  = "")
    @Description(description="性别")
    public TextView au_tv_sex;

    @Android(id = "com.zkj.guimi:id/au_tv_age")
    @IOS(name  = "")
    @Description(description="年龄")
    public TextView au_tv_age;

    @Android(id = "com.zkj.guimi:id/au_tv_constellation")
    @IOS(name  = "")
    @Description(description="星座")
    public TextView au_tv_constellation;

    @Android(id = "com.zkj.guimi:id/level")
    @IOS(name  = "")
    @Description(description="等级")
    public TextView level;

    @Android(id = "com.zkj.guimi:id/au_img_device_state")
    @IOS(name  = "")
    @Description(description="设备")
    public TextView au_img_device_state;

    @Android(id = "com.zkj.guimi:id/au_tv_charm_value")
    @IOS(name  = "")
    @Description(description="魅力值")
    public TextView au_tv_charm_value;

    @Android(id = "com.zkj.guimi:id/au_tv_wealth_value")
    @IOS(name  = "")
    @Description(description="财富值")
    public TextView au_tv_wealth_value;

    @Android(id = "com.zkj.guimi:id/iuh_tv_visitor")
    @IOS(name  = "")
    @Description(description="访问量")
    public TextView iuh_tv_visitor;

    @Android(id = "com.zkj.guimi:id/iuh_tv_favourite")
    @IOS(name  = "")
    @Description(description="粉丝数量")
    public TextView iuh_tv_favourite;

    @Android(id = "com.zkj.guimi:id/iuh_tv_wealth")
    @IOS(name  = "")
    @Description(description="爱爱豆数量")
    public TextView iuh_tv_wealth;

    @Android(id = "com.zkj.guimi:id/lsn_img_news")
    @IOS(name  = "")
    @Description(description="动态")
    public ImageView lsn_img_news;

    @Android(id = "com.zkj.guimi:id/lsn_view_video")
    @IOS(name  = "")
    @Description(description="视频动态标签")
    public ImageView lsn_view_video;

    @Android(id = "com.zkj.guimi:id/au_layout_news_more_above4")
    @IOS(name  = "")
    @Description(description="更多动态")
    public ImageView au_layout_news_more_above4;

    @Android(id = "ccom.zkj.guimi:id/gift_image_1")
    @IOS(name  = "")
    @Description(description="礼物1")
    public ImageView gift_image_1;

    @Android(id = "ccom.zkj.guimi:id/gift_image_2")
    @IOS(name  = "")
    @Description(description="礼物2")
    public ImageView gift_image_2;

    @Android(id = "ccom.zkj.guimi:id/gift_image_3")
    @IOS(name  = "")
    @Description(description="礼物3")
    public ImageView gift_image_3;

    @Android(id = "ccom.zkj.guimi:id/gift_image_4")
    @IOS(name  = "")
    @Description(description="礼物4")
    public ImageView gift_image_4;


    @Android(id = "com.zkj.guimi:id/au_img_gift_more")
    @IOS(name  = "")
    @Description(description="更多礼物")
    public ImageView au_img_gift_more;

    @Android(id = "com.zkj.guimi:id/au_tv_aiai_num")
    @IOS(name  = "")
    @Description(description="爱爱号")
    public TextView au_tv_aiai_num;

    @Android(id = "com.zkj.guimi:id/au_tv_aiai_addr")
    @IOS(name  = "")
    @Description(description="地区")
    public TextView au_tv_aiai_addr;

    @Android(id = "com.zkj.guimi:id/au_tv_signature")
    @IOS(name  = "")
    @Description(description="签名")
    public TextView au_tv_signature;

    @Android(id = "com.zkj.guimi:id/iul_tv_label1")
    @IOS(name  = "")
    @Description(description="标签")
    public TextView iul_tv_label1;


    public AccountInfoBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
