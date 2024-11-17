package com.muhammet;

import com.muhammet.entity.Araba;
import com.muhammet.entity.Ucak;

public class Runner {
    public static void main(String[] args) {
        /**
         * OverLoading -> Methodların aşırı yüklenmesi
         * aynı sınıf içinde
         * aynı method adına sahip methodların, farklılaşmış
         * değişkenler alarak tekrar tekrar kullanılmasına denir.
         *   Islemler islemler = new Islemler();
         *         double sonuc =  islemler.toplama(5.5d,9.1d);
         *         islemler.toplama(6.1f,9);
         *         islemler.toplama(1,12);
         *         System.out.println(sonuc);
         *
         * Overriding -> Methodların ezilmesi
         * Bir sınıf mirad aldığı yani parent sınıfının
         * içerisinde var olan bir methodu aynı şekli
         * korunarak tekar kendi içerisinde tanımlar ve
         * ihtiyacına göre body {} sini değiştirir. Bu işleme
         * methosun override edilmesi denir..
         */

        Ucak ucak = new Ucak();
        Araba araba = new Araba();

        ucak.name = "Uçak 555";
        ucak.hizlan();
        ucak.hizlan();
        ucak.hizlan();
        ucak.hizlan();
        System.out.println(ucak.name+" adlı ucağın hızı...: "+ ucak.hiz);

        araba.name = "Araba 444";
        araba.hizlan();
        araba.hizlan();
        araba.vites = 3;
        araba.hizlan();
        araba.hizlan();
        System.out.println(araba.name+ " adlı aracın hızı...: "+ araba.hiz);
    }
}