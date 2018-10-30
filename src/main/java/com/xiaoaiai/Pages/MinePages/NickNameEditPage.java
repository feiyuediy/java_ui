package com.xiaoaiai.Pages.MinePages;

import com.xiaoaiai.PagesBeans.MineBeans.NickNameEditBean;
import macaca.client.MacacaClient;
import org.omg.CORBA.portable.ValueOutputStream;

public class NickNameEditPage {
    private MacacaClient macacaClient;
    private NickNameEditBean nickNameEditBean;

    public NickNameEditPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        nickNameEditBean = new NickNameEditBean(macacaClient);
    }

    //返回
    public void back(){
        nickNameEditBean.back.click();
    }
    //获取标题
    public String getTitle(){
        return nickNameEditBean.title.getText();
    }
    //点击保存
    public void save(){
        nickNameEditBean.save.click();
    }

    //修改昵称
    public void modifyNickName(String nick){
        nickNameEditBean.input_value1.input(nick);

        save();
        back();
    }
}
