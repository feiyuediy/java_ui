package com.xiaoaiai.PagesBeans.LoginBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.Button;
import com.lazy.controls.EditText;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class LoginBean extends BaseBean{

    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(name  = "")
    @Description(description="返回按钮")
    public TextView back;

    @Android(xpath = "//android.widget.TextView[@resource-id='com.zkj.guimi:id/txt_title']")
    @IOS(name  = "")
    @Description(description="标题")
    public  Button  txt_title;

    @Android(id = "com.zkj.guimi:id/input_username")
    @IOS(name  = "")
    @Description(description="用户名输入框")
    public EditText input_username;

    @Android(id = "com.zkj.guimi:id/input_password")
    @IOS(name  = "")
    @Description(description="密码输入框")
    public  EditText  input_password;

    @Android(id = "com.zkj.guimi:id/btn_login")
    @IOS(name  = "")
    @Description(description="登录按钮")
    public  Button  btn_login;

    @Android(id = "com.zkj.guimi:id/btn_register_now")
    @IOS(name  = "")
    @Description(description="立即注册")
    public  TextView  btn_register_now;

    @Android(id = "com.zkj.guimi:id/btn_forget_pwd")
    @IOS(name  = "")
    @Description(description="忘记密码")
    public  TextView  btn_forget_pwd;

    @Android(xpath = "//android.widget.TextView[@text='QQ']")
    @IOS(name  = "")
    @Description(description="QQ登录按钮")
    public  TextView  QQlogin;

    @Android(xpath = "//android.widget.TextView[@text='微信']")
    @IOS(name  = "")
    @Description(description="微信登录按钮")
    public  TextView  weichatLogin;

    @Android(xpath = "//android.widget.TextView[@text='新浪微博']")
    @IOS(name  = "")
    @Description(description="微博登录按钮")
    public  TextView  weiboLogin;

    @Android(id = "com.zkj.guimi:id/txt_clause")
    @IOS(name  = "")
    @Description(description="服务条款")
    public  TextView  txt_clause;

    @Android(id = "com.zkj.guimi:id/txt_policy")
    @IOS(name  = "")
    @Description(description="隐私政策")
    public  TextView  txt_policy;

    public LoginBean(MacacaClient aDriver){super(aDriver);}
}