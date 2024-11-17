package com.muhammet.entity;

public class Ucak extends Arac{
    public int kanatAcikligi;
    public int hostesSayisi;
    // @Override zorunlu değildir, belirtmek için kullanılır.
    @Override
    public void hizlan(){
        hiz += 40;
    }
}
