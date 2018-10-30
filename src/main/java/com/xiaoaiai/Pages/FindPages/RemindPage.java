package com.xiaoaiai.Pages.FindPages;

import com.lazy.exceptions.ProxyError;
import com.xiaoaiai.PagesBeans.FindBeans.RemindBean;

import com.xiaoaiai.Utils.DriverCommon;
import macaca.client.MacacaClient;
import macaca.client.commands.Element;
import macaca.client.common.ElementSelector;

import java.util.List;

/**
 * Created by admin on 2017/9/7.
 */
public class RemindPage {
    private MacacaClient appiumDriver;
    private RemindBean remindBean;

    public RemindPage(MacacaClient appiumDriver){
        this.appiumDriver = appiumDriver;
        remindBean = new RemindBean(appiumDriver);
    }
    //判断第几条的数据是否为视频动态
    public boolean isVideoFeed(int i){
        String xpath = "//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.RelativeLayout["+Integer.toString(i)+"]/android.widget.RelativeLayout[2]/android.widget.ImageView[1]";
        remindBean.myPlaintext.setAndroidXpath(xpath);
        remindBean.myPlaintext.setDescription("视频图标");
        if (remindBean.myPlaintext.isExist()){
            return true;
        }else {
            return false;
        }
    }
    //点击第n条的提醒
    public void click_remind(int i){
        String xpath = "//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.RelativeLayout["+Integer.toString(i)+"]/android.widget.RelativeLayout[2]";
        remindBean.myPlaintext.setAndroidXpath(xpath);
        remindBean.myPlaintext.setDescription("提醒");
        remindBean.myPlaintext.click();
    }

    //点击第N条文字动态
    public void click_textFeed(int i){
        String xpath = "//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.RelativeLayout["+Integer.toString(i)+"]/android.widget.ImageView[1]";
        remindBean.myPlaintext.setAndroidXpath(xpath);
        remindBean.myPlaintext.setDescription("提醒");
        remindBean.myPlaintext.click();
    }
    //获取title
    public String getTitle(){
        return remindBean.title.getText();
    }
    //点击返回按钮
    public void click_back(){
        remindBean.back.click();
    }
    //获取第i条的提醒的用户名称
    public String getName(int i){
        String xpath = "android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.RelativeLayout["+Integer.toString(i)+"]/android.widget.TextView[1]";
        remindBean.myPlaintext.setAndroidXpath(xpath);
        remindBean.myPlaintext.setDescription("用户名称");
        return remindBean.myPlaintext.getText();
    }

    //获取第i条的提醒的时间
    public String getTime(int i){
        String xpath = "//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.RelativeLayout["+Integer.toString(i)+"]/android.widget.TextView[2]";
        remindBean.myPlaintext.setAndroidXpath(xpath);
        remindBean.myPlaintext.setDescription("时间");
        return remindBean.myPlaintext.getText();
    }

    //获取第i条的提醒的内容
    public String getContent(int i){
        String xpath = "//android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout["+Integer.toString(i)+"]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout[2]/android.widget.TextView[3]";
        remindBean.myPlaintext.setAndroidXpath(xpath);
        remindBean.myPlaintext.setDescription("内容");
        return remindBean.myPlaintext.getText();
    }
    //获取第N条的提醒的头像
    public void click_name(int i){
        String[] xpath = {"//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.RelativeLayout["+Integer.toString(i)+"]/android.widget.TextView[1]"};
        remindBean.myPlaintext.setAndroidXpath(xpath[0]);
        remindBean.myPlaintext.setDescription("头像");
        remindBean.myPlaintext.click();
    }
    //点击第N条视频动态
    public void click_video_feed(int i){
        DriverCommon.goSleep(1);
        String id = "com.zkj.guimi:id/video_flag_video";
        List<Element> elementSelector;
        try {
            elementSelector = appiumDriver.elementsById(id);
            elementSelector.get(i).click();
        } catch (Exception e) {
            throw new ProxyError(e.getMessage());
        }

    }

//    //点击第N条文字动态提醒
//    public void click_txt_feed( ){
//
//       for(int i = 1; i<=6;i++){
//           System.out.println("i:"+i);
//           try {
//               String xpth = "//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.RelativeLayout["+Integer.valueOf(i)+"]/android.widget.RelativeLayout[2]/android.widget.ImageView[1]";
//               Element webElement = appiumDriver.waitForElementByXPath(xpth);
//           }catch (NoSuchElementException e){
//               e.printStackTrace();
//               try {
//                   appiumDriver.waitForElementByXPath("//android.widget.ListView[@resource-id='com.zkj.guimi:id/list']/android.widget.RelativeLayout["+Integer.valueOf(i)+"]/android.widget.RelativeLayout[1]/android.widget.ImageView[1]").click();
//               } catch (Exception e1) {
//                   e1.printStackTrace();
//               }
//           }
//       }

//    }
}
