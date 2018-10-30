package com.xiaoaiai.Pages.NewsPages;

import com.xiaoaiai.PagesBeans.NewsBeans.BlackBean;
import com.xiaoaiai.PagesBeans.NewsBeans.MyFansBean;
import com.xiaoaiai.Utils.DriverCommon;
import macaca.client.MacacaClient;
import sun.dc.pr.PRError;

public class BlackPage {
    private MacacaClient macacaClient;
    private BlackBean blackBean;

    public BlackPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        blackBean = new BlackBean(macacaClient);
    }

    //获取标题
    public String get_title(){
        return blackBean.txt_title.getText();
    }

    //点击返回按钮
    public void click_back(){
        blackBean.back.click();
    }

    //获取第N个关注人的昵称
    public String get_name(int i){
        String name = null;
        try {
            name =  blackBean.name.findElemets().get(i-1).getText();
        } catch (Exception e) {
            throw new PRError(e.getMessage());
        }
        return name;
    }

    //获取第N个关注人的签名
    public String get_signature(int i){
        String signature = null;
        try {
            signature = blackBean.signature.findElemets().get(i-1).getText();
        } catch (Exception e) {
            throw new PRError(e.getMessage());
        }
        return signature;
    }

    //点击第N个关注的人进入到个人资料
    public void click(int i){
        try {
            blackBean.name.findElemets().get(i-1).click();
        } catch (Exception e) {
            throw new PRError(e.getMessage());
        }
    }

    //取消关注第N个人
    public void balck(int i){
        //长按
        DriverCommon.longPush(macacaClient, blackBean.name.findElemets().get(i-1),2);

        //点击取消关注
        blackBean.unblack_cancel.click();
    }

}
