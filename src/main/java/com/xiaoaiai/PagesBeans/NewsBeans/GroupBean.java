package com.xiaoaiai.PagesBeans.NewsBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import com.xiaoaiai.Moudle.BaseCase;
import macaca.client.MacacaClient;

public class GroupBean extends BaseBean {

    @Android(xpath = "//android.support.v4.view.ViewPager[@resource-id='com.zkj.guimi:id/adv_viewpager']/android.widget.ImageView[1]")
    @IOS(name  = "")
    @Description(description="banner")
    public ImageView banner;

    @Android(id = "com.zkj.guimi:id/icon_left")
    @IOS(name  = "")
    @Description(description="公告")
    public ImageView icon_left;

    @Android(id = "com.zkj.guimi:id/groups_category_title")
    @IOS(name  = "")
    @Description(description="我的群组")
    public TextView groups_category_title;

    @Android(id = "com.zkj.guimi:id/agl_image")
    @IOS(name  = "")
    @Description(description="群组头像")
    public ImageView agl_image;

    @Android(id = "com.zkj.guimi:id/agl_tv_title")
    @IOS(name  = "")
    @Description(description="群名称")
    public TextView group_name;

    @Android(id = "com.zkj.guimi:id/agl_tv_desc")
    @IOS(name  = "")
    @Description(description="群描述")
    public TextView group_desc;

    @Android(xpath = "//android.widget.TextView[@text='推荐群组']")
    @IOS(name  = "")
    @Description(description="推荐群组title")
    public TextView recommend_group_title;

    @Android(id = "com.zkj.guimi:id/ligr_all_category")
    @IOS(name  = "")
    @Description(description="全部群组")
    public TextView all_group;


    public GroupBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
