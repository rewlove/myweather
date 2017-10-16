package com.example.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by rew040506 on 2017/10/16.
 */

public class City extends DataSupport {
    private int id ;
    private String cityName;
    private int cityCode;
    private int provinceId;
    public int getid (){
        return id;
    }
    public void setid (int id) {
        this.id = id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName (String cityName){
        this.cityName = cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode){
        this.cityCode = cityCode;
    }
    public int getprovinceId(){
        return provinceId;
    }
    public void setprovinceId(int provinceid){
        this.provinceId = provinceId;
    }
}
