package com.world.love.soldier;

public class Money {

    String Bank="RBI";
    int quantity=20;
    boolean fake=true;

    @Override
    public String toString() {
        return "Money{" + "Bank='" + Bank + '\'' + ", quantity=" + quantity + ", fake=" + fake + '}';
    }
}
