/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jakesstore.model;

/**
 *
 * @author jakes
 */
public class DevicesStatus {
    private int devicesID;
    private int devicesSale;
    private String devicesStatus;

    public int getDevicesID() {
        return devicesID;
    }

    public void setDevicesID(int devicesID) {
        this.devicesID = devicesID;
    }

    public int getDevicesSale() {
        return devicesSale;
    }

    public void setDevicesSale(int devicesSale) {
        this.devicesSale = devicesSale;
    }

    public String getDevicesStatus() {
        return devicesStatus;
    }

    public void setDevicesStatus(String devicesStatus) {
        this.devicesStatus = devicesStatus;
    }

    public DevicesStatus(int devicesID, int devicesSale, String devicesStatus) {
        this.devicesID = devicesID;
        this.devicesSale = devicesSale;
        this.devicesStatus = devicesStatus;
    }
    
    
}
