package com.xiaoaiai.Pages.FindPages;

import com.xiaoaiai.PagesBeans.FindBeans.RecordVideoBean;
import macaca.client.MacacaClient;

/**
 * Created by admin on 2017/9/7.
 */
public class RecordVideoPage {
    private RecordVideoBean recordVideoBean;
    private MacacaClient appiumDriver;
    public RecordVideoPage(MacacaClient appiumDriver){
        this.appiumDriver = appiumDriver;
        recordVideoBean = new RecordVideoBean(appiumDriver);
    }

    //点击关闭按钮
    public void click_colse(){
        recordVideoBean.close.click();
    }
    //点击旋转摄像头
    public void click_swithc_camera(){
        recordVideoBean.switch_camera.click();
    }
    //点击删除按钮
    public void click_delete(){
        recordVideoBean.delete.click();
    }
    //判断删除按钮是否存在
    public boolean isDeleteExist(){
        return recordVideoBean.delete.isExist();
    }
    //点击打开文件夹
    public void click_open_folder(){
        recordVideoBean.open_folder.click();
    }
    //点击录制按钮
    public void click_record(){
        recordVideoBean.record.click();
    }
    //点击滤镜
    public void click_hx_effect(){
        recordVideoBean.hx_effect.click();
    }
    //点击完成按钮
    public void click_concat(){
        recordVideoBean.concat.click();
    }

    //判断完成按钮是否存在
    public boolean isConcatExist(){
        if (recordVideoBean.concat.isExist()){
            return true;
        }else {
            return false;
        }

    }

    //判断弹窗是存在

    public boolean isExitDialog(){
        if (recordVideoBean.dialog_ok.isExist()){
            return true;
        }else {
            return false;
        }
    }
    //获取弹窗中的提示语
    public String get_dialog_title(){
        return recordVideoBean.dialog_content.getText();
    }
    //点击弹窗中的取消按钮
    public void click_dialog_cancle(){
        recordVideoBean.dialog_cancel.click();
    }
    //点击弹窗中的确定按钮
    public void click_dialog_ok(){
        recordVideoBean.dialog_ok.click();
    }

//    //根据进度条判断是否已经录制
//    public boolean isRecord(){
//        if(Common.comparePint("E:\\Temp\\1111.png", Screenshot.snapshotWithElement(appiumDriver,recordVideoBean.record_progressbar.toWebElement()),90)){
//            return false;
//        }else {
//            return true;
//        }
//    }

    //选取本地视频
    public void selectLocalVideo(){
        recordVideoBean.open_folder.click();
        LoadVideoPage loadVideoPage = new LoadVideoPage(appiumDriver);
        loadVideoPage.click_machTimeVideo();
        PreviewVideoPage previewVideoPage = new PreviewVideoPage(appiumDriver);
        previewVideoPage.click_sure();
    }
}
