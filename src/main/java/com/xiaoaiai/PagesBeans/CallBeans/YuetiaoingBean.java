package com.xiaoaiai.PagesBeans.CallBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.Button;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class YuetiaoingBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/dialog_btn_ok")
    @IOS(name  = "")
    @Description(description="设备未连接弹窗中的连接按钮")
    public Button dialog_btn_ok;

    @Android(id = "com.zkj.guimi:id/dialog_btn_cancel")
    @IOS(name  = "")
    @Description(description="设备未连接弹窗中的取消按钮")
    public Button dialog_btn_cancel;

    @Android(id = "com.zkj.guimi:id/dialog_txt_title")
    @IOS(name  = "")
    @Description(description="设备未连接弹窗中的title")
    public TextView dialog_txt_title;

    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(name  = "")
    @Description(description="断开")
    public TextView off;

    @Android(id = "com.zkj.guimi:id/dc_dialog_btn_ok")
    @IOS(name  = "")
    @Description(description="离开弹窗中的离开按钮 ||  连接已关闭中的我知道了按钮")
    public TextView dc_dialog_btn_ok;

    @Android(id = "com.zkj.guimi:id/dc_dialog_btn_cancel")
    @IOS(name  = "")
    @Description(description="离开弹窗中的取消按钮")
    public TextView dc_dialog_btn_cancel;


    public YuetiaoingBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
