package com.proiect.cheltuieli;

public class Reparatii extends Cheltuieli {
    private String descriere;

    public Reparatii(String date, String Furnizor, String auto, double sumaTotala, String descriere) {
        super(date, Furnizor, auto, sumaTotala);
        this.descriere = descriere;
    }

    public String getDescriere() {
        return descriere;
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
        return "In data de " + getDate() + "la furnizorul " + getFurnizor() + "camionul cu numarul de inmatriculare " + getAuto() + "a efectuat reparatie/revizie, contravaloarea fiind de " + getSumaTotala() + "constand in  " +  getDescriere();
    }


}
