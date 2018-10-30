package com.xiaoaiai.PagesBeans.CallBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class VideoCallIngBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/img_refuse_handup")
    @IOS(name  = "")
    @Description(description="挂断")
    public ImageView img_refuse_handup;


    public VideoCallIngBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
