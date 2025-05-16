package org.example.SQLAddress.model;

public class ManageCityKeys {

    private final String nameCity;
    private final Integer idCity;

    public ManageCityKeys(String nameCity, Integer idCity) {
        this.nameCity = nameCity;
        this.idCity = idCity;
    }

    public String getNameCity() {
        return nameCity;
    }

    public Integer getIdCity() {
        return idCity;
    }

}
