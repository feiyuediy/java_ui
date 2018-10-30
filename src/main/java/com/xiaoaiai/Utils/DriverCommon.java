package com.xiaoaiai.Utils;

import com.alibaba.fastjson.JSONObject;
import com.lazy.exceptions.NoSuchElementException;
import com.lazy.exceptions.ProxyError;
import macaca.client.MacacaClient;
import macaca.client.commands.Element;
import macaca.client.common.GetElementWay;
import org.apache.log4j.Logger;

import java.net.URL;

import static com.xiaoaiai.Moudle.BaseCase.platform;


public class DriverCommon {
    private static Logger logger = Logger.getLogger(DriverCommon.class);

    public static void Hand_permission(MacacaClient macacaClient){
        try {
            macacaClient.waitForElementById("android:id/button1").click();
        } catch (Exception e) {
            logger.info("没有出现弹窗");
        }
    }

    public static void Hand_permission(MacacaClient macacaClient,int time){
        boolean isExist = false;
        for(int i = 0; i < time; i++){
           try{
               macacaClient.elementById("android:id/button1").click();
               isExist = true;
           }catch (Exception e){
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException e1) {
                   e1.printStackTrace();
               }
           }
       }
       if (!isExist){
            logger.info("没有出现权限弹窗");
       }
    }

    public static void back(MacacaClient macacaClient){
        if (platform.equals("android")){
            try {
                macacaClient.back();
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else {
            logger.info("IOS还没有实现");
        }
    }

    public static MacacaClient getDriver(int port,String udid){

        MacacaClient driver = new MacacaClient();

        JSONObject porps = new JSONObject();
        porps.put("reuse",3);
        porps.put("platformName", platform);
        porps.put("udid", udid);
        porps.put("app", "C:\\Users\\zhangjianfeng\\Downloads\\Medical-ysq_wd.apk");
        porps.put("activity",".ui.SplashScreen");
        JSONObject desiredCapabilities = new JSONObject();
        desiredCapabilities.put("desiredCapabilities", porps);
        desiredCapabilities.put("port", port);
        desiredCapabilities.put("host", "127.0.0.1");
        try {
             driver.initDriver(desiredCapabilities);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driver.setWaitElementTimeout(5000);
        driver.setWaitElementTimeInterval(1000);
        if (udid.equals("8ca1e10e")){
            //锤子手机安装之后要点击一个允许的按钮权限弹窗
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            double x = 700.00;
            double y = 1300.00;
            Command.exeCmd("adb -s "+ udid +" shell input tap "+ String.valueOf(x)+" " + String.valueOf(y));
        }
        return driver;
    }
    public static void goSleep(int time){
        try {
            Thread.sleep(time*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * 上滑
     *
     * @param driver
     * @param during
     * @param num
     */
    public static void swipeToUp(MacacaClient driver, int during, int num) {
        try{
            double width = Double.valueOf(driver.getWindowSize().get("width").toString());
            double height = Double.valueOf(driver.getWindowSize().get("height").toString());
            for (int i = 0; i < num; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                driver.drag(width / 2, height * 3 / 4, width / 2, height / 4, 0.5);
//            driver.swipe(width / 2, height *3 / 4, width / 2, height  / 4, during);
            }
        }catch (Exception e){
            throw new ProxyError(e.getMessage());
        }
    }

    /**
     * 下拉
     *
     * @param driver
     * @param during
     * @param num
     */
    public static void swipeToDown(MacacaClient driver,int during, int num) throws Exception {
        double width = Double.valueOf(driver.getWindowSize().get("width").toString());
        double height = Double.valueOf(driver.getWindowSize().get("height").toString());
        for (int i = 0; i < num; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.drag(width / 2, height / 4, width / 2, height * 3 / 4, 0.5);
//            driver.swipe(width / 2, height / 4, width / 2, height * 3 / 4, during);        }

        }
    }

    /**
     * 向左滑动
     *
     * @param driver
     * @param during
     * @param num
     */
    public static void swipeToLeft(MacacaClient driver,int during, int num) throws Exception {
        double width = Double.valueOf(driver.getWindowSize().get("width").toString());
        double height = Double.valueOf(driver.getWindowSize().get("height").toString());
        for (int i = 0; i < num; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.drag(width *3 / 4, height / 2, width / 4, height  / 2, 0.5);
//            driver.swipe(width * 3 / 4, height / 2, width / 4, height / 2, during);
        }
    }

    /**
     * 向右滑动
     *
     * @param driver
     * @param during
     * @param num
     */
    public static void swipeToRight(MacacaClient driver,int during, int num) throws Exception {
        double width = Double.valueOf(driver.getWindowSize().get("width").toString());
        double height = Double.valueOf(driver.getWindowSize().get("height").toString());
        for (int i = 0; i < num; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.drag(width  / 4, height / 2, width *3 / 4, height  / 2, 0.5);
        }
//            driver.swipe(width / 4, height / 2, width * 3 / 4, height / 2, during);
    }

    //长按一个元素
    public static void longPush(MacacaClient driver, Element element,int time){
        try{
            double x = element.getCenterX();
            double y = element.getCenterY();
            driver.press(x,y,time);
        }catch (Exception e){
            throw new ProxyError(e.getMessage());
        }
    }
    //toast
    public static boolean findToast(MacacaClient macacaClient,String msg){
        boolean isFanid = false;
        try {
            isFanid  = macacaClient.isElementExist(GetElementWay.NAME,msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isFanid;
    }
}
