package com.xiaoaiai.Pages.FindPages;


import com.xiaoaiai.PagesBeans.FindBeans.UploadVideoBean;
import macaca.client.MacacaClient;

/**
 * Created by admin on 2017/9/7.
 */
public class UploadVideoPage {
    private UploadVideoBean uploadVideoBean;
    private MacacaClient appiumDriver;
    public UploadVideoPage(MacacaClient appiumDriver){
        this.appiumDriver = appiumDriver;
        uploadVideoBean = new UploadVideoBean(appiumDriver);
    }

    public void click_back(){
        uploadVideoBean.back.click();
    }
    public void mix_music(){
        uploadVideoBean.mix_music.click();
    }
    public void cuc_img(){
        uploadVideoBean.img_cut.click();
    }
    public void click_upload(){
        uploadVideoBean.upload.click();
    }
    public void add_content(String text){
        uploadVideoBean.video_content.input(text);
    }
    //判断上传进度条是否存在
    public boolean isDialog_progressbarExit(){
        if (uploadVideoBean.dialog_progressbar.isExist()){
            return true;
        }else {
            return false;
        }
    }
    //判断上传成功弹窗是否存在
    public boolean isOkExit(){

        if (uploadVideoBean.dc_dialog_btn_ok.isExist()){
            return true;
        }else {
            return false;
        }
    }
    //点击上传成功弹窗中的我知道了
    public void click_ok(){

        uploadVideoBean.dc_dialog_btn_ok.click();
    }
    //获取上传成功的文字
    public String get_ok_title(){
        return uploadVideoBean.dc_dialog_txt_content.getText();
    }
}
