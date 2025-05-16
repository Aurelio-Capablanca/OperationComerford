package org.example.SQLAddress.model;

import org.example.SQLAddress.helper.ReadFiles;

import java.util.ArrayList;

public class zipList extends ReadFiles {

    public final static ArrayList<String> zipcodes = new ArrayList<>();
    public final static ArrayList<String> cityNames = new ArrayList<>();


    public static void fillZipCodes() {
        System.out.println("Fill the zipcodes");
        final String text = readFile();
        final String[] words = text.split(",");
        for (String word : words) {
            final String[] array = word.split("-");
            if(array.length > 1){
                cityNames.add(array[0]);
                zipcodes.add(array[1]);
            }
        }
    }


}
