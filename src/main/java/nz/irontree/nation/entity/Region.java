package nz.irontree.nation.entity;
import nz.irontree.nation.util.CitizenGenerator;

import java.util.ArrayList;
import java.util.List;

public class Region {

    private final String regionName;
    private final City majorCity;
    private List<District> districts;

    public Region(String regionName) {
        this.regionName = regionName;
        this.districts = new ArrayList<>();
        for (int i = 0; i < CitizenGenerator.RANDOM.nextInt(3) + 2; i++) {
            this.districts.add(new District(CitizenGenerator.generateName()));
        }
        this.majorCity = districts.getFirst().getCities().getFirst();
    }

    public City getMajorCity() {
        return majorCity;
    }

    public String getRegionName() {
        return regionName;
    }

    public List<Citizen> getCitizens() {
        List<Citizen> citizens = new ArrayList<>();
        for (District district : this.districts) {
            citizens.addAll(district.getCitizens());
        }
        return citizens;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
}
