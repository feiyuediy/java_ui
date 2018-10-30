package com.xiaoaiai.Pages.DidiPages;

import com.lazy.exceptions.ProxyError;
import com.xiaoaiai.PagesBeans.DidiBeans.EvaluateBean;
import com.xiaoaiai.Utils.DriverCommon;
import macaca.client.MacacaClient;
import macaca.client.commands.Element;
import macaca.client.common.ElementSelector;
import org.apache.log4j.Logger;

import java.util.List;


public class EvaluatePage {
    private MacacaClient macacaClient;
    private EvaluateBean evaluateBean;
    private static Logger logger = Logger.getLogger(EvaluatePage.class);

    public EvaluatePage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        evaluateBean = new EvaluateBean(macacaClient);
    }

    //点击返回
    public void back(){
        evaluateBean.txt_left.click();
    }

    //获取标题
    public String getTile(){
        return evaluateBean.txt_title.getText();
    }

    //获取司机昵称
    public String getNick(){
        return evaluateBean.name_tv.getText();
    }
    public void setStar(int star){
        switch (star){
            case 1:
                evaluateBean.oneStar.click();
                break;
            case 2:
                evaluateBean.twoSar.click();
                break;
            case 3:
                evaluateBean.threeStar.click();
                break;
            case 4:
                evaluateBean.fourStar.click();
                break;
            case 5:
                evaluateBean.fiveStar.click();
                break;
            default:
                logger.info("评价只能1-5星");
        }
    }

    //设置标签
    public void setTag(String msg){
        List<Element> elementSelector = evaluateBean.tagText.findElemets();
        try{
            boolean isExit = false;
            for (int i = 0; i< elementSelector.size();i++){
                if (msg.equals(elementSelector.get(i).getText())){
                    elementSelector.get(i).click();
                    isExit = true;
                }
            }
            if (!isExit){
                logger.info("不存在这样的标签");
            }
        }catch (Exception e){
            throw  new ProxyError(e.getMessage());
        }

    }

    //点击提交按钮
    public void submit(){
        evaluateBean.submit_btn.click();
    }
    //评价
    public void evaluate(int star, String msg){
        setStar(star);
        setTag(msg);
        DriverCommon.swipeToUp(macacaClient,1,1);
        submit();
    }
    //评价
    public void evaluate(int star){
        setStar(star);
        DriverCommon.swipeToUp(macacaClient,1,1);
        submit();
    }
}
