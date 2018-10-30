package com.xiaoaiai.Pages.AccostPages;

import com.xiaoaiai.PagesBeans.AccostBeans.AccostBean;
import macaca.client.MacacaClient;

public class AccostPage {
    private MacacaClient macacaClient;
    private AccostBean accostBean;


    public AccostPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        accostBean = new AccostBean(macacaClient);
    }
    //点击ID照
    public void click_idPhoto(){
        accostBean.idPhoto.click();
    }

    //点击心情
    public void click_mood(){
        accostBean.mood.click();
    }

    //点击榜单
    public void click_list(){
        accostBean.list.click();
    }

    //点击搭讪
    public void go_accost(){
        accostBean.accost_tab.click();
    }

    //点击发现
    public void go_find(){
        accostBean.find_tab.click();
    }

    //进入到didi界面
    public void go_didi(){
        accostBean.didi_tab.click();
    }

    //进入到消息界面
    public void go_news(){
        accostBean.news_tab.click();
    }

    //进入到我的界面
    public void go_mine(){
        accostBean.mine_tab.click();
    }
}
