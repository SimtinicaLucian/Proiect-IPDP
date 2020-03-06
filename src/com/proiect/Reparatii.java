package com.proiect;

public class Reparatii extends Cheltuieli {
    private int date;
    private String Furnizor;
    private String descriere;
    private String auto;
    private double sumaTotala;
    private double sumaFaraTva;
    private double sumaTVA;

    Reparatii(int date, String Furnizor, String descriere, String auto, double sumaTotala, double sumaFaraTva, double sumaTVA) {
        super(date, Furnizor, descriere, auto, sumaTotala, sumaTVA, sumaFaraTva);
    }



}
