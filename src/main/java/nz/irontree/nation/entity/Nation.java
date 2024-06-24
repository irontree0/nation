package nz.irontree.nation.entity;

import java.util.List;

public final class Nation {
    private static Nation StateSingleton;
    private String nameNation;
    private List<Region> regions;
    private int citizensCount = 0;

    private Nation() {
        nameNation = "Land";
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
        }
        return StateSingleton;
    }

    public String getNameNation() {
        return nameNation;
    }
}
