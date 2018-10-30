package com.xiaoaiai.Pages.FindPages;

import com.lazy.exceptions.ProxyError;
import com.xiaoaiai.PagesBeans.FindBeans.LoadVideoBean;
import macaca.client.MacacaClient;
import macaca.client.commands.Element;
import macaca.client.common.ElementSelector;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by admin on 2017/9/7.
 */
public class LoadVideoPage{
    private LoadVideoBean loadVideoBean;
    private MacacaClient appiumDriver;
    public LoadVideoPage(MacacaClient appiumDriver){
        this.appiumDriver = appiumDriver;
        loadVideoBean = new LoadVideoBean(appiumDriver);
    }

    public void click_back(){
        loadVideoBean.back.click();
    }

    public void click_cancle(){
        loadVideoBean.cancle.click();
    }

    public void click_fristVideo(){
        loadVideoBean.fristVideo.click();
    }

    public void click_machTimeVideo(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Element> elementSelector =  loadVideoBean.time.findElemets();
        System.out.println("elementSelector.size:"+ elementSelector.size());
        for (int i =0; i<elementSelector.size(); i++){
            Element element = elementSelector.get(i);
            try {
                System.out.println(element.getText());
                if (isTimeMatch(element.getText().toString())){
                    element.click();
                    break;
                }
            } catch (Exception e) {
                throw new ProxyError(e.getMessage());
            }
        }
    }

    public boolean isTimeMatch(String time){
        System.out.println("time:"+time);
        String x = time.split(":")[0];
        System.out.println("time.splt:"+x);
        String[] y = {"00","01"};
        Set<String> set = new HashSet<String>(Arrays.asList(y));
        return set.contains(x);
    }
}
