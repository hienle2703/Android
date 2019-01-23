package com.example.nhietdo;

public class convert {
    private double doF,doC;
    public convert (double doC){
        this.doC=doC;
    }
    public double getDoF()
    {
        return this.doF;
    }
    public double getDoC()
    {
        return this.doC;
    }
    public void setDoC (double doC)
    {
        this.doC=doC;
    }
    public void setDoF (double doF)
    {
        this.doF=doF;
    }
    public void convertCtoF()
    {
        this.doF=(this.doC *1.8 +32);
    }
    public void convertFtoC()
    {
        this.doC=(this.doF -32) * 5/9 ;
    }
}
