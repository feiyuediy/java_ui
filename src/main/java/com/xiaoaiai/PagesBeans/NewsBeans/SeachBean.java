package com.xiaoaiai.PagesBeans.NewsBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.EditText;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class SeachBean extends BaseBean {

    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(name  = "")
    @Description(description="返回")
    public TextView back;

    @Android(id = "com.zkj.guimi:id/lse_edit")
    @IOS(name  = "")
    @Description(description="时间戳")
    public EditText seach_edit;

    @Android(id = "com.zkj.guimi:id/search_network")
    @IOS(name  = "")
    @Description(description="全网搜索")
    public TextView search_network;

    @Android(id = "com.zkj.guimi:id/name")
    @IOS(name  = "")
    @Description(description="结果的昵称")
    public TextView name;

    @Android(id = "com.zkj.guimi:id/signature")
    @IOS(name  = "")
    @Description(description="结果的签名")
    public TextView signature;

    @Android(id = "com.zkj.guimi:id/timestamp")
    @IOS(name  = "")
    @Description(description="最近上线时间")
    public TextView timestamp;

    @Android(id = "com.zkj.guimi:id/avatar")
    @IOS(name  = "")
    @Description(description="结果的头像")
    public TextView avatar;

    public SeachBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
