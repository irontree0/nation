package nz.irontree.nation.entity;

import java.util.List;

public final class Nation {
    private static Nation StateSingleton;

    private List<Region> regions;

    private Nation() {

    }

    public static Nation getStateSingleton() {
        if (StateSingleton == null) {
            StateSingleton = new Nation();
        }
        return StateSingleton;
    }
}
