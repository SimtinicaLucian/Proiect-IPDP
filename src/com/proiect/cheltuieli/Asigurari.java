package com.proiect.cheltuieli;

public class Asigurari extends Cheltuieli {
    private int politaNr;

    public Asigurari(String date, String Furnizor, String auto, double sumaTotala, int politaNr){
        super(date, Furnizor, auto, sumaTotala);
        this.politaNr = politaNr;
    }

    public int getPolitaNr() {
        return politaNr;
    }

    @Override
    public String getDate() {
        return super.getDate();
    }

    @Override
    public String getFurnizor() {
        return super.getFurnizor();
    }

    @Override
    public String getAuto() {
        return super.getAuto();
    }

    @Override
    public double getSumaTotala() {
        return super.getSumaTotala();
    }

    public String toString(){
        return "In data de " + getDate() + "asiguratorul " + getFurnizor() + "a emis pentru camionul cu numarul de inmatriculare " + getAuto() + "polita de asigurare Nr: " + getPolitaNr() + " suma fiind in valoare de " + getSumaTotala();
    }

}
