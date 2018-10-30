package com.xiaoaiai.Pages.MinePages;

import com.sun.org.apache.regexp.internal.RE;
import com.xiaoaiai.PagesBeans.MineBeans.AccountEditBean;
import macaca.client.MacacaClient;

import java.util.ArrayList;
import java.util.List;

public class AccountEditPage {
    private MacacaClient macacaClient;
    private AccountEditBean accountEditBean;

    public AccountEditPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        accountEditBean = new AccountEditBean(macacaClient);
    }
    //返回
    public void back(){
        accountEditBean.back.click();
    }
    //获取标题
    public String getTitle(){
        return accountEditBean.txt_title.getText();
    }

    //获取昵称
    public String getNickName(){
        return accountEditBean.nickName.getText();
    }

    //进行修改头像界面
    public void goEditHead(){
        accountEditBean.api_layout_header.click();
    }
    //进入到修改昵称界面
    public void goEditNickName(){
        accountEditBean.nickName.click();
    }

    //进入到id照片界面
    public void goIdphotoUpload(){
        accountEditBean.idphoto.click();
    }

    //获取爱爱号
    public String getAiaiNum(){
        return accountEditBean.aiaiNum.getText();
    }
    //获取性别
    public String getSex(){
        return accountEditBean.sex.getText();
    }
    //获取地区
    public String getAddr(){
        return accountEditBean.addr.getText();
    }
    //进入到修改地区
    public void goEditAddr(){
        accountEditBean.addr.click();
    }
    //获取年龄
    public String getAge(){
        return accountEditBean.age.getText();
    }
    //进入到修改年龄
    public void goEditAge(){
        accountEditBean.age.click();
    }
    //获取星座
    public String getConstellation(){
        return accountEditBean.constellation.getText();
    }
    //获取个性签名
    public String getSignature(){
        return accountEditBean.api_tv_signature.getText();
    }
    //进入到修改个性签名
    public void goEditSignature(){
        accountEditBean.api_tv_signature.click();
    }
    //进入到修改语音签名界面
    public void goEditeVoiceSignature(){
        accountEditBean.voiceSignature.click();
    }

    //获取个性标签
    public List<String> getTags(){
        List<String> tags = new ArrayList<String>();
        for (int i = 0; i < 9; i++){
            String id = "com.zkj.guimi:id/iul_tv_label" + String.valueOf(i);
            try{
                String tag = macacaClient.elementById(id).getText();
                tags.add(tag);
            }catch (Exception e){
                break;
            }
        }
        return tags;
    }
    //进入到修改个性标签界面
    public void goEditTags(){
        accountEditBean.tags.click();
    }

    //增加一张头像
    public void addHeadImg(){
        goEditHead();

        HeadEditPage headEditPage = new HeadEditPage(macacaClient);
        headEditPage.addHeadImg();
        headEditPage.back();
    }
    //删除一张头像
    public void deleteHeadImg(int i){
        goEditHead();

        HeadEditPage headEditPage = new HeadEditPage(macacaClient);
        headEditPage.deleteHeadImg(i);
        headEditPage.back();
    }

    //修改昵称
    public void modifyNick(String msg){
        goEditNickName();

        NickNameEditPage editPage = new NickNameEditPage(macacaClient);
        editPage.modifyNickName(msg);
    }

    //修改城市
    public void modifyAddr(String city){
        goEditAddr();

        AddrEditPage addrEditPage = new AddrEditPage(macacaClient);
        addrEditPage.modifyAdd(city);
    }

    //修改年龄
    public void modifyAge(String year, String mon, String day){
        goEditAge();

        AgeEditPage ageEditPage = new AgeEditPage(macacaClient);
        ageEditPage.modifyAge(year, mon, day);
    }

    //修改个性签名
    public void modifySignature(String msg){
        goEditSignature();

        SignatureEditPage signatureEditPage = new SignatureEditPage(macacaClient);
        signatureEditPage.modifySignature(msg);
        signatureEditPage.back();
    }




}
