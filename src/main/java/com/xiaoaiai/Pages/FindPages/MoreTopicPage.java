package com.xiaoaiai.Pages.FindPages;


import com.lazy.exceptions.ProxyError;
import com.xiaoaiai.PagesBeans.FindBeans.MoreTopicBean;
import macaca.client.MacacaClient;
import macaca.client.commands.Element;
import macaca.client.common.ElementSelector;

import java.util.List;

/**
 * Created by admin on 2017/9/11.
 */
public class MoreTopicPage {
    private MoreTopicBean moreTopicBean;
    private MacacaClient appiumDriver;
    public MoreTopicPage(MacacaClient appiumDriver){
        this.appiumDriver = appiumDriver;
        moreTopicBean = new MoreTopicBean(appiumDriver);
    }

    //点击返回按钮
    public void click_back(){
        moreTopicBean.back.click();
    }

    //检查返回按钮是否存在
    public boolean isBackExit(){
        return moreTopicBean.back.isExist();
    }

    //获取页面的title
    public String getTitle(){
        return moreTopicBean.title.getText();
    }
    //点击右上角的编辑按钮
    public void click_edit(){
        moreTopicBean.editFeedButton.click();
    }

    //检查编辑按钮是否存在
    public boolean isEditExit(){
        return moreTopicBean.editFeedButton.isExist();
    }

    //点击推荐中的第N个推荐
    public void click_recommend(int i){
        String xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/list_view']/android.widget.RelativeLayout["+Integer.toString(i)+"]/android.widget.ImageView[1]";
        String desc = "推荐";
        moreTopicBean.recommendTopicContainer.setAndroidXpath(xpath);
        moreTopicBean.recommendTopicContainer.setDescription(desc);
        moreTopicBean.recommendTopicContainer.click();
    }

    //获取第N个话题列表的名称
    public String getTopicName(int i){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<Element> elementSelector = moreTopicBean.name.findElemets();
        try {
            return elementSelector.get(i).getText();
        } catch (Exception e) {
            throw new ProxyError(e.getMessage());
        }
//        List<WebElement>  list = appiumDriver.findElements(By.id("com.zkj.guimi:id/name"));
//        WebElement webElement = list.get(i);
//        return webElement.getText();
    }

    //获取第N个话题列表的描述
    public String getTopicDesc(int i){
        String xpath = "//android.widget.FrameLayout[1]/android.view.View[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout["+Integer.toString(i+1)+"]/android.widget.RelativeLayout[1]/android.widget.TextView[3]";
        String desc = "描述";
        moreTopicBean.topicDiscription.setAndroidXpath(xpath);
        moreTopicBean.topicDiscription.setDescription(desc);
        return moreTopicBean.topicDiscription.getText();
    }

    //获取第N个话题列表的数量
    public String getTopicNum(int i){
        String xpath = "//android.widget.FrameLayout[1]/android.view.View[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.RelativeLayout[1]/android.widget.ListView[1]/android.widget.RelativeLayout["+Integer.toString(i+1)+"]/android.widget.RelativeLayout[1]/android.widget.TextView[2]";
        String desc = "数量";
        moreTopicBean.topicNum.setAndroidXpath(xpath);
        moreTopicBean.topicNum.setDescription(desc);
        return moreTopicBean.topicNum.getText();
    }
    //点击第N个话题列表中的话题
    public void click_topic(int i){
        List<Element> elementSelector = moreTopicBean.name.findElemets();
        try {
            elementSelector.get(i).click();
        } catch (Exception e) {
            throw new ProxyError(e.getMessage());
        }
    }
//
//    //推荐话题滑动
//    public void swipRecommend(int from, int to){
//        String xpath = "//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/list_view']/android.widget.RelativeLayout[" + Integer.toString(from) + "]/android.widget.ImageView[1]";
//        String desc = "推荐";
//        moreTopicBean.recommendTopicContainer.setAndroidXpath(xpath);
//        moreTopicBean.recommendTopicContainer.setDescription(desc);
//        WebElement viewform = moreTopicBean.recommendTopicContainer.toWebElement();
//
//        String[] xpath1 = {"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/list_view']/android.widget.RelativeLayout[" + Integer.toString(to) + "]/android.widget.ImageView[1]"};
//        String desc1 = "推荐";
//        moreTopicBean.recommendTopicContainer.setXpath(xpath1);
//        moreTopicBean.recommendTopicContainer.setDescription(desc1);
//        WebElement viewto = moreTopicBean.recommendTopicContainer.toWebElement();
//        DriverCommon.swipeElementToElement(appiumDriver,viewform,viewto);
//    }

//    //截图第一个推荐话题的图片
//    public String screenshotFristRecommendImg(){
//        return Screenshot.snapshotWithElement(appiumDriver,moreTopicBean.fristRecommendImg.toWebElement());
//    }
//
//    //点击更多推荐圈子按钮
//    public void click_moreRecommendTopic(){
//        swipRecommend(3,1);
//        String[] xpath = {"//android.support.v7.widget.RecyclerView[@resource-id='com.zkj.guimi:id/list_view']/android.widget.RelativeLayout[4]/android.widget.ImageView[1]"};
//        moreTopicBean.recommendTopicContainer.setXpath(xpath);
//        moreTopicBean.recommendTopicContainer.click();
//    }

    //检查没有过多数据是否存在
    public boolean isExitState(){
        return moreTopicBean.state.isExist();
    }

    //获取state的文字
    public String getStateTxt(){
        return moreTopicBean.state.getText();
    }

}
