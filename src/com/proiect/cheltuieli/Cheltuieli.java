package com.proiect.cheltuieli;

import java.util.ArrayList;

public class Cheltuieli {
    private String date;
    private String Furnizor;
    private String auto;
    private double sumaTotala;
    private ArrayList<Alimentari> listaAlimentari = new ArrayList<Alimentari>();


    public Cheltuieli(String date, String Furnizor, String auto, double sumaTotala){
        this.date = date;
        this.Furnizor = Furnizor;
        this.auto = auto;
        this.sumaTotala = sumaTotala;
    }

    public Cheltuieli(){

    }

    public String getDate() {
        return date;
    }

    public String getFurnizor() {
        return Furnizor;
    }

    public String getAuto() {
        return auto;
    }

    public double getSumaTotala() {
        return sumaTotala;
    }

    public double sumaFaraTVA(double sumaTotala){
        double sumafaraTVA = sumaTotala / 1.19;
        return sumafaraTVA;
    }

    public double sumaTVA(double sumaTotala){
        double sumaTVA = sumaTotala - sumaFaraTVA(sumaTotala);
        return sumaTVA;
    }

    public void listAlimentari(Alimentari ob){

        listaAlimentari.add(ob);
    }

    public ArrayList<Alimentari> getListaAlimentari()
    {
        return listaAlimentari;
    }
}
