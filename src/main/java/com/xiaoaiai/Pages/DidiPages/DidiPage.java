package com.xiaoaiai.Pages.DidiPages;

import com.lazy.exceptions.NoSuchElementException;
import com.xiaoaiai.PagesBeans.DidiBeans.DidiBean;
import com.xiaoaiai.Utils.DriverCommon;
import macaca.client.MacacaClient;

public class DidiPage {
    private MacacaClient macacaClient;
    private DidiBean didiBean;

    public DidiPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        didiBean = new DidiBean(macacaClient);
    }

    //进入设置界面
    public void gotoSetting(){
        didiBean.setting.click();
    }

    //进入帮助界面
    public void gotoHelp(){
        didiBean.help.click();
    }

    //获取标题
    public String getTitle(){
        return didiBean.title.getText();
    }

    //进入到互粉tab
    public void goFollow(){
        didiBean.follow_tab.click();
    }

    //进入到语音tab
    public void goVoice(){
        didiBean.voice_tab.click();
    }

    //进入到视频tab
    public void goVideo(){
        didiBean.video_tab.click();
    }

    //进入到约跳tab
    public void goYuetiao(){
        didiBean.yuetiao_tab.click();
    }

    //进入到卧底tab
    public void goWodi(){
        didiBean.wodi_tab.click();
    }

    //获取当前价格
    public String getPrice(){
        return didiBean.price.getText();
    }

    //点击di一下
    public void click_di(){
        didiBean.di.click();
    }

    //设置额外打赏
    public void setExtraReward(){
        didiBean.extraReward.click();
        try{
            Double width = Double.valueOf(macacaClient.getWindowSize().get("width").toString());
            Double height =  Double.valueOf(macacaClient.getWindowSize().get("height").toString());
            macacaClient.drag(width / 2, height * 8 / 9, width / 2, height *15/ 18,0.5);
        }catch (Exception e){
            e.printStackTrace();
        }
        didiBean.btnSubmit.click();
    }

    //设置捎话
    public void setTakeMsg(String msg){
        didiBean.takeMsg.click();

        TakeMsgPage takeMsgPage = new TakeMsgPage(macacaClient);
        takeMsgPage.setTakeMsg(msg);
    }
    //发起互粉didi
    public void launchFollow(){
        goFollow();
        click_di();
    }

    //发起语音didi
    public void launchVoice(boolean isReward, String msg){
        goVoice();
        if (isReward){
            setExtraReward();
        }
        setTakeMsg(msg);
        click_di();
        DriverCommon.Hand_permission(macacaClient,2);
        DriverCommon.Hand_permission(macacaClient,2);
        try{
            click_di();
        }catch (NoSuchElementException e){

        }
        try {
            didiBean.dc_dialog_btn_ok.click();
        }catch (NoSuchElementException e){

        }
    }

    //发起语音didi
    public void launchVoice(boolean isReward){
        goVoice();
        if (isReward){
            setExtraReward();
        }
        click_di();
        try {
            didiBean.dc_dialog_btn_ok.click();
        }catch (NoSuchElementException e){

        }
    }

    //发起视频
    public void launchVideo(boolean isReward, String msg){
        goVideo();
        if (isReward){
            setExtraReward();
        }
        setTakeMsg(msg);
        click_di();
        try {
            didiBean.dc_dialog_btn_ok.click();
        }catch (NoSuchElementException e){

        }
    }

    //发起视频
    public void launchVideo(boolean isReward){
        goVideo();
        if (isReward){
            setExtraReward();
        }
        click_di();
        try {
            didiBean.dc_dialog_btn_ok.click();
        }catch (NoSuchElementException e){

        }
    }

    //发起约跳
    public void launchYuetiao(boolean isReward){
        goYuetiao();
        if (isReward){
            setExtraReward();
        }
        click_di();
        try {
            didiBean.dc_dialog_btn_ok.click();
        }catch (NoSuchElementException e){

        }
    }
    //发起约跳
    public void launchYuetiao(boolean isReward,String msg){
        goYuetiao();
        if (isReward){
            setExtraReward();
        }
        setTakeMsg(msg);
        click_di();
        try {
            didiBean.dc_dialog_btn_ok.click();
        }catch (NoSuchElementException e){

        }
    }

    //发起玩卧底
    public void launchWoid(){
        goWodi();
        click_di();
    }


}
