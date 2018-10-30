package com.xiaoaiai.Pages.MinePages;

import com.xiaoaiai.Utils.DriverCommon;
import com.xiaoaiai.PagesBeans.MineBeans.MineBean;
import macaca.client.MacacaClient;

public class MinePage {
    private MacacaClient macacaClient;
    private MineBean mineBean;

    public MinePage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        mineBean = new MineBean(macacaClient);
    }
    //获取用户的爱爱豆
    public String get_banlce(){
        String num = null;
        click_head();
        try {
            macacaClient.back();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String vii_tv_content = mineBean.vii_tv_content.findElemets().get(0).getText();
            num = mineBean.vii_tv_content.findElemets().get(0).getText().split("爱爱豆")[0];
        } catch (Exception e) {
            e.printStackTrace();
        }
        return num;
    }

    //获取title
    public String get_title(){
        return mineBean.txt_title.getText();
    }

    //获取昵称
    public String get_aaname(){
        return mineBean.aaName.getText();
    }

    //获取爱爱num
    public String get_aanum(){
        return mineBean.aaNum.getText().split(":")[1];
    }

    //点击头像进入到个人资料界面账号
    public void click_head(){
        mineBean.img_header.click();
    }

    //进入到充值中心
    public void go_recharge(){
        mineBean.recharge_center.click();
    }

    //进入到会员中心
    public void go_vip(){
        mineBean.vip_center.click();
    }

    //进入到成长中心
    public void go_growup(){
        mineBean.growup_centor.click();
    }

    //进入到游戏大厅
    public void go_game(){
        mineBean.game_centor.click();
    }

    //进入到许愿夺宝
    public void go_wish(){
        mineBean.wish_centor.click();
    }

    //进入到我的玩具
    public void go_tool(){
        mineBean.tools_centor.click();
    }

    //进入到设置
    public void go_setting(){
        try {
          DriverCommon.swipeToUp(macacaClient,1,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        mineBean.setting.click();
    }

    //进入到帮助
    public void go_help(){
        mineBean.help.click();
    }

    //进入到反馈
    public void go_feedback(){
        mineBean.feedback.click();
    }

    //进入到分享
    public void go_share(){
        mineBean.share.click();
    }

    //进入到关于
    public void about(){
        mineBean.abuot.click();
    }
}
