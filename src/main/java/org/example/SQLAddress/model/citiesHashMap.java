package org.example.SQLAddress.model;

import org.example.SQLAddress.helper.ReadFiles;

import java.util.*;

public class citiesHashMap extends ReadFiles {
    public static final ArrayList<ManageCityKeys> ownHashMap = new ArrayList<>();
    public static final ArrayList<String> citiesNames = new ArrayList<>();
    public static final ArrayList<String> stateNames = new ArrayList<>();

    public static void fillArrays() {
        final String text = readFile();
        final String[] words = text.split(",");
        CreateDocument("Original", Arrays.toString(words));

        final Set<String> separate = new HashSet<>(List.of(words));
        CreateDocument("Unique", separate.toString());
        for (String word : separate) {
            final String[] obj = word.split("-");
            if (obj.length > 1) {
                citiesNames.add(obj[1]);
                stateNames.add(obj[0].replaceAll("\\s", ""));
            }
        }
    }

    public static void fillOwnHasMap() {
        System.out.println("Fill the cities keys and Values");
        final String text = readFile();
        final String[] words = text.split(",");
        for (String word : words) {
            final String[] object = word.split("-");
            if (object.length > 1) {
                ownHashMap.add(new ManageCityKeys(object[0].trim(), Integer.parseInt(object[1].trim())));
            }
        }
    }


    public static Integer searchValue(String value) {
        Integer id = 0;
        for (ManageCityKeys key : ownHashMap) {
            if (key.getNameCity().equals(value)) {
                id = key.getIdCity();
            }
        }
        return id;
    }

}