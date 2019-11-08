package com.example.kanny.earthquake;

/**
 * Created by kanny on 2/9/2017.
 */

public class EarthQuake {
    private  double mMag;
    private String mLocation;
    private  String mDate;
    private String mUrl;

    public  EarthQuake(Double vMag,String vLocation,String vDate, String vUrl)
    {
        mMag=vMag;
        mLocation=vLocation;
        mDate=vDate;
        mUrl=vUrl;
    }

    public double  getmMag(){return mMag;}
    public  String getmLocation(){return mLocation;}
    public String getmDate(){return mDate;}
    public  String getmUrl(){return mUrl;}
}
