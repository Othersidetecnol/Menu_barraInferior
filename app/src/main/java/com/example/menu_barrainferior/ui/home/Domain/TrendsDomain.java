package com.example.menu_barrainferior.ui.home.Domain;

public class TrendsDomain {

    private String title;
    private String subtitle;
    private String picPath;

    public TrendsDomain(String title, String subtitle, String picPath) {
        this.title = title;
        this.subtitle = subtitle;
        this.picPath = picPath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }
}
