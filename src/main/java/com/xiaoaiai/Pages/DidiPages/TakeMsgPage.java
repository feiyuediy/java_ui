package com.xiaoaiai.Pages.DidiPages;

import com.xiaoaiai.PagesBeans.DidiBeans.TakeMsgBean;
import macaca.client.MacacaClient;

public class TakeMsgPage {
    private MacacaClient macacaClient;
    private TakeMsgBean takeMsgBean;

    public TakeMsgPage(MacacaClient client){
        macacaClient = client;
        takeMsgBean = new TakeMsgBean(macacaClient);
    }

    //点击返回
    public void back(){
        takeMsgBean.back.click();
    }

    //获取title
    public String getTitle(){
        return takeMsgBean.txt_title.getText();
    }

    //点击确定
    public void sure(){
        takeMsgBean.sure.click();
    }

    //设置捎话
    public void setTakeMsg(String msg){
        takeMsgBean.adem_edittext.input(msg);
        sure();
    }
}
