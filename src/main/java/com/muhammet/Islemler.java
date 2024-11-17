package com.muhammet;

public class Islemler {
    int sayi1;
    int sayi2;

    public Islemler(){

    }
    public Islemler(int sayi1, int sayi2) {
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
    }

    public int toplama(int s1, int s2){
        int toplam = s1+s2;
        return toplam;
    }

    public float toplama(float s3, int s4){
        float toplam = s3+s4;
        return toplam;
    }

    public double toplama(double s1, double s2){
        double toplam = s1+s2;
        return toplam;
    }
}
