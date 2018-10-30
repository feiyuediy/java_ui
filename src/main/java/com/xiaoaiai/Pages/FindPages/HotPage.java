package com.xiaoaiai.Pages.FindPages;


import com.xiaoaiai.PagesBeans.FindBeans.HotBean;
import com.xiaoaiai.Utils.DriverCommon;
import macaca.client.MacacaClient;

/**
 * Created by admin on 2017/9/5.
 */
public class HotPage {
    private HotBean hotBean;
    private MacacaClient appiumDriver;

    public HotPage(MacacaClient appiumDriver) {
        this.appiumDriver = appiumDriver;
        hotBean = new HotBean(appiumDriver);
    }

    //点击消息提醒
    public void click_remind() {
        hotBean.icon_left.click();
    }

    //获取页面title
    public String getTitle() {
        return hotBean.title.getText();
    }

    //点击发布按钮
    public void click_publsh()  {
        hotBean.icon_right.click();

    }

    //点击视频按钮
    public void click_video() {
        hotBean.video.click();
        //处理权限弹窗
        DriverCommon.Hand_permission(appiumDriver);
        DriverCommon.Hand_permission(appiumDriver);
    }

    //点击关注按钮
    public void click_follow() {
        hotBean.follow.click();
    }

    //判断轮播图片是否存在
    public boolean isExitBanner() {
        return hotBean.banner.isExist();
    }


    //点击banner
    public void click_banner() {
        hotBean.banner.click();
    }

    //判断轮播话题是否存在
    public boolean isExitCRToptic() {
        System.out.println(hotBean.carouselDesc.isExist());
        System.out.println(hotBean.carouselImg.isExist());
        System.out.println(hotBean.carouselTopic.isExist());
        if (hotBean.carouselDesc.isExist() && hotBean.carouselImg.isExist() && hotBean.carouselTopic.isExist()) {
            return true;
        } else {
            return false;
        }
    }

    //点击轮播话题
    public void click_CRToptic() {
        hotBean.carouselTopic.click();
    }

    //点击更多圈子
    public void cick_moreTopic() {
        hotBean.moreTopics.click();
    }

    //判断发布动态弹窗是否存在
    public boolean isExitFeed() {
        return hotBean.vedioFeed.isExist();
    }

    //点击发布视频feed
    public void click_publisc_vedio() {
        hotBean.vedioFeed.click();
        //处理弹窗
        try{
            DriverCommon.Hand_permission(appiumDriver);
            DriverCommon.Hand_permission(appiumDriver);
            DriverCommon.Hand_permission(appiumDriver);
            click_publsh();
            hotBean.vedioFeed.click();
        }catch(Exception e){
            System.out.println("木有权限弹窗");
        }


    }

    //点击发布文字/图片feed
    public void click_publish_text() {
        hotBean.textFeed.click();
    }

    //点击取消
    public void click_cancle_publish() {
        hotBean.cancel.click();
    }

    //检查发布人标签存在
    public boolean isExitPublisherTag() {
        if (hotBean.publisherLevel.isExist() && hotBean.publisherGender.isExist() && hotBean.publishDevice.isExist()
                &&  hotBean.publishAfNum1.isExist() && hotBean.publishAfNum2.isExist()) {
            return true;
        } else {
            return false;
        }
    }

    //点击动态中的头像
    public void click_head() {
        hotBean.headImg.click();
    }

    //点击动态
    public void click_feed() {
        hotBean.publishAfNum2.click();
    }

    //点击动态中的图片
    public void click_img() {
        hotBean.pic_container.click();
    }

    //点击动态标签
    public void click_topicTags() {
        hotBean.topicTag.click();
    }

    //点击动态中的举报按钮
    public void click_report() {
        hotBean.report.click();
    }

    //判断举报弹窗是否弹出
    public boolean repotrFrameIsExit() {
        return hotBean.advertisingHarassment.isExist();
    }

    //点击举报弹窗中的取消
    public void click_cancle_report() {
        hotBean.cancelReport.click();
    }

    //点击举报弹窗中的确定按钮
    public void click_confirm_report() {
        hotBean.confirmReport.click();
    }

    //点击评论按钮
    public void click_comment() {
        hotBean.comment.click();
    }

    //点击点赞列表头像中的头像
    public void click_zan_imgHead() {
        if (hotBean.zan_imgHead1.isExist()) {
            hotBean.zan_imgHead1.click();
        } else {

            System.out.println("没有点赞人");
        }
    }

    //点击点赞列表按钮
    public void click_zan_more() {
        if (hotBean.zan_more.isExist()) {
            hotBean.zan_more.click();
        } else {

        }
    }

    //点赞按钮
    public void click_zan() {
        hotBean.zan.click();
    }

    //获取点赞人数
    public String get_zan_num() {
        return hotBean.zanNum.getText();
    }

}

