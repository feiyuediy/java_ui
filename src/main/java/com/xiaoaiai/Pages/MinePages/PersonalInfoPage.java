package com.xiaoaiai.Pages.MinePages;

import com.lazy.exceptions.NoSuchElementException;
import com.xiaoaiai.PagesBeans.MineBeans.PersonalInfoBean;
import macaca.client.MacacaClient;
import org.apache.log4j.Logger;

//客人态个人资料
public class PersonalInfoPage {
    private MacacaClient macacaClient;
    private PersonalInfoBean personalInfoBean;
    private Logger logger = Logger.getLogger(PersonalInfoPage.class);

    public PersonalInfoPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        personalInfoBean = new PersonalInfoBean(macacaClient);
    }

    //点击返回按钮
    public void click_back(){
        personalInfoBean.back.click();
    }

    //获取标题
    public String get_title(){
        return personalInfoBean.txt_title.getText();
    }

    //获取活跃时间
    public String get_active_time(){
        return personalInfoBean.au_tv_active_time.getText();
    }

    //获取昵称
    public String get_name(){
        return personalInfoBean.au_tv_name.getText();
    }

    //获取性别
    public String get_sex(){
        return personalInfoBean.au_tv_sex.getText();
    }

    //判断是否拉黑
    public boolean isBlack(){
        String txt = personalInfoBean.iuo_tv_black.getText();
        if (txt.equals("拉黑/举报")){
            return false;
        }else {
            return true;
        }
    }

    //进入拉黑操作
    public void black(){
        boolean status = isBlack();
        if (status){
            logger.info("已经拉黑了");
        }else {
            personalInfoBean.iuo_tv_black.click();
            personalInfoBean.dbp_tv_ban_person.click();
        }
    }

    //取消拉黑
    public void unblack() {
        boolean status = isBlack();
        if (status) {
            personalInfoBean.iuo_tv_black.click();
            personalInfoBean.dialog_btn_ok.click();
        } else {
            logger.info("没有被拉黑");
        }
    }

    //举报
    public void report(){
        logger.info("没有实现");
    }

    //点击聊天进入到聊天界面
    public void click_chat(){
        personalInfoBean.au_layout_chat.click();
    }

    //发起语音
    public void lauch_voice(){
        personalInfoBean.iite_voice_call.click();
        personalInfoBean.voice.click();
        try{
            personalInfoBean.dc_dialog_btn_ok.click();
        }catch (NoSuchElementException e){
            logger.info("好友关系，没有弹出收费弹窗");
        }
    }

    //发起视频
    public void lauch_video(){
        personalInfoBean.iite_voice_call.click();
        personalInfoBean.video.click();
        try{
            personalInfoBean.dc_dialog_btn_ok.click();
        }catch (NoSuchElementException e){
            logger.info("好友关系，没有弹出收费弹窗");
        }

    }

    //点击约跳
    public void lauch_yuetiao(){
        personalInfoBean.yuetiao.click();
        try{
            personalInfoBean.dc_dialog_btn_ok.click();
        }catch (NoSuchElementException e){
            logger.info("好友关系，没有弹出收费弹窗");
        }
    }

    //关注此人
    public void attion(){
        personalInfoBean.iuo_img_favourite.click();
        try{
            personalInfoBean.dg_btn_confirm.click();
        }catch (Exception NoSuchElementException){

        }

    }
}
