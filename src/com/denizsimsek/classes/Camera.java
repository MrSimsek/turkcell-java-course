package com.denizsimsek.classes;

public class Camera {
    private int zoomLevel;
    private String manufacturer;

    public Camera(int zoomLevel, String manufacturer) {
        this.zoomLevel = zoomLevel;
        this.manufacturer = manufacturer;
    }

    public int getZoomLevel() {
        return zoomLevel;
    }

    public void setZoomLevel(int zoomLevel) {
        this.zoomLevel = zoomLevel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
