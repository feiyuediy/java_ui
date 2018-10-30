package com.xiaoaiai.PagesBeans.AccostBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.Button;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class MoodBean extends BaseBean {

    @Android(id = "com.zkj.guimi:id/avatar")
    @IOS(name  = "")
    @Description(description="头像")
    public ImageView headImg;

    @Android(id = "com.zkj.guimi:id/name")
    @IOS(name  = "")
    @Description(description="昵称")
    public TextView name;

    @Android(id = "com.zkj.guimi:id/level")
    @IOS(name  = "")
    @Description(description="等级")
    public TextView level;

    @Android(id = "com.zkj.guimi:id/gender")
    @IOS(name  = "")
    @Description(description="性别")
    public ImageView gender;

    @Android(id = "com.zkj.guimi:id/mood")
    @IOS(name  = "")
    @Description(description="心情")
    public TextView mood;

    @Android(id = "com.zkj.guimi:id/img_edit")
    @IOS(name  = "")
    @Description(description="编辑")
    public ImageView img_edit;

    @Android(id = "com.zkj.guimi:id/attention_image")
    @IOS(name  = "")
    @Description(description="关注按钮")
    public ImageView attention_image;

    @Android(id = "com.zkj.guimi:id/icon_right_2")
    @IOS(name  = "")
    @Description(description="筛选")
    public TextView select;

    @Android(xpath = "//android.widget.TextView[@resource-id='com.zkj.guimi:id/mood_filter' and @text='男']")
    @IOS(name  = "")
    @Description(description="筛选项：男")
    public TextView mood_filter_boy;

    @Android(xpath = "//android.widget.TextView[@resource-id='com.zkj.guimi:id/mood_filter' and @text='女']")
    @IOS(name  = "")
    @Description(description="筛选项：女")
    public TextView mood_filter_girl;

    @Android(xpath = "//android.widget.Button[@resource-id='com.zkj.guimi:id/dg_btn_confirm']")
    @Description(description = "确定弹窗")
    public TextView ok;
    public MoodBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
