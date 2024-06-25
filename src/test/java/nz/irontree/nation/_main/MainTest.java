package nz.irontree.nation._main;

import nz.irontree.nation.entity.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.testng.AssertJUnit.assertEquals;

public class MainTest {

    private final Nation land = Nation.getStateSingleton();
    private Region region;

    @BeforeSuite
    public void setupNation() {
        List<Citizen> people = new ArrayList<>();
        people.add(new Citizen(1, "Matt", "Iden", 42, land));
        people.add(new Citizen(2, "Martin", "Apple", 39, land));
        people.add(new Citizen(3, "Luther", "Ingman", 60, land));
        people.add(new Citizen(4, "Lina", "Edelmann", 27, land));
        people.add(new Citizen(5, "Gertruda", "Bernst", 52, land));
        City city = new City("Littletown");
        city.setCitizens(people);
        District district = new District("Vernonville");
        district.setCities(List.of(city));
        region = new Region("Coldston");
        region.setDistricts(List.of(district));
        land.setRegions(List.of(region));
    }

    @Test
    public void calculateAverageAgeTest() {
        assertEquals(44, Main.calculateAverageAge(land.getCitizens()));
    }

    @Test
    public void countSurnameOfSizeTest() {
        assertEquals(2, Main.countSurnameOfSize(6));
    }

    @Test
    public void getCitizensByRegionWithNameStartsWithLetterTest() {
        Map<Region, List<Citizen>> citizensByRegion = Main.getCitizensByRegionWithNameStartsWithLetter('M');
        assertEquals(1, citizensByRegion.size());
        assertEquals(2, citizensByRegion.get(region).size());
    }
}
