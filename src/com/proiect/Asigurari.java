package com.proiect;

public class Asigurari extends Cheltuieli {
    private int date;
    private String Furnizor;
    private String auto;
    private double sumaTotala;
    private double sumaFaraTva;
    private double sumaTVA;

    Asigurari(int date, String Furnizor, String auto, double sumaTotala,double sumaFaraTva, double sumaTVA){
        super(date, Furnizor,  auto,  sumaTotala, sumaTVA, sumaFaraTva);
    }
}