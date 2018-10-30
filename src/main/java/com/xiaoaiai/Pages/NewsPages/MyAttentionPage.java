package com.xiaoaiai.Pages.NewsPages;

import com.lazy.exceptions.ProxyError;
import com.xiaoaiai.PagesBeans.NewsBeans.MyAttentionBean;
import com.xiaoaiai.Utils.DriverCommon;
import macaca.client.MacacaClient;
import sun.dc.pr.PRError;

public class MyAttentionPage {
    private MacacaClient macacaClient;
    private MyAttentionBean myAttentionBean;

    public MyAttentionPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        myAttentionBean = new MyAttentionBean(macacaClient);
    }

    //获取标题
    public String get_title(){
        return myAttentionBean.txt_title.getText();
    }

    //点击返回按钮
    public void click_back(){
        myAttentionBean.back.click();
    }

    //获取第N个关注人的昵称
    public String get_name(int i){
        String name = null;
        try {
            name =  myAttentionBean.name.findElemets().get(i-1).getText();
        } catch (Exception e) {
            throw new ProxyError(e.getMessage());
        }
        return name;
    }

    //获取第N个关注人的签名
    public String get_signature(int i){
        String signature = null;
        try {
            signature = myAttentionBean.signature.findElemets().get(i-1).getText();
        } catch (Exception e) {
            throw new PRError(e.getMessage());
        }
        return signature;
    }

    //点击第N个关注的人进入到个人资料
    public void click(int i){
        try {
            myAttentionBean.name.findElemets().get(i-1).click();
        } catch (Exception e) {
            throw new PRError(e.getMessage());
        }
    }
    //取消关注第N个人
    public void canle_attention(String name){
        for (int i = 1;i<9 ; i++){
            System.out.println("i:"+i);
            if (name.equals(get_name(i))){
                System.out.println("取消关注");
                canle_attention(i);
                break;
            }
        }
    }

    //取消关注第N个人
    public void canle_attention(int i){
        //长按
        DriverCommon.longPush(macacaClient, myAttentionBean.name.findElemets().get(i-1),2);

        //点击取消关注
        myAttentionBean.cancle_attention_ok.click();
    }

}
