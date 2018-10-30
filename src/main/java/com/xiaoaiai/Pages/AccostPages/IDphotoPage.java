package com.xiaoaiai.Pages.AccostPages;

import com.xiaoaiai.PagesBeans.AccostBeans.idPhotoBean;
import macaca.client.MacacaClient;

/**
 * Created by admin on 2017/9/4.
 */
public class IDphotoPage {
    private idPhotoBean idphotoBean;
    private MacacaClient appiumDriver;

    public IDphotoPage(MacacaClient appiumDriver){
        this.appiumDriver = appiumDriver;
        idphotoBean = new idPhotoBean(appiumDriver);
    }
    //点击上传按钮
    public void click_upload(){
        idphotoBean.upload.click();
    }
    //获取title
    public String getTile(){
        return idphotoBean.title.getText();
    }
    //切换榜单
    public void changeList(String name){
        idphotoBean.rightTable.click();
        if (name.equals("最近在线")) {
            idphotoBean.newUpdata.click();

        } else if (name.equals("最近注册")) {
            idphotoBean.newReght.click();

        } else if (name.equals("最近更新")) {
            idphotoBean.newUpdata.click();

        } else if (name.equals("进入热门")) {
            idphotoBean.todatHot.click();
        }
    }
    //点击第N个人的id照
    public void click_idphoto(){
        idphotoBean.fristidPhtot.click();
    }
}
