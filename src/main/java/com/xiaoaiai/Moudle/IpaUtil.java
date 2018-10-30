package com.xiaoaiai.Moudle;

import com.dd.plist.NSArray;
import com.dd.plist.NSDictionary;
import com.dd.plist.NSString;
import com.dd.plist.PropertyListParser;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * 解析ipa的工具类
 * 包名/版本名/版本号/应用名称/应用展示名称/所需IOS最低版本
 */
public class IpaUtil {
    /**
     *
     * @param ipaURL 安装包的绝对路径
     * @param path 指定图标的存放位置
     * @return
     */
    public static Map<String, Object> readIPA(String ipaURL, String path) {
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            File file = new File(ipaURL);
            InputStream is = new FileInputStream(file);
            InputStream is2 = new FileInputStream(file);

            ZipInputStream zipIns = new ZipInputStream(is);
            ZipInputStream zipIns2 = new ZipInputStream(is2);
            ZipEntry ze;
            ZipEntry ze2;
            InputStream infoIs = null;
            NSDictionary rootDict = null;
            String icon = null;
            while ((ze = zipIns.getNextEntry()) != null) {
                if (!ze.isDirectory()) {
                    String name = ze.getName();
                    if (null != name && name.toLowerCase().contains("info.plist")) {
                        ByteArrayOutputStream _copy = new ByteArrayOutputStream();
                        int chunk = 0;
                        byte[] data = new byte[1024];
                        while (-1 != (chunk = zipIns.read(data))) {
                            _copy.write(data, 0, chunk);
                        }
                        infoIs = new ByteArrayInputStream(_copy.toByteArray());
                        rootDict = (NSDictionary) PropertyListParser.parse(infoIs);

                        NSDictionary iconDict = (NSDictionary) rootDict.get("CFBundleIcons");

                        //获取图标名称
                        while (null != iconDict) {
                            if (iconDict.containsKey("CFBundlePrimaryIcon")) {
                                NSDictionary CFBundlePrimaryIcon = (NSDictionary) iconDict.get("CFBundlePrimaryIcon");
                                if (CFBundlePrimaryIcon.containsKey("CFBundleIconFiles")) {
                                    NSArray CFBundleIconFiles = (NSArray) CFBundlePrimaryIcon.get("CFBundleIconFiles");
                                    icon = CFBundleIconFiles.getArray()[0].toString();
                                    if (icon.contains(".png")) {
                                        icon = icon.replace(".png", "");
                                    }
                                    System.out.println("获取icon名称:" + icon);
                                    break;
                                }
                            }
                        }
                        break;
                    }
                }
            }

            //根据图标名称下载图标文件到指定位置
            while ((ze2 = zipIns2.getNextEntry()) != null) {
                if (!ze2.isDirectory()) {
                    String name = ze2.getName();
                    if (icon!=null){
                        if (name.contains(icon.trim())) {
                            //图片下载到指定的地方
                            FileOutputStream fos = new FileOutputStream(new File(path));
                            int chunk = 0;
                            byte[] data = new byte[1024];
                            while (-1 != (chunk = zipIns2.read(data))) {
                                fos.write(data, 0, chunk);
                            }
                            fos.close();
                            System.out.println("=================下载图片成功");
                            break;
                        }
                    }
                }
            }


            //如果想要查看有哪些key ，可以把下面注释放开
//       for (String string : dictionary.allKeys()) {
//          System.out.println(string + ":" + dictionary.get(string).toString()); 
//       }

            // 应用包名
            NSString parameters = (NSString) rootDict.get("CFBundleIdentifier");
//            map.put("package", parameters.toString());
            // 应用版本名
            parameters = (NSString) rootDict.objectForKey("CFBundleShortVersionString");
            map.put("versionName", parameters.toString());
            //应用版本号
            parameters = (NSString) rootDict.get("CFBundleVersion");
            map.put("versionCode", parameters.toString());
            //应用名称
            parameters = (NSString) rootDict.objectForKey("CFBundleName");
            map.put("name", parameters.toString());
            //应用展示的名称
            parameters = (NSString) rootDict.objectForKey("CFBundleDisplayName");
            map.put("displayName", parameters.toString());
            //应用所需IOS最低版本
            //parameters = (NSString) rootDict.objectForKey("MinimumOSVersion");
            //map.put("minIOSVersion", parameters.toString());

            infoIs.close();
            is.close();
            zipIns.close();

        } catch (Exception e) {
            e.printStackTrace();
            map.put("code", "fail");
            map.put("error", "读取ipa文件失败");
        }
        return map;
    }

    public static void main(String[] args) {
        String ipaUrl = "D:\\ipa\\MedicalCircle.ipa";
        String imgPath = "D:\\image\\ipaIcon" + System.currentTimeMillis() + ".png";
        Map<String, Object> mapIpa = IpaUtil.readIPA(ipaUrl,imgPath);
        for (String key : mapIpa.keySet()) {
            System.out.println(key + ":" + mapIpa.get(key));
        }
    }
}