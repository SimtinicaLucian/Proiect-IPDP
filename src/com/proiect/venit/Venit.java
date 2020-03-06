package com.proiect.venit;

public class Venit {
    private String date;
    private String Furnizor;
    private double sumaTotala;
    private String auto;


    public Venit(String date, String Furnizor, double sumaTotala, String auto){
        this.date = date;
        this.Furnizor = Furnizor;
        this.sumaTotala = sumaTotala;
        this.auto = auto;
    }


    public String toString(){
        return "In data de " + date + "s-a incasat de la furnizorul " + Furnizor + " suma de " + sumaTotala + " transport efectuat de " + auto;

    }

}
