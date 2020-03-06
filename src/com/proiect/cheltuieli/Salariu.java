package com.proiect.cheltuieli;

public class Salariu {
    private String fname;
    private String lname;
    private double salariu;

    public Salariu(String fname, String lname, double salariu){
        this.fname = fname;
        this.lname = lname;
        this.salariu = salariu;
    }


    public String toString(){
        return "Angajatul cu numele " + fname + " " + lname + " a primit salariul in valoare de " + salariu;

    }
}
