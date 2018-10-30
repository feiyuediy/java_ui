package com.xiaoaiai.Pages.AccostPages;

import com.lazy.exceptions.NoSuchElementException;
import com.lazy.exceptions.ProxyError;
import com.xiaoaiai.PagesBeans.AccostBeans.EditMoodBean;
import com.xiaoaiai.PagesBeans.AccostBeans.MoodBean;
import macaca.client.MacacaClient;
import macaca.client.commands.Element;
import macaca.client.common.ElementSelector;

import java.util.List;

public class MoodPage {
    private MacacaClient macacaClient;
    private MoodBean moodBean;

    public MoodPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        moodBean = new MoodBean(macacaClient);
    }

    //获取第n个列表的昵称
    public String get_name(int n){
        String name = null;
        List<Element> elementSelector = moodBean.name.findElemets();
        try {
            name = elementSelector.get(n).getText();
        } catch (Exception e) {
           throw new NoSuchElementException(e.getMessage());
        }
        return name;
    }

    //切换刷选
    public void changeScreen(String screen){
        moodBean.select.click();
        if (screen.equals("女")) {
            moodBean.mood_filter_girl.click();

        } else if (screen.equals("男")) {
            moodBean.mood_filter_boy.click();

        }
    }

    public void click_head(int i){
        try {
            moodBean.name.findElemets().get(i-1).click();
        } catch (Exception e) {
            throw new ProxyError(e.getMessage());
        }
    }

    //点击编辑按钮
    public void click_edit(){
        moodBean.img_edit.click();
    }
    //发布心情
    public void editMood(String mood){
        click_edit();
        EditMoodBean editMoodBean = new EditMoodBean(macacaClient);
        editMoodBean.editText1.input(mood);
        editMoodBean.save.click();
    }
    //获取自己的心情
    public String getMyMood(){
        try {
            return moodBean.mood.findElemets().get(0).getText();
        } catch (Exception e) {
            throw new ProxyError(e.getMessage());
        }
    }

    //点击关注弹窗中的我知道了
    public void click_ok(){
        moodBean.ok.click();
    }

}
