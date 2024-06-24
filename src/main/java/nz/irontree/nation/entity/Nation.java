package nz.irontree.nation.entity;

public final class Nation {
    private static Nation StateSingleton;

    private Nation() {
    }

    public static Nation getStateSingleton() {
        if (StateSingleton == null) {
            StateSingleton = new Nation();
        }
        return StateSingleton;
    }
}
