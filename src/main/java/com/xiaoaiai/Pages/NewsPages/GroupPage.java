package com.xiaoaiai.Pages.NewsPages;

import com.lazy.exceptions.ProxyError;
import com.xiaoaiai.PagesBeans.NewsBeans.GroupBean;
import com.xiaoaiai.Utils.DriverCommon;
import macaca.client.MacacaClient;
import org.testng.reporters.jq.GroupPanel;

import java.util.NoSuchElementException;

public class GroupPage {
    private MacacaClient macacaClient;
    private GroupBean groupBean;

    public GroupPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        groupBean = new GroupBean(macacaClient);
    }

    //点击bannre
    public void click_banner(){
        groupBean.banner.click();
    }

    //点击我的群组第一个群组
    public void click_myGroup(){
        if (groupBean.groups_category_title.isExist()){
            try {
                groupBean.group_name.findElemets().get(0).click();
            } catch (Exception e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }else {
            System.out.println("没有加入群组");
        }
    }

    //点击全部群组
    public void click_all_group(){
        groupBean.all_group.click();
    }

    //点击第一个推荐的群
    public void click_re_group(int i){
        try{
            if (groupBean.groups_category_title.isExist()){
                groupBean.group_name.findElemets().get(i).click();
            }else {
                groupBean.group_name.findElemets().get(i-1).click();
            }
        }catch (Exception e){
            throw new NoSuchElementException(e.getMessage());
        }
    }

    //下拉刷新
    public void drop_down_refresh(){
        try {
            DriverCommon.swipeToDown(macacaClient,1,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
