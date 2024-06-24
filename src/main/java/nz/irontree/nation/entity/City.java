package nz.irontree.nation.entity;

import nz.irontree.nation.util.CitizenGenerator;

import java.util.List;

public class City {

    private String cityName;

    private List<Citizen> citizens;
    public City(String name) {
        this.cityName = cityName;
        this.citizens = CitizenGenerator.generateCitizens(10);

    }
}
