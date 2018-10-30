package com.xiaoaiai.Pages.CommonPages;

import com.xiaoaiai.PagesBeans.CommonBeans.PreviewImgBean;
import macaca.client.MacacaClient;

public class PreviewImgPage {
    private MacacaClient macacaClient;
    private PreviewImgBean previewImgBean;

    public PreviewImgPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        previewImgBean = new PreviewImgBean(macacaClient);
    }

    //点击确定按钮
    public void sure(){
        previewImgBean.sure.click();
    }
    //点击取消
    public void cancel(){
        previewImgBean.cancel.click();
    }
}
