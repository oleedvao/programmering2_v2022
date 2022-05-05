package no.hiof.oleedvao.oblig4;

import no.hiof.oleedvao.oblig4.models.Star;
import no.hiof.oleedvao.oblig4.tools.StarCSVFileHandler;

import java.util.ArrayList;

public class MainFileHandling {
    public static void main(String[] args) {
        Star sun = new Star("Sun", 1.0, 1.0, 5777);
        Star muCas = new Star("MU Cas", 4.192, 4.657, 14750);
        Star v69_47 = new Star("V69-47", 1.316, 0.876, 5945);
        Star yzCas = new Star("YZ Cas", 2.547, 2.308, 9200);
        Star ngc188 = new Star("NGC188", 1.425, 1.102, 5900);
        Star zetPhe = new Star("zet Phe", 2.853, 3.922, 14550);

        ArrayList<Star> stars = new ArrayList<>();
        stars.add(sun);
        stars.add(muCas);
        stars.add(v69_47);
        stars.add(yzCas);
        stars.add(ngc188);
        stars.add(zetPhe);

        StarCSVFileHandler starCSVFileHandler = new StarCSVFileHandler();
        starCSVFileHandler.writeObjectsToFile(stars, "stars.csv");

        ArrayList<Star> starsReadFromFile = starCSVFileHandler.readObjectsFromFile("stars.csv");
        for (Star star : starsReadFromFile) {
            System.out.println(star);
        }
    }
}
