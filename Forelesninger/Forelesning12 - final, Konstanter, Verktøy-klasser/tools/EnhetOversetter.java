package no.hiof.oleedvao.forelesning12.testing.tools;

public final class EnhetOversetter {

    public final static int CM_METER_FORHOLD = 100;
    public final static int METER_KM_FORHOLD = 1000;

    public static double cmTilMeter(double cm) {
        return cm / CM_METER_FORHOLD;
    }

    public static double meterTilCm(double meter) {
        return meter * CM_METER_FORHOLD;
    }

    public static double meterTilKm(double meter) {
        // 1km = 1000m
        return meter / METER_KM_FORHOLD;
    }

    public static double kmTilMeter(double km) {
        return km * METER_KM_FORHOLD;
    }

    public static double kmTilCm(double km) {
        double kmIMeter = kmTilMeter(km);
        double kmICm = meterTilCm(kmIMeter);
        return kmICm;
    }
}
