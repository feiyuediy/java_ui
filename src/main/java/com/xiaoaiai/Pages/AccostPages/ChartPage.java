package com.xiaoaiai.Pages.AccostPages;


import com.xiaoaiai.PagesBeans.AccostBeans.ChartBean;
import macaca.client.MacacaClient;

/**
 * Created by admin on 2017/9/5.
 */
public class ChartPage {
    private ChartBean chartBean;
    private MacacaClient appiumDriver;

    public ChartPage(MacacaClient appiumDriver){
        this.appiumDriver = appiumDriver;
        chartBean = new ChartBean(appiumDriver);
    }
    //判断banner图是否存在
    public boolean isExitBanner(){
        return chartBean.banner.isExist();
    }
}
