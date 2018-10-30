package com.xiaoaiai.PagesBeans.DidiBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;
import org.testng.annotations.Test;

public class OrderFrameBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/laag_header")
    @IOS(id = "")
    @Description(description="头像")
    public ImageView laag_header;

    @Android(id = "com.zkj.guimi:id/dd_tv_nickname")
    @IOS(id = "")
    @Description(description="昵称")
    public TextView dd_tv_nickname;

    @Android(id = "com.zkj.guimi:id/dd_tv_didi_fee")
    @IOS(id = "")
    @Description(description="价格")
    public TextView price;

    @Android(id = "com.zkj.guimi:id/dc_dialog_btn_cancel")
    @IOS(id = "")
    @Description(description="忽略")
    public TextView dc_dialog_btn_cancel;

    @Android(id = "com.zkj.guimi:id/dc_dialog_btn_ok")
    @IOS(id = "")
    @Description(description="快速接受")
    public TextView dc_dialog_btn_ok;

    @Android(id = "com.zkj.guimi:id/dd_tv_msg_by_sender")
    @IOS(id = "")
    @Description(description="捎话")
    public TextView dd_tv_msg_by_sender;

    @Android(id = "com.zkj.guimi:id/dd_tv_didi_ext")
    @IOS(id = "")
    @Description(description="额外打赏")
    public TextView reward;



    public OrderFrameBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
