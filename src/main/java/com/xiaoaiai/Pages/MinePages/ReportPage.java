package com.xiaoaiai.Pages.MinePages;

import com.xiaoaiai.PagesBeans.MineBeans.ReportBean;
import macaca.client.MacacaClient;

public class ReportPage {
    private MacacaClient macacaClient;
    private ReportBean reportBean;

    public ReportPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        reportBean = new ReportBean(macacaClient);
    }

    //点击色情
    public void click_pornographic(){
        reportBean.pornographic.click();
    }

    //点击返回
    public void click_back(){
        reportBean.back.click();
    }

    //点击广告骚扰
    public void click_advertisingHarassment(){
        reportBean.advertisingHarassment.click();
    }

    //点击欺诈
    public void click_cheat(){
        reportBean.cheat.click();
    }

    //点击违法
    public void click_illegal(){
        reportBean.illegal.click();
    }
    //点击政治敏感
    public void click_politicalSensitivities(){
        reportBean.politicalSensitivities.click();
    }
}
