package com.xiaoaiai.Pages.CallPages;

import com.xiaoaiai.PagesBeans.CallBeans.WaitAnswerBean;
import macaca.client.MacacaClient;

public class WaitAnswerPage {
    private MacacaClient macacaClient;
    private WaitAnswerBean waitAnswerBean;

    public WaitAnswerPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        waitAnswerBean = new WaitAnswerBean(macacaClient);
    }

    //点击挂断
    public void hangup_call(){
        waitAnswerBean.btn_hangup_call.click();
    }

}
