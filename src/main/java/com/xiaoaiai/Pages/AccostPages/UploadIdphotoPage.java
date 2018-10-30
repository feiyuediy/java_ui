package com.xiaoaiai.Pages.AccostPages;


import com.xiaoaiai.Pages.CommonPages.PhotoSelectPage;
import com.xiaoaiai.PagesBeans.AccostBeans.UploadIdphotoBean;
import com.xiaoaiai.Utils.DriverCommon;
import macaca.client.MacacaClient;

/**
 * Created by admin on 2017/9/4.
 */
public class UploadIdphotoPage {
    private UploadIdphotoBean uploadIdphotoBean;
    private MacacaClient appiumDriver;

    public UploadIdphotoPage(MacacaClient appiumDriver){
        this.appiumDriver = appiumDriver;
        uploadIdphotoBean = new UploadIdphotoBean(appiumDriver);
    }
    //点击返回按钮
    public void click_back(){
        uploadIdphotoBean.back.click();
    }
    //获取标题
    public  String getTile(){
        return uploadIdphotoBean.title.getText();
    }

    //获取id照片状态
    public String getIdphotostatiu(){
        return uploadIdphotoBean.aeip_tile.getText();
    }
    //点击更新id照片
    public void click_uploadIdphoto(){
        uploadIdphotoBean.upIdpthotoButoon.click();
    }

    //点击删除按钮
    public void click_delete(){
        uploadIdphotoBean.delectIdphoto.click();
    }
    //点击拍照
    public void click_camera(){
        uploadIdphotoBean.camera.click();
    }
    //点击从手机相册中选择
    public void click_selectphone(){
        uploadIdphotoBean.selectphone.click();
    }
    //点击取消按钮
    public void click_cance(){
        uploadIdphotoBean.clance.click();
    }

    //判断更新浮层是否存在
    public boolean is(){
        return uploadIdphotoBean.camera.isExist();
    }

    //获取删除弹窗tips
    public String getDelectTips(){
        return uploadIdphotoBean.tips.getText();
    }
    //点击删除弹窗中的取消
    public void click_deleteCance(){
        uploadIdphotoBean.delectCanleButton.click();
    }
    //点击删除弹窗中的确定
    public void click_deleteSure(){
        uploadIdphotoBean.delectSureButton.click();
    }
    //判断删除弹窗是否存在
    public boolean isdelect(){
        return uploadIdphotoBean.tips.isExist();
    }
    //判断是否存在更新id照按钮
    public boolean isExitUpload(){
        return uploadIdphotoBean.upIdpthotoButoon.isExist();
    }
    //点击id照
    public void click_idphoto(){
        uploadIdphotoBean.idphoto.click();
    }

    //上传id照
    public void upload(){
        click_idphoto();
        click_selectphone();
        DriverCommon.Hand_permission(appiumDriver);
        PhotoSelectPage photoSelectPage = new PhotoSelectPage(appiumDriver);
        photoSelectPage.selectPhoto();
        click_uploadIdphoto();

    }
    //获取审核中、更新上传等按钮的问题
    public String getUploadText(){
        return uploadIdphotoBean.upIdpthotoButoon.getText();
    }

//    //获取审核中是否能点击
//    public boolean getUploadUncheck(){
//        return uploadIdphotoBean.upIdpthotoButoon.
//    }
}
