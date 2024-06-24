package nz.irontree.nation.entity;

import nz.irontree.nation.util.CitizenGenerator;

import java.util.ArrayList;
import java.util.List;

public class District {

    private String districtName;

    private List<City> cities;

    public District(String districtName) {
        this.districtName = districtName;
        this.cities = new ArrayList<>();
        for (int i = 0; i < CitizenGenerator.RANDOM.nextInt(3); i++) {
            this.cities.add(new City(CitizenGenerator.generateName()));
        }

    }
}
