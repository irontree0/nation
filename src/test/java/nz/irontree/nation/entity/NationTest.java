package nz.irontree.nation.entity;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

@Test()
public class NationTest {

    @BeforeSuite
    public void setupNation() {
        Nation land = Nation.getINSTANCE();
        List<Citizen> people = new ArrayList<>();
        people.add(new Citizen(1, "Matt", "Iden", 42, land));
        people.add(new Citizen(2, "Martin", "Apple", 39, land));
        people.add(new Citizen(3, "Luther", "Ingman", 60, land));
        people.add(new Citizen(4, "Lina", "Edelmann", 27, land));
        people.add(new Citizen(5, "Gertruda", "Bernstein", 53, land));
        City city = new City("Littletown");
        city.setCitizens(people);
        District district = new District("Vernonville");
        district.setCities(List.of(city));
        Region region = new Region("Coldston");
        region.setDistricts(List.of(district));
        land.setRegions(List.of(region));
    }

    @Test
    public void getCapitalTest() {
        assertEquals("Major", Nation.getINSTANCE().getNameCapital());
    }

    @Test
    public void getAreaTest() {
        assertEquals("3652 sq km", Nation.getINSTANCE().getNationArea());
    }

    @Test
    public void getRegionsTest() {
        assertEquals(1, Nation.getINSTANCE().getRegions().size());
    }

    @Test
    public void getCitizensTest() {
        assertEquals(5, Nation.getINSTANCE().getCitizens().size());
    }
}
