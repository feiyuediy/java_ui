package com.xiaoaiai.PagesBeans.MineBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.EditText;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class SignatureEditBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(name  = "")
    @Description(description="返回")
    public TextView back;

    @Android(id = "com.zkj.guimi:id/txt_title")
    @IOS(name  = "")
    @Description(description="标题")
    public TextView title;

    @Android(id = "com.zkj.guimi:id/txt_right")
    @IOS(name  = "")
    @Description(description="保存")
    public TextView save;

    @Android(id = "com.zkj.guimi:id/ape_et_signature")
    @IOS(name  = "")
    @Description(description="输入框")
    public EditText ape_et_signature;


    public SignatureEditBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
