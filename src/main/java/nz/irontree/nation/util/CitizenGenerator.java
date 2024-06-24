package nz.irontree.nation.util;
import nz.irontree.nation.entity.Citizen;
import nz.irontree.nation.entity.Nation;

import java.util.Random;

public class CitizenGenerator {

    private static final Random RANDOM = new Random();
    private static final int NAME_LENGTH_MIN = 5;
    private static final int NAME_LENGTH_MAX = 10;
    private static final int AGE_MAX = 100;
//    int numberOfPeople = 10;
//    List<CitizenGenerator> people = new ArrayList<>();

    // create citizen
    private static Citizen generateCitizen() {
        return new Citizen(
                1,//todo update
                generateName(),
                generateName(),
                generateAge(),
                Nation.getStateSingleton()
        );
    }

    // random word
    private static String generateName() {
        int length = RANDOM.nextInt(NAME_LENGTH_MAX - NAME_LENGTH_MIN + 1) + NAME_LENGTH_MIN;
        StringBuilder nameBuilder = new StringBuilder(length);
        nameBuilder.append((char) (RANDOM.nextInt(26) + 'A'));
        for (int i = 1; i < length; i++) {
            char c = (char) (RANDOM.nextInt(26) + 'a');
            nameBuilder.append(c);
        }
        return nameBuilder.toString();
    }

    // frandom age
    private static int generateAge() {
        return RANDOM.nextInt(AGE_MAX);
    }
}
