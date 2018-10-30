package com.xiaoaiai.Pages.DidiPages;

import com.xiaoaiai.PagesBeans.DidiBeans.FollowFramBean;
import macaca.client.MacacaClient;

public class FollowFramePage {
    private MacacaClient macacaClient;
    private FollowFramBean followFramBean;

    public FollowFramePage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        followFramBean = new FollowFramBean(macacaClient);
    }

    //获取司机昵称
    public String getNick(){
        return followFramBean.dd_tv_nickname.getText();
    }

    //点击查看资料
    public void view(){
        followFramBean.dc_dialog_btn_ok.click();
    }

    //点击忽略
    public void close(){
        followFramBean.dc_dialog_btn_cancel.click();
    }

}
