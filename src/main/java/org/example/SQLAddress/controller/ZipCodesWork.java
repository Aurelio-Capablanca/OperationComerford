package org.example.SQLAddress.controller;

import org.example.SQLAddress.model.citiesHashMap;
import org.example.SQLAddress.model.zipList;

public class ZipCodesWork {

    public static void workZipCodes() {
        citiesHashMap.fillOwnHasMap();
        System.out.println("Full Size of Cities: " + citiesHashMap.ownHashMap.size());

        zipList.fillZipCodes();
        System.out.println("Zipcodes : " + zipList.zipcodes.size() + " Cities : " + zipList.cityNames.size());

        zipList.builder.setLength(0);
        zipList.builder.append("INSERT INTO ml_co_zip_codes (zip, id_city) VALUES\n");
        int cityID;
        for (int i = 0; i < zipList.cityNames.size(); i++) {
            cityID = citiesHashMap.searchValue(zipList.cityNames.get(i));
            if (cityID != 0) {
                zipList.builder.append("('").append(zipList.zipcodes.get(i)).append("',").append(cityID).append("),\n");
            }
        }
        zipList.CreateDocument("Zips-SQL", zipList.builder.toString());
    }

}
