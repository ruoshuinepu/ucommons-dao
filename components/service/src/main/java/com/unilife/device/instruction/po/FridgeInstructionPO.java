package com.unilife.device.instruction.po;

import java.io.Serializable;

public class FridgeInstructionPO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String deviceModel;
    private String imgUrl;
    private String content;
    public String getDeviceModel() {
        return deviceModel;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }



}
