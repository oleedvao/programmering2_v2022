import java.util.Arrays;
import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {

        //Variabel deklarasjon
        int number;
        //System.out.println(number);

        //Initialisering av variabel
        number = 42;
        System.out.println(number);

        //Variabel deklarasjon og initialisering på samme linje
        //Eksemplifisert hvordan man kan opprette og dele opp en long med _
        long longNumber = 4_546_451_345_646_465_400L;

        //Håndering av resultatet av en aritmetisk operasjon på to forsjellige datatype-verdier
        //System.out.println(number + longNumber);
        long sum = number + longNumber;
        System.out.println(sum);

        //Double og float
        System.out.println();
        double doubleNumber = 2.47389234839454354334324;
        System.out.println(doubleNumber);
        float floatNumber = 45.34343243254354353454F;
        System.out.println(floatNumber);

        //Typecasting fra double til int
        System.out.println();
        int decimalToInt = (int)doubleNumber;
        System.out.println(decimalToInt);

        //Sette en variabel lik en annen
        System.out.println();
        int newNumber = number;
        System.out.println(newNumber);
        number = 69;
        System.out.println(newNumber + "\n");

        //Opprettelse og håndtering av en array (med 3 elementer)
        double[] arrayOfDoubles = new double[3];
        System.out.println(Arrays.toString(arrayOfDoubles));
        arrayOfDoubles[0] = 1.1;
        arrayOfDoubles[1] = 2.2;
        arrayOfDoubles[2] = 3.3;
        System.out.println(Arrays.toString(arrayOfDoubles) + "\n");

        System.out.println(arrayOfDoubles[0]);

    }
}
