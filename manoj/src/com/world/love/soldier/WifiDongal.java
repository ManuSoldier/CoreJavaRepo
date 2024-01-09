package com.world.love.soldier;

public class WifiDongal {

    String brand;
    double transferRate;
    int itemWeight;

    public WifiDongal(String brand,double transferRate,int itemWeight) {
        this.brand = brand;
        this.transferRate = transferRate;
        this.itemWeight =itemWeight;
    }

    @Override
    public boolean equals(Object obj) {

        WifiDongal wifiDongal = this;
        if (obj != null) {
            if (obj instanceof WifiDongal) {
                WifiDongal seq = (WifiDongal) obj;
                if (wifiDongal.itemWeight == seq.itemWeight && wifiDongal.transferRate == seq.transferRate) {
                    System.out.println("the WifiDongal and WifiDongal1 are same when compared these two");
                    return true;
                } else {
                    System.out.println("the WifiDongal and gWifiDongal1 are not same compared to the tranferrate and itemweight");
                }
            }
        }
        else {
            System.out.println("the Guitar and Guitar1 is not same when value eqal to null");
        }
        return false;

    }
}

