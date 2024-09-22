package com.dicoding.javafundamental.accessmodifier.package3;

public class Perhitungan {
    public static int nilai = 0;
    final int nilai2 = 5;

    protected static int getNilai(){
        return nilai;
    }

    Perhitungan() {
        nilai++;
    }

    void ubahNilai(){
        // Kode di bawah akan menampilkan error
        // nilai2 = 10; error
    }
}
