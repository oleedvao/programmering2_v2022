package no.hiof.oleedvao.forelesning15.interfaces;

// Interface som definerer en "kontrakt" på at alle klasser som implementerer dette interfacet må
// implementere de inneholde abstrakte metodene
public interface Tegnbar {

    // Abstrakt metode som må implementeres for alle klasser som implementer interfacet.
    // Merk at denne er automatisk public og abstract uten at vi trenger å definere dette direkte.
    String getTegning();

}
