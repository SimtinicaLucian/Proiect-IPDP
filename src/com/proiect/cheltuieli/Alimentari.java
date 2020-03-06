package com.proiect.cheltuieli;

public class Alimentari extends Cheltuieli {
    private double litri;



   public Alimentari(String date, String Furnizor, String auto, double sumaTotala, double litri){
        super(date, Furnizor,  auto,  sumaTotala);
        this.litri = litri;
    }


    public double getLitri()
    {
        return litri;
    }

    @Override
    public String getDate() {
        return super.getDate();
    }

    @Override
    public double getSumaTotala() {
        return super.getSumaTotala();
    }

    @Override
    public String getAuto() {
        return super.getAuto();
    }

    @Override
    public String getFurnizor() {
        return super.getFurnizor();
    }

    public String toString(){
       return "In data de " + getDate() + "la statia " + getFurnizor() + "camionul cu numarul de inmatriculare " + getAuto() + "a alimentat de suma totala " + getSumaTotala() + "respectiv " + getLitri() + "litri";
    }
}
