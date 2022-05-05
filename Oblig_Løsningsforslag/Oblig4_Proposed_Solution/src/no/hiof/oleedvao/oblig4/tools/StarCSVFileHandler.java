package no.hiof.oleedvao.oblig4.tools;

import no.hiof.oleedvao.oblig4.interfaces.FileHandler;
import no.hiof.oleedvao.oblig4.models.Star;

import java.io.*;
import java.util.ArrayList;

public class StarCSVFileHandler implements FileHandler<Star> {

    @Override
    public ArrayList<Star> readObjectsFromFile(String fileName) {

        ArrayList<Star> returListe = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String linje;

            while ((linje = bufferedReader.readLine()) != null) {
                String[] verdier = linje.split(";");

                Star star = new Star(verdier[0], Double.parseDouble(verdier[1]),
                        Double.parseDouble(verdier[2]), Double.parseDouble(verdier[3]));

                returListe.add(star);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        catch (IOException ioException) {
            ioException.printStackTrace();
        }

        return returListe;
    }

    @Override
    public void writeObjectsToFile(ArrayList<Star> objects, String fileName) {

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            for (Star star : objects) {
                bufferedWriter.write(star.getName() + ";" + star.getRadius() + ";" + star.getMass() + ";" + star.getEffectiveTemp());
                bufferedWriter.newLine();
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            System.err.println(fileNotFoundException.getMessage());
        }
        catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
