package com.world.friends;

import com.world.love.soldier.*;

public class LoveStarter {
    public static void main(String[] args) {

        Guitar guitar=new Guitar(1,12000.0,"steel") ;
        Guitar guitar1=new Guitar(1,12000.0,"wood");

        boolean value=guitar.equals(guitar1);
        System.out.println("guitar and guitar1 are equals:" +value);

        WifiDongal wifiDongal=new WifiDongal("sandisk",600,20);
        WifiDongal wifiDongal1=new WifiDongal("sandisk",600,20);

        value=wifiDongal.equals(wifiDongal1);
        System.out.println("wifiDongal and wifiDongal1 are equals:" +value);

        UsbHub usbHub=new UsbHub(1,200,80);
        UsbHub usbHub1=new UsbHub(1,200,80);

        value=usbHub.equals(usbHub1);
        System.out.println("usbHub and usbHub are same:" +value);

    }
}
