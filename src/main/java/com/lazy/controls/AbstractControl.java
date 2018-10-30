package com.lazy.controls;

import com.lazy.exceptions.NoSuchElementException;
import com.lazy.exceptions.ProxyError;
import com.xiaoaiai.Moudle.BaseCase;
import macaca.client.MacacaClient;
import macaca.client.commands.Element;
import macaca.client.common.ElementSelector;

import java.util.List;


public class AbstractControl {

    protected MacacaClient driver;
    private String androidXpath;
    private String androidId;
    private String androidName;
    private String iosXpath;
    private String iosId;
    private String iosName;
    private String description;

    public MacacaClient getDriver() {
        return driver;
    }

    public void setDriver(MacacaClient driver) {
        this.driver = driver;
    }

    public String getAndroidXpath() {
        return androidXpath;
    }

    public void setAndroidXpath(String androidXpath) {
        this.androidXpath = androidXpath;
    }

    public String getAndroidId() {
        return androidId;
    }

    public void setAndroidId(String androidId) {
        this.androidId = androidId;
    }

    public String getAndroidName() {
        return androidName;
    }

    public void setAndroidName(String androidName) {
        this.androidName = androidName;
    }

    public String getIosXpath() {
        return iosXpath;
    }

    public void setIosXpath(String iosXpath) {
        this.iosXpath = iosXpath;
    }

    public String getIosId() {
        return iosId;
    }

    public void setIosId(String iosId) {
        this.iosId = iosId;
    }

    public String getIosName() {
        return iosName;
    }

    public void setIosName(String iosName) {
        this.iosName = iosName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //获取elements
    public List<Element> findElemets(){
        List<Element> elementSelector = null;
        //android平台
        if (BaseCase.platform.equals("android")){
            //假如备注的是id
            if (!getAndroidId().equals("")){
                try {
                    if (isExist()){
                        elementSelector = driver.elementsById(getAndroidId());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
                //假如备注的是name
            }else if (!getAndroidName().equals("")){
                try{
                    if (isExist()){
                        elementSelector = driver.elementsByName(getAndroidName());
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
                //假如备注的xpath
            }else {
                try{
                    if (isExist()){
                        elementSelector = driver.elementsByXPath(getAndroidXpath());
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        //假如是ios
        else {
            System.out.println("没有适配ios");
        }
        return elementSelector;
    }

    //获取正式的element
    public Element findElement() throws Exception {
        //android平台
        if (BaseCase.platform.equals("android")) {
            //假如备注的是id
            if (!getAndroidId().equals("")) {
                if (driver.waitForElementById(getAndroidId()) != null) {
                    return driver.waitForElementById(getAndroidId());
                } else {
                    throw new NoSuchElementException("找不到id：" + getAndroidId() + "的控件");
                }
            }

            //假如备注的是name
            else if (!getAndroidName().equals("")) {
                if (driver.waitForElementByName(getAndroidName()) != null) {
                    return driver.waitForElementByName(getAndroidName());
                } else {
                    throw new NoSuchElementException("找不到name：" + getAndroidName() + "的控件");
                }
                //假如备注的xpath
            } else {
                if (driver.waitForElementByXPath(getAndroidXpath()) != null) {
                    return driver.waitForElementByXPath(getAndroidXpath());
                } else {
                    throw new NoSuchElementException("找不到xpath：" + getAndroidXpath() + "的控件");
                }
            }
        }
        //假如是ios
        else {
            System.out.println("没有适配ios");
        }
        return null;
    }

    //判断元素是否存在
    public boolean isExist()  {
        //android平台
        boolean isExit = false;
        int i = 1;
        if (BaseCase.platform.equals("android")) {
            //假如备注的是id
            if (!getAndroidId().equals("")) {
                while ((i < 5 && !isExit)){
                    try {
                       if (!driver.isElementExist("id",getAndroidId())){
                           i++;
                           Thread.sleep(1000);
                       }else {
                          isExit =true;
                       }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return isExit;
            }

            //假如备注的是name
            else if (!getAndroidName().equals("")) {
                while ((i < 5 && !isExit)){
                    try {
                        if (!driver.isElementExist("name",getAndroidName())){
                            i++;
                            Thread.sleep(1000);
                        }else {
                            isExit =true;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return isExit;
                //假如备注的xpath
            } else {
                while ((i < 5 && !isExit)){
                    try {
                        if (!driver.isElementExist("xpath",getAndroidXpath())){
                            i++;
                            Thread.sleep(1000);
                        }else {
                            isExit =true;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                return isExit;
            }
        }
        //假如是ios
        else {
            System.out.println("没有适配ios");
            return false;
        }
    }
}
