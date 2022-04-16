package com.sedsax.methodsandclasses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("onCreate called");

        makeMusicians();

        Simpsons person1 = new Simpsons("Bart", 14, "Student");
        System.out.println(person1.getName());
        person1.setName("Homer");
        System.out.println(person1.getName());
    }


    public void makeMusicians(){
        /*
        constructor oluşturmadığımızda nesneyi bu şekilde tanımlayıp değerlerini atıyoruz.
        //instance = örnekleme, nesne oluşturma gibi
        Musicians obje1 = new Musicians();
        obje1.name="Seda";
        obje1.instrument="Elektro gitar";
        obje1.age=30;
        System.out.println(obje1.instrument);
         */
        //constructor oluşturduğumuzda tek satırda tanımlama ve atama işlemleri yapabiliyoruz.
        Musicians obje2 = new Musicians("seda","bas gitar",32);
        System.out.println(obje2.instrument);
    }




    @Override
    protected void onResume() {
        super.onResume();

        System.out.println("onResume called");
    }

    @Override
    protected void onStop() {
        super.onStop();

        System.out.println("onStop called");
    }

    @Override
    protected void onPause() {
        super.onPause();

        System.out.println("onPaused called");
    }
}