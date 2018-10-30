package com.xiaoaiai.Pages.MinePages;

import com.xiaoaiai.Utils.DriverCommon;
import com.xiaoaiai.PagesBeans.MineBeans.SettingBean;
import macaca.client.MacacaClient;

public class SettingPage {
    private MacacaClient macacaClient;
    private SettingBean settingBean;

    public SettingPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        settingBean = new SettingBean(macacaClient);
    }
    //点击返回
    public void click_back(){
        settingBean.back.click();
    }

    //退出登录
    public void click_quit()  {
        DriverCommon.swipeToUp(macacaClient,1,1);
        settingBean.quitLogin.click();
    }
}
