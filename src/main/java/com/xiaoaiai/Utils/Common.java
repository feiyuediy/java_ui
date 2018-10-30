package com.xiaoaiai.Utils;

import javax.imageio.ImageIO;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * Created by admin on 2017/8/31.
 */
public class Common {
    private final static int[] dayArr = new int[] { 20, 19, 21, 20, 21, 22, 23,
            23, 23, 24, 23, 22 };

    final static String[] constellationArr = new String[] { "摩羯座",
            "水瓶座", "双鱼座", "白羊座", "金牛座", "双子座", "巨蟹座", "狮子座", "处女座", "天秤座",
            "天蝎座", "射手座", "摩羯座" };


    public static void main(String args[]) throws IOException {
        getAndroidVersion();
//        ImageUtils.cutPNG("D:\\javaProject\\AppiumTest\\Screenshot\\20170906_144342.png",
//                "E:\\Temp\\339.png", 372,1150,684,1240);
//        comparePint("C:\\Users\\admin\\Desktop\\QQ图片20170913153359.jpg","C:\\Users\\admin\\Desktop\\QQ图片20170913153353.jpg",90);
    }

    public static String getRandmin(){
        long r1 = System.currentTimeMillis();
        return String.valueOf(r1);
    }

    public static String exeCmd(String commandStr) {
        BufferedReader br = null;
        try {
            System.out.println("commandStr:"+commandStr);
            Process p = Runtime.getRuntime().exec(commandStr);
            br = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line + "\n");
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
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
    public static String getAndroidVersion(){
        String version;
        String adb = "adb shell getprop ro.build.version.release";

        return exeCmd(adb);
    }
    public static boolean comparePint(String file1, String file2, float similarityDegree){
        FingerPrint fp1 = null;
        FingerPrint fp2 = null;
        try {
            fp1 = new FingerPrint(ImageIO.read(new File(file1)));
            fp2 = new FingerPrint(ImageIO.read(new File(file2)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("相似度="+fp1.compare(fp2)*100+"%%");
        if (fp1.compare(fp2)*100>similarityDegree){
            return true;
        }else {
            return false;
        }
    }

    //随机生成N位数字
    public static String getRandom(){

        int s = (int)((Math.random()*9+1)*1000);
        return String.valueOf(s);
    }

    public static int getAge(String year, String mon, String day)  {
        String str = year + "-" + mon + "-" + day;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdate = null;
        try {
            birthdate = formatter.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // 获取当前系统时间
        Calendar cal = Calendar.getInstance();
        // 如果出生日期大于当前时间，则抛出异常
        if (cal.before(birthdate)) {
            throw new IllegalArgumentException("The birthDay is before Now.It's unbelievable!");
        }
        // 取出系统当前时间的年、月、日部分
        int yearNow = cal.get(Calendar.YEAR);
        int monthNow = cal.get(Calendar.MONTH);
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH);

        // 将日期设置为出生日期
        cal.setTime(birthdate);
        // 取出出生日期的年、月、日部分
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
        // 当前年份与出生年份相减，初步计算年龄
        int age = yearNow - yearBirth;
        // 当前月份与出生日期的月份相比，如果月份小于出生月份，则年龄上减1，表示不满多少周岁
        if (monthNow <= monthBirth) {
            // 如果月份相等，在比较日期，如果当前日，小于出生日，也减1，表示不满多少周岁
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth)
                    age--;
            } else {
                age--;
            }
        }
        return age;
    }

    public static String getConstellation(int month, int day) {
        return day < dayArr[month - 1] ? constellationArr[month - 1]
                : constellationArr[month];
    }
}