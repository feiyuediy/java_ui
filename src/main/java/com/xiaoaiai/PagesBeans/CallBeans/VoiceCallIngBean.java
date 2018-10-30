package com.xiaoaiai.PagesBeans.CallBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import macaca.client.MacacaClient;

public class VoiceCallIngBean extends BaseBean {

    @Android(id = "com.zkj.guimi:id/avc_call_success_hangup")
    @IOS(name  = "")
    @Description(description="挂断")
    public ImageView img_refuse_handup;

    public VoiceCallIngBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
