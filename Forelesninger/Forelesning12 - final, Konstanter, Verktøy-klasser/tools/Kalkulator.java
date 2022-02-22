package no.hiof.oleedvao.forelesning12.testing.tools;

import java.util.ArrayList;

public final class Kalkulator {

    public final static int METER_KM_FORHOLD = 1000;

    public static double summer(double tall1, double tall2) {
        return tall1 + tall2;
    }

    public static double summer(ArrayList<Double> tallListe) {
        double sum = 0;
        for (Double d : tallListe) {
            sum += d;
        }
        return sum;
    }

    public static double meterTilKm(double meter) {
        // 1km = 1000m
        return meter / METER_KM_FORHOLD;
    }

    public static double kmTilMeter(double km) {
        return km * METER_KM_FORHOLD;
    }
}
