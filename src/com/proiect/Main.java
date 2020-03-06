package com.proiect;

import com.proiect.cheltuieli.Alimentari;
import com.proiect.cheltuieli.Cheltuieli;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Main {

    public static void main(String[] args) {
        Alimentari tir1 = new Alimentari("12","tata","AG98STT", 129.9, 12);

        Cheltuieli ch1 = new Cheltuieli();
        //ch1.listAlimentari(tir1);

        ch1.getListaAlimentari();
    }
}
