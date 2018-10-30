package com.xiaoaiai.Pages.MinePages;

import com.xiaoaiai.PagesBeans.MineBeans.AddrEditBean;
import macaca.client.MacacaClient;

public class AddrEditPage {
    private MacacaClient macacaClient;
    private AddrEditBean addrEditBean;

    public AddrEditPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        addrEditBean = new AddrEditBean(macacaClient);
    }

    //点击返回
    public void back(){
        addrEditBean.back.click();
    }
    //获取标题
    public String getTitle(){
        return addrEditBean.txt_title.getText();
    }
    //点击保存
    public void save(){
        addrEditBean.save.click();
    }
    //输入框输入文字
    public void seach(String msg){
        addrEditBean.filter_edit.input(msg);
    }
    //获取当前的设置的城市
    public String getCity(){
        return addrEditBean.txt_city.getText();
    }
    //修改城市
    public void modifyAdd(String msg){
        seach(msg);
        addrEditBean.title.click();
        save();
        back();
    }
}
