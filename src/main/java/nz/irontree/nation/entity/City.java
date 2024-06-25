package nz.irontree.nation.entity;
import nz.irontree.nation.util.CitizenGenerator;
import java.util.List;

public class City {

    private final String cityName;
    private List<Citizen> citizens;

    public City(String cityName) {
        this.cityName = cityName;
        this.citizens = CitizenGenerator.generateCitizens(10);
    }

    public String getCityName() {
        return cityName;
    }

    public List<Citizen> getCitizens() {
        return citizens;
    }

    public void setCitizens(List<Citizen> citizens) {
        this.citizens = citizens;
    }
}
