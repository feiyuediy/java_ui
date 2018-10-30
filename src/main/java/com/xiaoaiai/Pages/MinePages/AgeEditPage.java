package com.xiaoaiai.Pages.MinePages;

import com.xiaoaiai.PagesBeans.MineBeans.AgeEditBean;
import com.xiaoaiai.Utils.Command;
import com.xiaoaiai.Utils.Common;
import macaca.client.MacacaClient;

public class AgeEditPage {
    private MacacaClient macacaClient;
    private AgeEditBean ageEditBean;

    public AgeEditPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        ageEditBean = new AgeEditBean(macacaClient);
    }

    //返回
    public void back(){
        ageEditBean.back.click();
    }
    //获取title
    public String getTitle(){
        return ageEditBean.title.getText();
    }
    //保存
    public void save(){
        ageEditBean.save.click();
    }
    //获取年龄
    public String getAge(){
        return ageEditBean.age.getText();
    }

    //获取星座
    public String getConstellation(){
        return ageEditBean.constellation.getText();
    }
    //修改出生日期
    public void modifyAge(String year, String mon, String day){
        ageEditBean.age.click();
        ageEditBean.year.click();
        ageEditBean.year.clear();
        String str1 = "adb shell input text " + year;
        Command.exeCmd(str1);

        ageEditBean.month.click();
        ageEditBean.month.clear();
        String str2 = "adb shell input text " + mon;
        Command.exeCmd(str2);

        ageEditBean.day.click();
        ageEditBean.day.clear();
        String str3 = "adb shell input text " + day;
        Command.exeCmd(str3);

        ageEditBean.sure.click();
        save();
        back();
    }
}
