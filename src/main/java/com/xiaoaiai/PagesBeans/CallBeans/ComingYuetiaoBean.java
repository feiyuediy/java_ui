package com.xiaoaiai.PagesBeans.CallBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.Button;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;
import org.yaml.snakeyaml.events.Event;

import javax.xml.soap.Text;

public class ComingYuetiaoBean extends BaseBean {
    @Android(id = "com.zkj.guimi:id/txt_title")
    @IOS(id = "")
    @Description(description = "标题")
    public TextView title;

    @Android(id = "com.zkj.guimi:id/iv_face")
    @IOS(id = "")
    @Description(description = "对方头像")
    public ImageView iv_face;

    @Android(id = "com.zkj.guimi:id/aa_tv_nickname")
    @IOS(id = "")
    @Description(description = "对方昵称")
    public TextView aa_tv_nickname;

    @Android(id = "com.zkj.guimi:id/aa_tv_aiai_number")
    @IOS(id = "")
    @Description(description = "对方爱爱号")
    public TextView aa_tv_aiai_number;

    @Android(id = "com.zkj.guimi:id/txt_auth_tip")
    @IOS(id = "")
    @Description(description = "tip")
    public TextView txt_auth_tip;

    @Android(id = "com.zkj.guimi:id/btn_ready")
    @IOS(id = "")
    @Description(description = "同意button")
    public Button btn_ready;

    @Android(id = "com.zkj.guimi:id/btn_refuse")
    @IOS(id = "")
    @Description(description = "拒绝button")
    public TextView btn_refuse;


    public ComingYuetiaoBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
