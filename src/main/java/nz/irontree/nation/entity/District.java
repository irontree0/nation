package nz.irontree.nation.entity;
import nz.irontree.nation.util.CitizenGenerator;
import java.util.ArrayList;
import java.util.List;

public class District {

    private final String districtName;
    private List<City> cities;

    public District(String districtName) {
        this.districtName = districtName;
        this.cities = new ArrayList<>();
        for (int i = 0; i < CitizenGenerator.RANDOM.nextInt(3) + 2; i++) {
            this.cities.add(new City(CitizenGenerator.generateName()));
        }
    }

    public List<City> getCities() {
        return cities;
    }

    public List<Citizen> getCitizens() {
        List<Citizen> citizens = new ArrayList<>();
        for (City city : this.cities) {
            citizens.addAll(city.getCitizens());
        }
        return citizens;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
