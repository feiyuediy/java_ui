package com.xiaoaiai.PagesBeans.DidiBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.Button;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class FollowFramBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/laag_header")
    @IOS(id = "")
    @Description(description="头像")
    public ImageView laag_header;

    @Android(id = "com.zkj.guimi:id/dd_tv_nickname")
    @IOS(id = "")
    @Description(description="昵称")
    public TextView dd_tv_nickname;

    @Android(id = "com.zkj.guimi:id/dc_dialog_btn_ok")
    @IOS(id = "")
    @Description(description="查看资料")
    public Button dc_dialog_btn_ok;

    @Android(id = "com.zkj.guimi:id/dc_dialog_btn_cancel")
    @IOS(id = "")
    @Description(description="忽略")
    public ImageView dc_dialog_btn_cancel;

    public FollowFramBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
