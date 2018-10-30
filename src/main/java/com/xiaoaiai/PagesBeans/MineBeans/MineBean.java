package com.xiaoaiai.PagesBeans.MineBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.Button;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class MineBean extends BaseBean {

    @Android(id = "com.zkj.guimi:id/txt_title")
    @IOS(name  = "")
    @Description(description="标题")
    public TextView txt_title;

    @Android(id = "com.zkj.guimi:id/au_setting_img_header")
    @IOS(name  = "")
    @Description(description="头像")
    public ImageView img_header;

    @Android(id = "com.zkj.guimi:id/fs_img_vip")
    @IOS(name  = "")
    @Description(description="会员")
    public ImageView img_vip;

    @Android(id = "com.zkj.guimi:id/fs_txt_aaName")
    @IOS(name  = "")
    @Description(description="昵称")
    public TextView aaName;


    @Android(id = "com.zkj.guimi:id/fs_txt_aaNum")
    @IOS(name  = "")
    @Description(description="爱爱号")
    public TextView aaNum;

    @Android(id = "com.zkj.guimi:id/level")
    @IOS(name  = "")
    @Description(description="等级")
    public TextView level;

    @Android(name = "充值中心")
    @IOS(name  = "")
    @Description(description="充值中心")
    public TextView recharge_center;

    @Android(name = "会员中心")
    @IOS(name  = "")
    @Description(description="会员中心")
    public TextView vip_center;


    @Android(name = "成长中心")
    @IOS(name  = "")
    @Description(description="成长中心")
    public TextView growup_centor;

    @Android(name = "游戏大厅")
    @IOS(name  = "")
    @Description(description="游戏大厅")
    public TextView game_centor;

    @Android(name = "许愿夺宝")
    @IOS(name  = "")
    @Description(description="许愿夺宝")
    public TextView wish_centor;

    @Android(name = "我的玩具")
    @IOS(name  = "")
    @Description(description="我的玩具")
    public TextView tools_centor;

    @Android(name = "设置")
    @IOS(name  = "")
    @Description(description="设置")
    public TextView setting;

    @Android(name = "帮助")
    @IOS(name  = "")
    @Description(description="帮助")
    public TextView help;

    @Android(name = "反馈")
    @IOS(name  = "")
    @Description(description="反馈")
    public TextView feedback;

    @Android(name = "分享")
    @IOS(name  = "")
    @Description(description="分享")
    public TextView share;

    @Android(name = "关于")
    @IOS(name  = "")
    @Description(description="关于")
    public TextView abuot;

    @Android(id = "com.zkj.guimi:id/vii_tv_content")
    @IOS(name  = "")
    @Description(description="侧边的备注")
    public TextView vii_tv_content;
    public MineBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
