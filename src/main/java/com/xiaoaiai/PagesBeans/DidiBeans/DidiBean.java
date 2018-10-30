package com.xiaoaiai.PagesBeans.DidiBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class DidiBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(id = "")
    @Description(description="接单设置")
    public TextView setting;

    @Android(id = "com.zkj.guimi:id/txt_title")
    @IOS(id = "")
    @Description(description="标题")
    public TextView title;

    @Android(id = "com.zkj.guimi:id/txt_right")
    @IOS(id = "")
    @Description(description="帮助")
    public TextView help;

    @Android(name = "互粉")
    @IOS(id = "")
    @Description(description="互粉tab")
    public TextView follow_tab;


    @Android(xpath = "//android.widget.TextView[@text='语音']")
    @IOS(id = "")
    @Description(description="语音tab")
    public TextView voice_tab;


    @Android(xpath = "//android.widget.TextView[@text='视频']")
    @IOS(id = "")
    @Description(description="视频tab")
    public TextView video_tab;


    @Android(xpath = "//android.widget.TextView[@text='约跳']")
    @IOS(id = "")
    @Description(description="约跳tab")
    public TextView yuetiao_tab;


    @Android(xpath = "//android.widget.TextView[@text='卧底']")
    @IOS(id = "")
    @Description(description="卧底tab")
    public TextView wodi_tab;


    @Android(id = "com.zkj.guimi:id/fdcb_img_desc")
    @IOS(id = "")
    @Description(description="描述图片")
    public ImageView fdcb_img_desc;

    @Android(id = "com.zkj.guimi:id/ldcv_row_1_tv")
    @IOS(id = "")
    @Description(description="接单价格")
    public TextView price;

    @Android(id = "com.zkj.guimi:id/ldcv_row_3_tv")
    @IOS(id = "")
    @Description(description="互粉等级刷选")
    public TextView levlePick;

    @Android(id = "com.zkj.guimi:id/fdcb_tv_didi")
    @IOS(id = "")
    @Description(description="滴一下")
    public ImageView di;

    @Android(id = "com.zkj.guimi:id/ldcv_row_2_left_tv")
    @IOS(id = "")
    @Description(description="额外打赏")
    public TextView extraReward;

    @Android(id = "com.zkj.guimi:id/ldcv_row_2_right_tv")
    @IOS(id = "")
    @Description(description="捎话")
    public TextView takeMsg;

    @Android(id = "com.zkj.guimi:id/dc_dialog_txt_title")
    @IOS(id = "")
    @Description(description="收费弹窗title")
    public TextView dc_dialog_txt_title;

    @Android(id = "com.zkj.guimi:id/dc_dialog_btn_ok")
    @IOS(id = "")
    @Description(description="收费弹窗_我知道了")
    public TextView dc_dialog_btn_ok;

    @Android(id = "com.zkj.guimi:id/btnSubmit")
    @IOS(id = "")
    @Description(description="设置额外打赏中的完成")
    public TextView btnSubmit;

    public DidiBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
