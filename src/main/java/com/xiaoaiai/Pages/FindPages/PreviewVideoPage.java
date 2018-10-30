package com.xiaoaiai.Pages.FindPages;


import com.xiaoaiai.PagesBeans.FindBeans.PreviewVideoBean;

import macaca.client.MacacaClient;

/**
 * Created by admin on 2017/9/7.
 */
public class PreviewVideoPage {
    private PreviewVideoBean previewVideoBean;
    private MacacaClient appiumDriver;

    public PreviewVideoPage(MacacaClient appiumDriver){
        this.appiumDriver = appiumDriver;
        previewVideoBean = new PreviewVideoBean(appiumDriver);
    }

    public void click_sure(){
        previewVideoBean.sure.click();
    }

    public void click_back(){
        previewVideoBean.back.click();
    }

    public void click_play(){
        previewVideoBean.play.click();
    }
}
