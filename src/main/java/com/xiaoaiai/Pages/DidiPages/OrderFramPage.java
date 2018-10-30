package com.xiaoaiai.Pages.DidiPages;

import com.xiaoaiai.PagesBeans.DidiBeans.OrderFrameBean;
import macaca.client.MacacaClient;

import javax.crypto.Mac;

public class OrderFramPage {
    private MacacaClient macacaClient;
    private OrderFrameBean orderFrameBean;

    public OrderFramPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        orderFrameBean = new OrderFrameBean(macacaClient);
    }

    //获取乘客昵称
    public String getNick(){
        return orderFrameBean.dd_tv_nickname.getText();
    }

    //获取价格
    public String getPirce(){
        return orderFrameBean.price.getText();
    }

    //获取捎话
    public String getMsg(){
        return orderFrameBean.dd_tv_msg_by_sender.getText();
    }

    //获取额外打赏
    public String getReward(){
        return orderFrameBean.reward.getText();
    }

    //接受
    public void answer(){
        orderFrameBean.dc_dialog_btn_ok.click();
    }

    //拒绝
    public void refuse(){
        orderFrameBean.dc_dialog_btn_cancel.click();
    }
}
