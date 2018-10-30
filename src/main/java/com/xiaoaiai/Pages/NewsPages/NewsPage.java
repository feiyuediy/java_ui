package com.xiaoaiai.Pages.NewsPages;

import com.xiaoaiai.PagesBeans.NewsBeans.NewsBean;
import macaca.client.MacacaClient;

import javax.crypto.Mac;

public class NewsPage {
    private MacacaClient macacaClient;
    private NewsBean newsBean;

    public NewsPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        newsBean = new NewsBean(macacaClient);
    }

    //进入群组界面
    public void click_group(){
        newsBean.group_tab.click();
    }

    //进入联系人
    public void click_contact(){
        newsBean.contact_tab.click();
    }

    //进入公告
    public void go_notice(){
        newsBean.icon_left.click();
    }



    //点击搭讪
    public void go_accost(){
        newsBean.accost_tab.click();
    }

    //点击发现
    public void go_find(){
        newsBean.find_tab.click();
    }

    //进入到didi界面
    public void go_didi(){
        newsBean.didi_tab.click();
    }

    //进入到消息界面
    public void go_news(){
        newsBean.news_tab.click();
    }

    //进入到我的界面
    public void go_mine(){
        newsBean.mine_tab.click();
    }
}
