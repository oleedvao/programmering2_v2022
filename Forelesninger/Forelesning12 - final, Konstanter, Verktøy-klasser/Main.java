package no.hiof.oleedvao.forelesning12.testing;

import no.hiof.oleedvao.forelesning12.testing.tools.EnhetOversetter;
import no.hiof.oleedvao.forelesning12.testing.tools.Kalkulator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println(EnhetOversetter.cmTilMeter(1500));
        System.out.println(EnhetOversetter.meterTilCm(15));

        System.out.println();
        System.out.println(EnhetOversetter.meterTilKm(20_500));
        System.out.println(EnhetOversetter.kmTilMeter(20.5));

        System.out.println();
        System.out.println("En meter er lik " +
                EnhetOversetter.CM_METER_FORHOLD + " cm.");
        System.out.println("En km er lik " +
                EnhetOversetter.METER_KM_FORHOLD + " meter.");

        System.out.println();
        System.out.println(EnhetOversetter.kmTilCm(1));

        /*
        System.out.println(Kalkulator.summer(2, 2));

        System.out.println();
        ArrayList<Double> tallListe = new ArrayList<>();
        tallListe.add(1.0);
        tallListe.add(2.0);
        tallListe.add(3.0);
        tallListe.add(4.0);
        System.out.println(Kalkulator.summer(tallListe));

        System.out.println();
        System.out.println(Kalkulator.meterTilKm(20_500));
        System.out.println(Kalkulator.kmTilMeter(20.5));

        System.out.println();
        System.out.println(Kalkulator.METER_KM_FORHOLD);
         */
    }
}
