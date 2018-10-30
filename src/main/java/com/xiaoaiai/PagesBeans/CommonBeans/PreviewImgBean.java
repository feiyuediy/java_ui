package com.xiaoaiai.PagesBeans.CommonBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.bean.BaseBean;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class PreviewImgBean extends BaseBean {
    @Android(xpath = "//android.widget.TextView[@text='取消']")
    @Description(description="取消")
    public TextView cancel;

    @Android(xpath = "//android.widget.TextView[@text='确定']")
    @Description(description="确定")
    public TextView sure;

    public PreviewImgBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
