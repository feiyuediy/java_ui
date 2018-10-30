package com.xiaoaiai.Utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Command {
    public static void exeCmd(String commandStr) {
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(commandStr);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            System.out.println(commandStr);
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static String exeCmdReturn(String commandStr) {
        BufferedReader br = null;
        try {
            Process p = Runtime.getRuntime().exec(commandStr);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            System.out.println(commandStr);
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        finally
        {
            if (br != null)
            {
                try {
                    br.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public static void installApp(String udid,String apkPath){
        String comStr = "adb -s "+ udid+" install " + apkPath;
        exeCmd(comStr);
    }

    public static void unintallAPP(String udid){
        String comStr = "adb -s " + udid +" uninstall com.zkj.guimi";
        exeCmd(comStr);
    }
    public static void lauchApp(String udid){
        String comStr = "adb -s "+ udid+" shell am start -n com.zkj.guimi/com.zkj.guimi.ui.SplashScreen";
        exeCmd(comStr);
    }
    //判断是否安装过小爱爱
    public static boolean isInstall(String udid) {
        String commandStr = "adb -s " + udid + " shell pm list package";
        String str = exeCmdReturn(commandStr);
        if (str.contains("package:com.zkj.guimi") && str.contains("package:io.appium.uiautomator2.server.test") && str.contains("package:io.appium.uiautomator2.server")){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String args[]){
        isInstall("5ab4f80e");
    }

//        String commandStr = "adb -s " + udid + " shell pm list packages | findstr com.zkj.guimi";
//        BufferedReader br = null;
//
//        try {
//            Process p = Runtime.getRuntime().exec(commandStr);
//            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
//            String line = null;
//            StringBuilder sb = new StringBuilder();
//            System.out.println(commandStr);
//            while ((line = br.readLine()) != null) {
//                sb.append(line + "\n");
//            }
//            System.out.println(sb.toString());
//            if (sb.toString().equals("/system/bin/sh: findstr: not found\n" +
//                    "\n"))
//                return false;
//            else {
//                return true;
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//            return false;
//        }
//        finally
//        {
//            if (br != null)
//            {
//                try {
//                    br.close();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//            }
//        }
}
