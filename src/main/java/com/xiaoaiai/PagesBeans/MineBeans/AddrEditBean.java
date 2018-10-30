package com.xiaoaiai.PagesBeans.MineBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.EditText;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class AddrEditBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(name  = "")
    @Description(description="返回")
    public TextView back;

    @Android(id = "com.zkj.guimi:id/txt_title")
    @IOS(name  = "")
    @Description(description="标题")
    public TextView txt_title;

    @Android(id = "com.zkj.guimi:id/txt_right")
    @IOS(name  = "")
    @Description(description="保存")
    public TextView save;

    @Android(id = "com.zkj.guimi:id/filter_edit")
    @IOS(name  = "")
    @Description(description="搜索输入框")
    public EditText filter_edit;

    @Android(id = "com.zkj.guimi:id/txt_city")
    @IOS(name  = "")
    @Description(description="当前城市")
    public TextView txt_city;

    @Android(id = "com.zkj.guimi:id/title")
    @IOS(name  = "")
    @Description(description="城市")
    public TextView title;



    public AddrEditBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
