public class Grunnkonsepter {
    public static void main(String[] args) {

        // Bruk av main-metode argumenter, som defineres i konfigurasjonen (når applikasjonen kjøres)
        //System.out.println(args[0] + " " + args[1]);
        System.out.println(args[0]);

        // Sammenhengende if-tester
        System.out.println();
        int nummer = 10;
        if (nummer < 5) {
            System.out.println("The number is less than 5.");
        }
        else if (nummer > 15) {
            System.out.println("The number is greater than 15.");
        }
        else {
            System.out.println("The number is greater than 5, but less than 15.");
        }

        // Ny og separat if-test
        if (nummer == 10) {
            System.out.println("Yippy! The number is 10.");
        }

        // While-løkke som vil kjøre så lenge variabelen iteration er mindre enn 5.
        System.out.println();
        int iteration = 0;
        while (iteration < 5){
            System.out.println(iteration);
            iteration++;
        }

        // for-løkke som vil skrive ut 0 til, men ikke med, 5 (5 gjennomganger).
        System.out.println();
        for (int x = 0; x < 5; x++) {
            System.out.println(x);
        }

        // for-løkke som vil skrive ut 5 til, men ikke med, 0 (5 gjennomganger)
        System.out.println();
        for (int x = 5; x > 0; x--) {
            System.out.println(x);
        }

        // for-løkke som vil skrive ut 5 til, men ikke med, 0, med inkrement på -2 for hver gjennomgang
        // (3 totale gjennomganger)
        System.out.println();
        for (int x = 5; x > 0; x -= 2) {
            System.out.println(x);
        }

        // En rekke med metode kall
        System.out.println();
        printSomething();

        System.out.println();
        printNumberTo(3);

        System.out.println();
        System.out.println(returnTheBestNumber());
    }

    // void-metode som skriver ut "Something!" når kalt.
    public static void printSomething() {
        System.out.println("Something!");
    }

    // void-metode som printer tall fra 0 til og med den spesifiserte int-parameteren.
    public static void printNumberTo(int endNumber) {
        for (int x = 0; x <= endNumber; x++) {
            System.out.println(x);
        }
    }

    // metode som returerer en int-verdi
    public static int returnTheBestNumber() {
        return 42;
    }


}
