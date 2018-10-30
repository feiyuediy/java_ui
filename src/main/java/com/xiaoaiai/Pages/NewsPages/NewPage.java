package com.xiaoaiai.Pages.NewsPages;

import com.lazy.exceptions.NoSuchElementException;
import com.xiaoaiai.Moudle.BaseCase;
import com.xiaoaiai.PagesBeans.NewsBeans.NewTabBean;
import com.xiaoaiai.Utils.DriverCommon;
import macaca.client.MacacaClient;
import macaca.client.common.ElementSelector;

import javax.xml.bind.Element;
import java.util.List;

public class NewPage {
    private MacacaClient macacaClient;
    private NewTabBean newTabBean;

    public NewPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        newTabBean = new NewTabBean(macacaClient);
    }

    //获取第N个消息的昵称
    public String get_name(int i){
        String name = null;
        List<macaca.client.commands.Element> elementSelector = newTabBean.name.findElemets();
        try {
            name = elementSelector.get(i-1).getText();
        } catch (Exception e) {
            throw new NoSuchElementException(e.getMessage());
        }
        return name;
    }

    //点击第N条消息
    public void click_new(int i){
        List<macaca.client.commands.Element> elementSelector = newTabBean.name.findElemets();
        try {
            elementSelector.get(i-1).click();
        } catch (Exception e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    //删除第N条消息
    public void delect_new(int i){
        //假如是安卓
        if (BaseCase.platform.equals("android")){
            //长按弹出对话框
            List<macaca.client.commands.Element> elementSelector = newTabBean.name.findElemets();
            DriverCommon.longPush(macacaClient,elementSelector.get(i-1),2);
            //点击删除当前会话
            newTabBean.deleteChat_ok.click();
        }else {
            System.out.println("ios没有调试");
        }
    }
}
