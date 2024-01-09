package com.world.love.soldier;

public class UsbHub {
    int totalPort;
    double tranferRate;
    int batteryRequired;

   public UsbHub(int totalPort,double tranferRate,int batteryRequired) {
       this.totalPort = totalPort;
       this.tranferRate = tranferRate;
       this.batteryRequired = batteryRequired;
   }
   public boolean equals(Object obj)
   {
       UsbHub usbHub = this;
       if (obj != null)
       {
           if (obj instanceof UsbHub) {
               UsbHub seq = (UsbHub) obj;
               if (usbHub.totalPort == seq.totalPort && usbHub.tranferRate == seq.tranferRate && usbHub.batteryRequired == seq.batteryRequired)

               {
                   System.out.println("the WifiDongal and WifiDongal1 are same when compared these three");
                   return true;
               }
               else
               {
                   System.err.println("the UsbHub and UsbHub1 are not same compared to the totalPort ,transferRate and batteryRequired");
               }
           }
       } else {
           System.err.println("the Guitar and Guitar1 is not same when value eqal to null");
       }
       return false;
   }
}




