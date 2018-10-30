package com.xiaoaiai.PagesBeans.CallBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class WaitAnswerBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/swing_card")
    @IOS(name  = "")
    @Description(description="对方头像")
    public TextView swing_card;


    @Android(id = "com.zkj.guimi:id/tv_nick")
    @IOS(name  = "")
    @Description(description="对方昵称")
    public TextView tv_nick;

    @Android(id = "com.zkj.guimi:id/tv_call_state")
    @IOS(name  = "")
    @Description(description="状态")
    public TextView tv_call_state;

    @Android(id = "com.zkj.guimi:id/btn_hangup_call")
    @IOS(name  = "")
    @Description(description="对方头像")
    public ImageView btn_hangup_call;


    public WaitAnswerBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
