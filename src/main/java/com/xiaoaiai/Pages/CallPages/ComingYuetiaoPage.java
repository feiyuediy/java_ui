package com.xiaoaiai.Pages.CallPages;

import com.xiaoaiai.PagesBeans.CallBeans.ComingYuetiaoBean;
import macaca.client.MacacaClient;

public class ComingYuetiaoPage {
    private MacacaClient macacaClient;
    private ComingYuetiaoBean comingYuetiaoBean;

    public ComingYuetiaoPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        comingYuetiaoBean = new ComingYuetiaoBean(macacaClient);
    }

    //获取title
    public String getTitle(){
        return comingYuetiaoBean.title.getText();
    }

    //获取对方昵称
    public String getNick(){
        return comingYuetiaoBean.aa_tv_nickname.getText();
    }

    //点击同意
    public void answer(){
        comingYuetiaoBean.btn_ready.click();
    }

    //点击拒绝
    public void refuse(){
        comingYuetiaoBean.btn_refuse.click();
    }
}
