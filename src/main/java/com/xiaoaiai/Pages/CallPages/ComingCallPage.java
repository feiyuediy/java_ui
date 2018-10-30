package com.xiaoaiai.Pages.CallPages;

import com.xiaoaiai.PagesBeans.CallBeans.ComingCallBean;
import macaca.client.MacacaClient;

public class ComingCallPage {
    private MacacaClient macacaClient;
    private ComingCallBean comingCallBean;

    public ComingCallPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        comingCallBean = new ComingCallBean(macacaClient);
    }
    //点击挂断
    public void refuse_call(){
        comingCallBean.btn_refuse_call.click();
    }
    //接听通话
    public void answer(){

        comingCallBean.btn_answer_call.click();
    }

    //获取状态
    public String get_call_state(){
        return comingCallBean.tv_call_state.getText();
    }
    //获取对方昵称
    public String get_nick(){
        return comingCallBean.tv_nick.getText();
    }
}
