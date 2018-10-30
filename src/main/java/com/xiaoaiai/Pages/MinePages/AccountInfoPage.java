package com.xiaoaiai.Pages.MinePages;

import com.lazy.exceptions.NoSuchElementException;
import com.lazy.exceptions.ProxyError;
import com.sun.org.apache.regexp.internal.RE;
import com.xiaoaiai.PagesBeans.MineBeans.AccountInfoBean;
import macaca.client.MacacaClient;
import macaca.client.commands.Element;
import macaca.client.common.ElementSelector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AccountInfoPage {
    private MacacaClient macacaClient;
    private AccountInfoBean accountInfoBean;

    public AccountInfoPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        accountInfoBean = new AccountInfoBean(macacaClient);
    }

    //返回
    public void back(){
        accountInfoBean.back.click();
    }

    //获取title
    public String getTitle(){
        return accountInfoBean.txt_title.getText();
    }

    //进入到编辑
    public void goEdit(){
        accountInfoBean.edit.click();
    }

    //获取活跃时间
    public String getActive(){
        return accountInfoBean.au_tv_active_time.getText();
    }
    //获取昵称
    public String getNick(){
        return accountInfoBean.au_tv_name.getText();
    }
    //获取性别
    public String getSex(){
        return accountInfoBean.au_tv_sex.getText();
    }
    //获取年龄
    public String getAge(){
        return accountInfoBean.au_tv_age.getText();
    }
    //获取星座
    public String getConstellation(){
        return accountInfoBean.au_tv_constellation.getText();
    }
    //获取等级
    public String getLevel(){
        return accountInfoBean.level.getText();
    }
    //判断是有连接过设备
    public boolean isDevice(){
        return accountInfoBean.au_img_device_state.isExist();
    }
    //获取魅力值
    public String getCharmValue(){
        return accountInfoBean.au_tv_charm_value.getText();
    }
    //获取财富值
    public String getWealthValue(){
        return accountInfoBean.au_tv_wealth_value.getText();
    }
    //获取访客数量
    public String getVisitor(){
        return accountInfoBean.iuh_tv_visitor.getText();
    }
    //获取粉丝数量
    public String getFans(){
        return accountInfoBean.iuh_tv_favourite.getText();
    }
    //获取爱爱豆
    public String getWealth(){
        return accountInfoBean.iuh_tv_wealth.getText();
    }
    //点击更多动态
    public void clickMoreFeed(){
        accountInfoBean.au_layout_news_more_above4.click();
    }
    //点击第N个动态
    public void clickFeed(int i){
        if (i>4){
            throw new NoSuchElementException("超过了4个了");
        }else {
            List<Element> elementSelector =  accountInfoBean.lsn_img_news.findElemets();
            try {
                elementSelector.get(i-1).click();
            } catch (Exception e) {
                throw new ProxyError(e.getMessage());
            }
        }
    }
    //判断第N个动态是否是视频动态
    public boolean isVideoFeed(int i){
        String xpath = "//android.widget.RelativeLayout[@resource-id='com.zkj.guimi:id/au_view_news_"+i+"']/android.widget.RelativeLayout[1]/android.widget.ImageView[2]";
        try {
            macacaClient.elementByXPath(xpath);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    //点击更多礼物
    public void clickMoreGift(){
        accountInfoBean.au_img_gift_more.click();
    }
    //获取爱爱号
    public String getAiaiNum(){
        return accountInfoBean.au_tv_aiai_num.getText();
    }
    //获取地区
    public String getAddr(){
        return accountInfoBean.au_tv_aiai_addr.getText();
    }
    //获取个性签名
    public String getSignature(){
        return accountInfoBean.au_tv_signature.getText();
    }
    //获取标签列表
    public List<String> getTag(){
        List<String> tags = new ArrayList<String>();
        for (int i = 1;i < 9; i++ ){
            String id = "com.zkj.guimi:id/iul_tv_label"+String.valueOf(i);
            try{
                String tag = macacaClient.elementById(id).getText();
                tags.add(tag);
            }catch (Exception e){
                break;
            }
        }
        return tags;
    }

    //获取大照片的个数
    public int getPhotoNum(){
        int num = 0;
        for (int i = 1; i < 9; i++){
            try{
                macacaClient.elementById("com.zkj.guimi:id/ipwi_img_indicator"+String.valueOf(i));
                num = i;
            }catch (Exception e){
                break;
            }
        }

        return num;
    }
}
