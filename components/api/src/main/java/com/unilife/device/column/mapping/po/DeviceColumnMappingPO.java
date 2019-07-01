package com.unilife.device.column.mapping.po;

import java.util.Date;

public class DeviceColumnMappingPO {
    private Integer id;
    private String brand; // 厂商
    private String deviceModelId; // 设备型号id
    private String deviceModelName; // 设备型号name
    private String placeGroupCode; // 栏位组id
    private Double width; // 宽度
    private Double height; // 高度
    private String createBy; // 创建人
    private Date createDate; // 创建时间

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(String deviceModelId) {
        this.deviceModelId = deviceModelId;
    }

    public String getDeviceModelName() {
        return deviceModelName;
    }

    public void setDeviceModelName(String deviceModelName) {
        this.deviceModelName = deviceModelName;
    }

    public String getPlaceGroupCode() {
        return placeGroupCode;
    }

    public void setPlaceGroupCode(String placeGroupCode) {
        this.placeGroupCode = placeGroupCode;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

}
