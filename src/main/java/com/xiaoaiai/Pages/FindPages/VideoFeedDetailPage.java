package com.xiaoaiai.Pages.FindPages;

import com.xiaoaiai.PagesBeans.FindBeans.VideoFeedDetailBean;
import macaca.client.MacacaClient;

/**
 * Created by admin on 2017/9/13.
 */
public class VideoFeedDetailPage {
    private MacacaClient appiumDriver;
    private VideoFeedDetailBean videoFeedDetailBean;

    public VideoFeedDetailPage(MacacaClient appiumDriver){
        this.appiumDriver = appiumDriver;
        videoFeedDetailBean = new VideoFeedDetailBean(appiumDriver);
    }

    //点击头像
    public void click_headImg(){
        videoFeedDetailBean.headImg.click();
    }
    //获取用户名
    public String getName(){
        return videoFeedDetailBean.name.getText();
    }
    //获取用户等级
    public String getLevel(){
        return videoFeedDetailBean.level.getText();
    }
    //点击关注按钮
    public void click_flow(){
        videoFeedDetailBean.followImg.click();
    }

    //点击关注按钮
    public void click_close(){
        videoFeedDetailBean.close.click();
    }

    //点击播放按钮
    public void click_play(){
        videoFeedDetailBean.play.click();
    }
    //点击礼物列表中的头像
    public void click_gift_list_headimg(){
        videoFeedDetailBean.gift_list_headImg.click();
    }
    //点击更多礼物
    public void click_moreGift(){
        videoFeedDetailBean.moreGift.click();
    }
    //点击举报按钮
    public void click_report(){
        videoFeedDetailBean.report.click();
    }
    //点击送礼icomo
    public void click_smol_gift(){
        videoFeedDetailBean.giftImg.click();
    }
    //点击点赞按钮
    public void click_zan(){
        videoFeedDetailBean.likeImg.click();
    }
    //点击评论icon
    public void click_commentImg(){
        videoFeedDetailBean.commentImg.click();
    }
    //点击打的送礼按钮
    public void click_big_giftImg(){
        videoFeedDetailBean.giveGiftImg.click();
    }
    //输入评论
    public void editComment(String com){
        videoFeedDetailBean.commontEdit.input(com);
    }
    //点击评论按钮
    public void click_commont(){
        videoFeedDetailBean.commontButton.click();
    }
}
