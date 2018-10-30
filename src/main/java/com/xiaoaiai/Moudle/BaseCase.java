package com.xiaoaiai.Moudle;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

public class BaseCase {
    public static String platform;
    public static String evn;
    public static int port1;
    public static String udid1;
    public static int port2;
    public static String udid2;

    @BeforeSuite
    @Parameters({"evn", "platform", "port1", "udid1", "port2", "udid2"})
    public void setup(String evnpram, String platformPram, String port1Pram, String udid1Pram, String port2Pram, String udid2Pram) throws Exception {
        evn = evnpram;
        platform = platformPram;

        port1 = Integer.valueOf(port1Pram);
        udid1 = udid1Pram;

        port2 = Integer.valueOf(port2Pram);
        udid2 = udid2Pram;
    }
}
