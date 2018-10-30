package com.xiaoaiai.PagesBeans.NewsBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class MyAttentionBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(name  = "")
    @Description(description="返回")
    public TextView back;

    @Android(id = "com.zkj.guimi:id/txt_title")
    @IOS(name  = "")
    @Description(description="标题")
    public TextView txt_title;

    @Android(xpath = "//android.widget.TextView[@text='输入用户昵称或爱爱号搜索']")
    @IOS(name  = "")
    @Description(description="搜索")
    public TextView seach;

    @Android(id = "com.zkj.guimi:id/name")
    @IOS(name  = "")
    @Description(description="昵称")
    public TextView name;

    @Android(id = "com.zkj.guimi:id/signature")
    @IOS(name  = "")
    @Description(description="签名")
    public TextView signature;

    @Android(id = "com.zkj.guimi:id/avatar")
    @IOS(name  = "")
    @Description(description="头像")
    public TextView avatar;

    @Android(id = "com.zkj.guimi:id/ok")
    @IOS(name  = "")
    @Description(description="取消关注弹窗中的取消关注")
    public TextView cancle_attention_ok;

    @Android(id = "com.zkj.guimi:id/ok")
    @IOS(name  = "")
    @Description(description="取消关注弹窗中的取消")
    public TextView cancle_attention_cancel;

    public MyAttentionBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
