package com.world.love.soldier;

import java.util.Objects;

public class Guitar {

    int id;
    double price;
    String material;

    public Guitar(int id, double price, String material) {
        this.id = id;
        this.price = price;
        this.material = material;
    }

    @Override
    public boolean equals(Object obj) {

        Guitar guitar = this;
        if (obj != null) {
            if (obj instanceof Guitar) {
                Guitar seq = (Guitar) obj;
                if (guitar.id == seq.id && guitar.price == seq.price) {
                    System.out.println("the Guitar and Guitar1 are same when compared these two");
                    return true;
                } else {
                    System.out.println("the guiter and guitar1 are not same compared to the id and price");
                }
            }
        }
            else {
                System.out.println("the Guitar and Guitar1 is not same when value eqal to null");
            }
            return false;

        }
    }



