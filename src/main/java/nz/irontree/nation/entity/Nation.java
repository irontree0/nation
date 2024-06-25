package nz.irontree.nation.entity;

import nz.irontree.nation.util.CitizenGenerator;

import java.util.ArrayList;
import java.util.List;

public final class Nation {
    private static Nation StateSingleton;
    private String nameNation;
    private String nameCapital;
    private String nationArea;
    private static List<Region> regions;
    private int citizensCount = 0;

    private Nation() {
        nameNation = "Land";
        nameCapital = "Major";
        nationArea = "3652 sq km";
        regions = new ArrayList<>();
    }

    public int getCitizensCount() {
        return citizensCount;
    }

    public void incrementCitizenCount() {
        citizensCount += 1;
    }

    public static Nation getStateSingleton() {
        if (StateSingleton == null) {
            StateSingleton = new Nation();
            for (int i = 0; i < CitizenGenerator.RANDOM.nextInt(3) + 2; i++) {
                regions.add(new Region(CitizenGenerator.generateName()));
            }
        }
        return StateSingleton;
    }

    public String getNameNation() {
        return nameNation;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public String getNationArea() {
        return nationArea;
    }

    public List<Region> getRegions() {
        return regions;
    }

    public List<Citizen> getCitizens() {
        List<Citizen> citizens = new ArrayList<>();
        for (Region region : this.regions) {
            citizens.addAll(region.getCitizens());
        }
        return citizens;
    }

    public void setRegions(List<Region> regions) {
        Nation.regions = regions;
    }
}
