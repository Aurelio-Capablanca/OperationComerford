package org.example.SQLAddress.controller;

import org.example.SQLAddress.model.citiesHashMap;
import org.example.SQLAddress.model.statesHashMap;

public class CitiesWork {

    public static void citiesActions(){

        citiesHashMap.fillArrays();/*This one is a Class call to use the static*/
        System.out.println("States : "+citiesHashMap.stateNames.size()+" Cities: "+citiesHashMap.citiesNames.size());

        citiesHashMap.builder.setLength(0);
        citiesHashMap.builder.append("INSERT INTO ml_co_cities (city, id_state) VALUES \n");
        int stateID;
        for(int i = 0; i < citiesHashMap.stateNames.size(); i++){
            stateID = statesHashMap.statesOrigin.get(citiesHashMap.stateNames.get(i)) != null ? statesHashMap.statesOrigin.get(citiesHashMap.stateNames.get(i)) : 0;
            if(stateID != 0){
                citiesHashMap.builder.append("('").append(citiesHashMap.citiesNames.get(i)).append("', ").append(stateID).append("),\n");
            }
        }
        citiesHashMap.CreateDocument("SQL-File",citiesHashMap.builder.toString());
        citiesHashMap.builder.setLength(0);

    }

}
