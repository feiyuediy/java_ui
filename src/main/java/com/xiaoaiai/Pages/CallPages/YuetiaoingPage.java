package com.xiaoaiai.Pages.CallPages;

import com.xiaoaiai.PagesBeans.CallBeans.YuetiaoingBean;
import macaca.client.MacacaClient;

public class YuetiaoingPage {
    private MacacaClient macacaClient;
    private YuetiaoingBean yuetiaoingBean;

    public YuetiaoingPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        yuetiaoingBean = new YuetiaoingBean(macacaClient);
    }

    //点击设备未连接中的取消按钮
    public void click_deviceWaring_cancle(){
        yuetiaoingBean.dialog_btn_cancel.click();
    }

    //点击设备未连接弹窗中的连接按钮
    public void click_deviceWaring_ok(){
        yuetiaoingBean.dialog_btn_ok.click();
    }

    //点击离开弹窗中的取消按钮
    public void click_offDialog_cancle(){
        yuetiaoingBean.dc_dialog_btn_cancel.click();
    }

    //点击离开弹窗中的确定按钮 || 连接已关闭中的我知道了按钮
    public void click_offDialog_ok(){
        yuetiaoingBean.dc_dialog_btn_ok.click();
    }
    //点击离开按钮
    public void off(){
        yuetiaoingBean.off.click();
    }
}
