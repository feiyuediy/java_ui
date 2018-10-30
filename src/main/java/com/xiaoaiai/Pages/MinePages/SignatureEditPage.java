package com.xiaoaiai.Pages.MinePages;

import com.xiaoaiai.PagesBeans.MineBeans.SignatureEditBean;
import macaca.client.MacacaClient;

public class SignatureEditPage {
    private MacacaClient macacaClient;
    private SignatureEditBean signatureEditBean;

    public SignatureEditPage(MacacaClient macacaClient){
        this.signatureEditBean = new SignatureEditBean(macacaClient);
        this.macacaClient = macacaClient;
    }

    //返回
    public void back(){
        signatureEditBean.back.click();
    }
    //获取标题
    public String getTitle(){
        return signatureEditBean.title.getText();
    }

    //修改个性签名
    public void modifySignature(String msg){
        signatureEditBean.ape_et_signature.input(msg);
        signatureEditBean.save.click();
    }
}
