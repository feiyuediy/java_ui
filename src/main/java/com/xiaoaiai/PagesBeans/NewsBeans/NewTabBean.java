package com.xiaoaiai.PagesBeans.NewsBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class NewTabBean extends BaseBean {

    @Android(id = "com.zkj.guimi:id/name")
    @IOS(name  = "")
    @Description(description="昵称")
    public TextView name;

    @Android(id = "com.zkj.guimi:id/signature")
    @IOS(name  = "")
    @Description(description="最后信息")
    public TextView signature;

    @Android(id = "com.zkj.guimi:id/avatar")
    @IOS(name  = "")
    @Description(description="头像")
    public TextView avatar;

    @Android(id = "com.zkj.guimi:id/timestamp")
    @IOS(name  = "")
    @Description(description="时间戳")
    public TextView timestamp;

    @Android(id = "com.zkj.guimi:id/ok")
    @IOS(name  = "")
    @Description(description="删除当前会话")
    public TextView deleteChat_ok;

    @Android(id = "com.zkj.guimi:id/cancel")
    @IOS(name  = "")
    @Description(description="取消删除当前会话")
    public TextView deleteChat_cancel;

    public NewTabBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
