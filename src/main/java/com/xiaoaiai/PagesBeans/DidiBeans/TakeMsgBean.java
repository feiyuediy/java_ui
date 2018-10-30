package com.xiaoaiai.PagesBeans.DidiBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.EditText;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class TakeMsgBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/txt_left")
    @IOS(id = "")
    @Description(description="返回按钮")
    public TextView back;

    @Android(id = "com.zkj.guimi:id/txt_title")
    @IOS(id = "")
    @Description(description="标题")
    public TextView txt_title;

    @Android(id = "com.zkj.guimi:id/txt_right")
    @IOS(id = "")
    @Description(description="完成按钮")
    public TextView sure;

    @Android(id = "com.zkj.guimi:id/adem_edittext")
    @IOS(id = "")
    @Description(description="设置额外打赏中的完成")
    public EditText adem_edittext;

    @Android(xpath = "//android.widget.TextView[@text='  快捷短语']")
    @IOS(id = "")
    @Description(description="快捷短语")
    public TextView shortcutPhraseText;

    @Android(id = "android:id/text1")
    @IOS(id = "")
    @Description(description="快捷短语的内容")
    public TextView text1;


    public TakeMsgBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
