package com.xiaoaiai.Utils;


import macaca.client.MacacaClient;
import macaca.client.commands.Element;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by admin on 2017/8/30.
 */
public class Screenshot {

    public static String snapshotWithElement(MacacaClient driver, Element element){
        String currentPath = System.getProperty("user.dir");
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd_HHmmss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        snapshot(driver,date);//截图名称应该是data.png
        //有时移动的屏幕的时候，会有定位不准确的情况

        try {
            System.out.println("开始定位元素了，屏幕是否还在动");
            int elementCenterX =  (new Double(element.getOriginX())).intValue();
            int elementCenterY =  (new Double(element.getOriginY())).intValue();
            int hight = new Double(element.getHeight()).intValue();
            int width = new Double(element.getWidth()).intValue();

            int[] x = {elementCenterX,elementCenterY,hight,width};
            for (int a=0;a<x.length;a++){
                if (x[a]<0){
                    x[a] = 0;
                }
            }
            ImageUtils.cutPNG(currentPath+"\\Screenshot\\"+date+".png",currentPath+"\\Temp\\"+date+".png",x[0],x[1],x[2],x[3]);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
        return currentPath+"\\Temp\\"+date+".png";
    }
    public static String snapshot(MacacaClient drivername, String filename) {
        String currentPath = System.getProperty("user.dir"); // get current work
        try {
            MacacaClient scrFile = drivername.saveScreenshot(currentPath+"\\Screenshot\\"+filename+".png");
            System.out.println("save snapshot path is:" + currentPath + "\\"
                    + filename);

        } catch (IOException e) {
            System.out.println("Can't save screenshot");
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Can't save screenshot");
            e.printStackTrace();
        }finally {
            System.out.println("screen shot finished, it's in " + currentPath + "\\Screenshot\\" + filename+".png");
        }
        return currentPath + "\\Screenshot\\" + filename+".png";
    }
}
