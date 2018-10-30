package com.xiaoaiai.doctorCriclePagesBeans.LoginBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.Button;
import com.lazy.controls.EditText;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class LoginBean extends BaseBean {

    @Android(id = "com.dachen.medicalcircle:id/tv_login_title")
    @IOS(name  = "")
    @Description(description="标题")
    public TextView tv_login_title;

    @Android(id = "com.dachen.medicalcircle:id/phone_numer_edit")
    @IOS(name  = "")
    @Description(description="账号输入框")
    public EditText phone_numer_edit;

    @Android(id = "com.dachen.medicalcircle:id/password_edit")
    @IOS(name  = "")
    @Description(description="密码输入框")
    public EditText password_edit;

    @Android(id = "com.dachen.medicalcircle:id/forget_password_btn")
    @IOS(name  = "")
    @Description(description="忘记密码")
    public Button forget_password_btn;

    @Android(id = "ccom.dachen.medicalcircle:id/login_btn")
    @IOS(name  = "")
    @Description(description="登录")
    public Button login_btn;

    @Android(id = "com.dachen.medicalcircle:id/change_login_mode_tv")
    @IOS(name  = "")
    @Description(description="使用验证码登录")
    public Button change_login_mode_tv;

    @Android(id = "com.dachen.medicalcircle:id/register_account_btn")
    @IOS(name  = "")
    @Description(description="注册新账号")
    public Button register_account_btn;

    public LoginBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
