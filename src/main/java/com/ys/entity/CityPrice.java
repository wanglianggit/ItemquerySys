package com.ys.entity;

import java.util.Date;

public class CityPrice {
    private Long fid;

    private String fcity;

    private String flastcityprice;

    private String flastpricerate;

    private String fnearcityprice;

    private String fnearpricerate;

    private String ftodaycityprice;

    private String ftodaypricerate;

    private Date cratetime;

    public Long getFid() {
        return fid;
    }

    public void setFid(Long fid) {
        this.fid = fid;
    }

    public String getFcity() {
        return fcity;
    }

    public void setFcity(String fcity) {
        this.fcity = fcity == null ? null : fcity.trim();
    }

    public String getFlastcityprice() {
        return flastcityprice;
    }

    public void setFlastcityprice(String flastcityprice) {
        this.flastcityprice = flastcityprice == null ? null : flastcityprice.trim();
    }

    public String getFlastpricerate() {
        return flastpricerate;
    }

    public void setFlastpricerate(String flastpricerate) {
        this.flastpricerate = flastpricerate == null ? null : flastpricerate.trim();
    }

    public String getFnearcityprice() {
        return fnearcityprice;
    }

    public void setFnearcityprice(String fnearcityprice) {
        this.fnearcityprice = fnearcityprice == null ? null : fnearcityprice.trim();
    }

    public String getFnearpricerate() {
        return fnearpricerate;
    }

    public void setFnearpricerate(String fnearpricerate) {
        this.fnearpricerate = fnearpricerate == null ? null : fnearpricerate.trim();
    }

    public String getFtodaycityprice() {
        return ftodaycityprice;
    }

    public void setFtodaycityprice(String ftodaycityprice) {
        this.ftodaycityprice = ftodaycityprice == null ? null : ftodaycityprice.trim();
    }

    public String getFtodaypricerate() {
        return ftodaypricerate;
    }

    public void setFtodaypricerate(String ftodaypricerate) {
        this.ftodaypricerate = ftodaypricerate == null ? null : ftodaypricerate.trim();
    }

    public Date getCratetime() {
        return cratetime;
    }

    public void setCratetime(Date cratetime) {
        this.cratetime = cratetime;
    }

    @Override
    public String toString() {
        return "CityPrice{" +
                "fid=" + fid +
                ", fcity='" + fcity + '\'' +
                ", flastcityprice='" + flastcityprice + '\'' +
                ", flastpricerate='" + flastpricerate + '\'' +
                ", fnearcityprice='" + fnearcityprice + '\'' +
                ", fnearpricerate='" + fnearpricerate + '\'' +
                ", ftodaycityprice='" + ftodaycityprice + '\'' +
                ", ftodaypricerate='" + ftodaypricerate + '\'' +
                ", cratetime=" + cratetime +
                '}';
    }
}