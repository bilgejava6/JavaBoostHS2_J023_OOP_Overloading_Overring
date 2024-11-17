package com.muhammet.entity;

public class Araba extends Arac{
    public int kapiSayisi;
    public String plaka;
    public int vites;

    public void hizlan(){
        if(vites < 1)
            hiz += 5;
        else
            hiz += 5 * vites;
    }
}
