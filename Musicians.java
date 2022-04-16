package com.sedsax.methodsandclasses;

public class Musicians {
    //Attribute = özellikler, nitelikler

    String name;
    String instrument;
    int age;

    //constructor oluşturmak için; Code->Generate->Constructor yolunu izleyebiliriz.
    public Musicians(String name, String instrument, int age) {
        //'this' yapısı, sınıfımıza referans veriyor
        this.name = name;
        this.instrument = instrument;
        this.age = age;
    }
}
