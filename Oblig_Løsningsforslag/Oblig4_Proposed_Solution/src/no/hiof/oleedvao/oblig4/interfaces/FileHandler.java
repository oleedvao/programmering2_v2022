package no.hiof.oleedvao.oblig4.interfaces;

import java.util.ArrayList;

public interface FileHandler<T> {

    ArrayList<T> readObjectsFromFile(String fileName);

    void writeObjectsToFile(ArrayList<T> objects, String fileName);
}
