package com.xiaoaiai.Pages.NewsPages;

import com.xiaoaiai.PagesBeans.NewsBeans.SeachBean;
import macaca.client.MacacaClient;

public class SeachPage {
    private MacacaClient macacaClient;
    private SeachBean seachBean;

    public SeachPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        seachBean = new SeachBean(macacaClient);
    }

    //点击返回
    public void click_back(){
        seachBean.back.click();
    }

    //全网搜索,进入到了个人资料界面
    public void seach(String key){
        seachBean.seach_edit.input(key);
        //点击全网搜索
        seachBean.search_network.click();
        //进入结果进入到个人资料
        seachBean.name.click();
    }

}
