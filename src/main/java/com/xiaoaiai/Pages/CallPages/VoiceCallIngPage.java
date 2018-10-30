package com.xiaoaiai.Pages.CallPages;

import com.xiaoaiai.PagesBeans.CallBeans.VoiceCallIngBean;
import macaca.client.MacacaClient;

public class VoiceCallIngPage {
    private MacacaClient macacaClient;
    private VoiceCallIngBean voiceCallIngBean;

    public VoiceCallIngPage(MacacaClient macacaClient){
        this.macacaClient = macacaClient;
        voiceCallIngBean = new VoiceCallIngBean(macacaClient);
    }
    //挂断语音
    public void refuse_handup(){
        voiceCallIngBean.img_refuse_handup.click();
    }
}
