package com.xiaoaiai.Pages.NewsPages;

import com.xiaoaiai.PagesBeans.NewsBeans.ContactBean;
import macaca.client.MacacaClient;

public class ContactPage {
    private MacacaClient macacaClient;
    private ContactBean contactBean;

    public ContactPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        contactBean = new ContactBean(macacaClient);
    }

    //点击我的关注
    public void click_myAttention(){
        contactBean.my_attontion.click();
    }
    //点击我的粉丝
    public void click_myfans(){
        contactBean.my_fans.click();
    }
    //点击黑名单
    public void click_black(){
        contactBean.my_black_list.click();
    }

    //搜索一个人到个人资料
    public void seach(String key){
        contactBean.seach.click();

        SeachPage seachPage = new SeachPage(macacaClient);
        seachPage.seach(key);
    }
}
