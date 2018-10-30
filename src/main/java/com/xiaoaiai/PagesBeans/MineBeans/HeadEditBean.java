package com.xiaoaiai.PagesBeans.MineBeans;

import com.lazy.annotations.Android;
import com.lazy.annotations.Description;
import com.lazy.annotations.IOS;
import com.lazy.bean.BaseBean;
import com.lazy.controls.ImageView;
import com.lazy.controls.TextView;
import macaca.client.MacacaClient;

public class HeadEditBean extends BaseBean {
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

    @Android(id = "com.zkj.guimi:id/vhgi_img_head")
    @IOS(name  = "")
    @Description(description="头像")
    public ImageView headImg;

    @Android(id = "com.zkj.guimi:id/dchi_tv_camera")
    @IOS(name  = "")
    @Description(description="拍照")
    public TextView dchi_tv_camera;

    @Android(id = "com.zkj.guimi:id/dchi_tv_select_from_phone")
    @IOS(name  = "")
    @Description(description="从手机相册选择")
    public TextView dchi_tv_select_from_phone;

    @Android(id = "com.zkj.guimi:id/dchi_tv_cancel")
    @IOS(name  = "")
    @Description(description="取消")
    public TextView dchi_tv_cancel;

    @Android(id = "com.zkj.guimi:id/dchi_tv_delete")
    @IOS(name  = "")
    @Description(description="删除")
    public TextView dchi_tv_delete;

    public HeadEditBean(MacacaClient aDriver) {
        super(aDriver);
    }
}
