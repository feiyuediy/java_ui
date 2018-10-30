package com.xiaoaiai.Pages.MinePages;

import com.xiaoaiai.Pages.CommonPages.PhotoSelectPage;
import com.xiaoaiai.Pages.CommonPages.PreviewImgPage;
import com.xiaoaiai.PagesBeans.MineBeans.HeadEditBean;
import com.xiaoaiai.Utils.DriverCommon;
import macaca.client.MacacaClient;
import macaca.client.commands.Element;

public class HeadEditPage {
    private MacacaClient macacaClient;
    private HeadEditBean headEditBean;

    public HeadEditPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        headEditBean = new HeadEditBean(macacaClient);
    }

    //点击返回
    public void back(){
        headEditBean.back.click();
    }
    //获取标题
    public String getTitle(){
        return headEditBean.title.getText();
    }
    //点击保存
    public void save(){
        headEditBean.save.click();
    }

    //增加一张头像,随机的选取
    public void addHeadImg(){
        int size = headEditBean.headImg.findElemets().size();
        try {
            headEditBean.headImg.findElemets().get(size-1).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        headEditBean.dchi_tv_select_from_phone.click();
        DriverCommon.Hand_permission(macacaClient);
        //随机选择一张相片
        PhotoSelectPage photoSelectPage = new PhotoSelectPage(macacaClient);
        photoSelectPage.select_photoByint(1);
        //预览界面点击确定
        PreviewImgPage previewImgPage = new PreviewImgPage(macacaClient);
        previewImgPage.sure();
        //点击保存
        save();
    }
    //删除第N张头像
    public void deleteHeadImg(int i){
        try {
            headEditBean.headImg.findElemets().get(i).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
        headEditBean.dchi_tv_delete.click();
        save();
    }
}
