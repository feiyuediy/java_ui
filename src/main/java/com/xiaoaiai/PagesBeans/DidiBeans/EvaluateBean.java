package com.xiaoaiai.PagesBeans.DidiBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class EvaluateBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(id = "")
    @Description(description="返回")
    public TextView txt_left;

    @Android(id = "com.zkj.guimi:id/txt_title")
    @IOS(id = "")
    @Description(description="标题")
    public TextView txt_title;

    @Android(id = "com.zkj.guimi:id/avatar")
    @IOS(id = "")
    @Description(description="司机头像")
    public TextView avatar;

    @Android(id = "com.zkj.guimi:id/name_tv")
    @IOS(id = "")
    @Description(description="司机昵称")
    public TextView name_tv;

    @Android(xpath = "//android.widget.LinearLayout/android.view.View[1]")
    @IOS(id = "")
    @Description(description="一颗星")
    public ImageView oneStar;

    @Android(xpath = "//android.widget.LinearLayout/android.view.View[2]")
    @IOS(id = "")
    @Description(description="两颗星")
    public ImageView twoSar;

    @Android(xpath = "//android.widget.LinearLayout/android.view.View[3]")
    @IOS(id = "")
    @Description(description="三颗星")
    public ImageView threeStar;


    @Android(xpath = "//android.widget.LinearLayout/android.view.View[4]")
    @IOS(id = "")
    @Description(description="四颗星")
    public ImageView fourStar;


    @Android(xpath = "//android.widget.LinearLayout/android.view.View[5]")
    @IOS(id = "")
    @Description(description="五颗星")
    public ImageView fiveStar;


    @Android(id = "com.zkj.guimi:id/expand_button")
    @IOS(id = "")
    @Description(description="点击隐藏更多标签")
    public TextView expand_button;

    @Android(id = "com.zkj.guimi:id/text")
    @IOS(id = "")
    @Description(description="标签")
    public TextView tagText;

    @Android(id = "com.zkj.guimi:id/submit_btn")
    @IOS(id = "")
    @Description(description="提交")
    public TextView submit_btn;


    public EvaluateBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
