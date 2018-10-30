package com.xiaoaiai.PagesBeans.MineBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

import java.awt.font.ImageGraphicAttribute;

//客人态个人资料
public class PersonalInfoBean extends BaseBean{
    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(name  = "")
    @Description(description="返回")
    public TextView back;

    @Android(id = "com.zkj.guimi:id/txt_title")
    @IOS(name  = "")
    @Description(description="标题")
    public TextView txt_title;

    @Android(id = "com.zkj.guimi:id/au_tv_active_time")
    @IOS(name  = "")
    @Description(description="活跃时间")
    public TextView au_tv_active_time;

    @Android(id = "com.zkj.guimi:id/au_tv_name")
    @IOS(name  = "")
    @Description(description="昵称")
    public TextView au_tv_name;

    @Android(id = "com.zkj.guimi:id/au_img_header")
    @IOS(name  = "")
    @Description(description="头像")
    public TextView au_img_header;

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


    @Android(id = "com.zkj.guimi:id/au_tv_wealth_value")
    @IOS(name  = "")
    @Description(description="财富值")
    public TextView au_tv_wealth_value;

    @Android(id = "com.zkj.guimi:id/au_tv_charm_value")
    @IOS(name  = "")
    @Description(description="魅力值")
    public TextView au_tv_charm_value;


    @Android(id = "com.zkj.guimi:id/iuo_img_favourite")
    @IOS(name  = "")
    @Description(description="关注与否图标")
    public ImageView iuo_img_favourite;

    @Android(id = "com.zkj.guimi:id/dg_btn_confirm")
    @IOS(name  = "")
    @Description(description="关注弹窗 中的我知道了")
    public ImageView dg_btn_confirm;

    @Android(id = "com.zkj.guimi:id/iuo_tv_favourite")
    @IOS(name  = "")
    @Description(description="关注数量")
    public TextView iuo_tv_favourite;

    @Android(id = "com.zkj.guimi:id/iuo_tv_black")
    @IOS(name  = "")
    @Description(description="拉黑举报")
    public TextView iuo_tv_black;

    @Android(id = "com.zkj.guimi:id/au_layout_chat")
    @IOS(name  = "")
    @Description(description="聊天按钮")
    public TextView au_layout_chat;

    @Android(xpath = "//android.widget.TextView[@text='视频']")
    @IOS(name  = "")
    @Description(description="视频按钮")
    public TextView iite_voice_call;

    @Android(xpath = "//android.widget.TextView[@text='约跳']")
    @IOS(name  = "")
    @Description(description="约跳")
    public TextView yuetiao;

    @Android(id = "com.zkj.guimi:id/dbp_tv_ban_person")
    @IOS(name  = "")
    @Description(description="弹窗中的拉黑")
    public TextView dbp_tv_ban_person;

    @Android(xpath = "com.zkj.guimi:id/dbp_tv_report")
    @IOS(name  = "")
    @Description(description="弹窗中的举报")
    public TextView dbp_tv_report;

    @Android(xpath = "com.zkj.guimi:id/dbp_tv_cancel")
    @IOS(name  = "")
    @Description(description="弹窗中的取消")
    public TextView dbp_tv_cancel;

    @Android(xpath = "//android.widget.TextView[@resource-id='com.zkj.guimi:id/groupItemTitle' and @text='语音通话']")
    @IOS(name  = "")
    @Description(description="语音通话")
    public TextView voice;

    @Android(xpath = "//android.widget.TextView[@resource-id='com.zkj.guimi:id/groupItemTitle' and @text='视频通话']")
    @IOS(name  = "")
    @Description(description="视频通话")
    public TextView video;

    @Android(id = "com.zkj.guimi:id/dc_dialog_btn_cancel")
    @IOS(name  = "")
    @Description(description="弹窗中的取消")
    public TextView dc_dialog_btn_cancel;


    @Android(id = "com.zkj.guimi:id/dc_dialog_btn_ok")
    @IOS(name  = "")
    @Description(description="弹窗中的确定")
    public TextView dc_dialog_btn_ok;


    @Android(id = "com.zkj.guimi:id/dc_dialog_txt_content")
    @IOS(name  = "")
    @Description(description="弹窗中的文本")
    public TextView dc_dialog_txt_content;

    @Android(id = "com.zkj.guimi:id/dialog_btn_ok")
    @IOS(name  = "")
    @Description(description="取消拉黑中的是")
    public TextView dialog_btn_ok;

    @Android(id = "com.zkj.guimi:id/dialog_btn_cancel")
    @IOS(name  = "")
    @Description(description="取消拉黑弹窗中的否")
    public TextView dialog_btn_cancel;


    public PersonalInfoBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
