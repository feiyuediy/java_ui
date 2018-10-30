package com.xiaoaiai.Pages.NewsPages;

import com.xiaoaiai.PagesBeans.NewsBeans.MyAttentionBean;
import com.xiaoaiai.PagesBeans.NewsBeans.MyFansBean;
import com.xiaoaiai.Utils.DriverCommon;
import macaca.client.MacacaClient;
import sun.dc.pr.PRError;

public class MyFansPage {
    private MacacaClient macacaClient;
    private MyFansBean myFansBean;

    public MyFansPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        myFansBean = new MyFansBean(macacaClient);
    }

    //获取标题
    public String get_title(){
        return myFansBean.txt_title.getText();
    }

    //点击返回按钮
    public void click_back(){
        myFansBean.back.click();
    }

    //获取第N个关注人的昵称
    public String get_name(int i){
        String name = null;
        try {
            name =  myFansBean.name.findElemets().get(i-1).getText();
        } catch (Exception e) {
            throw new PRError(e.getMessage());
        }
        return name;
    }

    //获取第N个关注人的签名
    public String get_signature(int i){
        String signature = null;
        try {
            signature = myFansBean.signature.findElemets().get(i-1).getText();
        } catch (Exception e) {
            throw new PRError(e.getMessage());
        }
        return signature;
    }

    //点击第N个关注的人进入到个人资料
    public void click(int i){
        try {
            myFansBean.name.findElemets().get(i-1).click();
        } catch (Exception e) {
            throw new PRError(e.getMessage());
        }
    }

    //取消关注第N个人
    public void balck(int i){
        //长按
        DriverCommon.longPush(macacaClient, myFansBean.name.findElemets().get(i-1),2);

        //点击取消关注
        myFansBean.black_ok.click();
    }

}
