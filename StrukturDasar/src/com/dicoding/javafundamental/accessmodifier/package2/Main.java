package com.dicoding.javafundamental.accessmodifier.package2;

import com.dicoding.javafundamental.accessmodifier.package1.KelasA;

public class Main {
    public static void main(String[] args) {
        // Kode ini pasti akan mengalami kompiler error
        KelasA kelasA = new KelasA();

        // System.out.println(kelasA.functionB()); error

        // System.out.println(kelasA.memberB); error
        // System.out.println(kelasA.memberC); error

        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}
