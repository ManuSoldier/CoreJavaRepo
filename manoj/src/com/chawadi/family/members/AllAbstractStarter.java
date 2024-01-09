package com.chawadi.family.members;

public class AllAbstractStarter {
    public static void main(String[] args) {
        System.out.println("Starting the main in the AllAbstractStarter");

        Satelite satelite=new Planet();
        satelite.chadrayana2();
        satelite.chnadrayana3();

        Airport airport=new Construction();
        airport.bangloreAirPort();
        airport.ChennaiAirPort();

        Border border=new Betalliean();
        border.Loc();
        border.Pok();

        SeaWay seaWay=new RoadWays();
        seaWay.indiaDubaiSeaWay();
        seaWay.indiaSreelankaSeaWay();

        Train train=new Roadlines();
        train.BulletTrain();
        train.ElectricTrain();
            }
        }



