package com.xiaoaiai.Pages.CallPages;

import com.xiaoaiai.PagesBeans.CallBeans.VideoCallIngBean;
import macaca.client.MacacaClient;

public class VideoCallIngPage {
    private MacacaClient macacaClient;
    private VideoCallIngBean videoCallIngBean;
    public VideoCallIngPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        videoCallIngBean = new VideoCallIngBean(macacaClient);
    }


    //挂断视频通话
    public void refuse_handup(){
        videoCallIngBean.img_refuse_handup.click();
    }
}
