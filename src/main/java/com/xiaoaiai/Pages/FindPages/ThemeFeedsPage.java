package com.xiaoaiai.Pages.FindPages;


import com.lazy.exceptions.ProxyError;
import com.xiaoaiai.PagesBeans.FindBeans.ThemeFeedsBean;
import macaca.client.MacacaClient;
import macaca.client.commands.Element;
import macaca.client.common.ElementSelector;

import java.util.List;

/**
 * Created by admin on 2017/9/8.
 */
public class ThemeFeedsPage {
    private ThemeFeedsBean themeFeedsBean;
    private MacacaClient appiumDriver;
    public ThemeFeedsPage(MacacaClient appiumDriver){
        this.appiumDriver = appiumDriver;
        themeFeedsBean = new ThemeFeedsBean(appiumDriver);
    }

    //获取页面title
    public String getTitle(){
        return themeFeedsBean.title.getText();
    }
    //获取页面第一条动态的昵称
    public String getFristFeedNick(){
        return themeFeedsBean.af_tv_name.getText();
    }

    //获取第一条动态的内容
    public String getContent()  {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String xpth = "com.zkj.guimi:id/af_tv_content";
        List<Element> elementSelector = null;
        try {
            elementSelector = appiumDriver.elementsById(xpth);
            return elementSelector.get(0).getText();
        } catch (Exception e) {
            throw new ProxyError(e.getMessage());
        }

    }

    //删除第一条能删除的动态
    public void delectFeed(){
        themeFeedsBean.af_tv_delete.click();
        themeFeedsBean.ok.click();
    }
}
