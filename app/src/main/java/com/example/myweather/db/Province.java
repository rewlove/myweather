package com.example.myweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by rew040506 on 2017/10/16.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id =id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
        }
    public int getprocinceCode (){
        return provinceCode;
    }
    public void setprovvinceCode(){
        this.provinceCode = provinceCode;
    }

}
