package nz.irontree.nation.util;
import nz.irontree.nation.entity.Citizen;
import nz.irontree.nation.entity.Nation;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CitizenGenerator {

    public static final Random RANDOM = new Random();
    private static final int NAME_LENGTH_MIN = 5;
    private static final int NAME_LENGTH_MAX = 10;
    private static final int AGE_MAX = 100;

    public static List<Citizen> generateCitizens(int numberOfPeople) {
        List<Citizen> people = new ArrayList<>();
        for (int i = 1; i <= numberOfPeople; i++) {
            int id = Nation.getStateSingleton().getCitizensCount();
            people.add(generateCitizen(id));
            Nation.getStateSingleton().incrementCitizenCount();
        }
        return people;
    }

    // create citizen
    private static Citizen generateCitizen(int id) {
        return new Citizen(
                id,
                generateName(),
                generateName(),
                generateAge(),
                Nation.getStateSingleton()
        );
    }

    // random word
    public static String generateName() {
        int length = RANDOM.nextInt(NAME_LENGTH_MAX - NAME_LENGTH_MIN + 1) + NAME_LENGTH_MIN;
        StringBuilder nameBuilder = new StringBuilder(length);
        nameBuilder.append((char) (RANDOM.nextInt(26) + 'A'));
        for (int i = 1; i < length; i++) {
            char c = (char) (RANDOM.nextInt(26) + 'a');
            nameBuilder.append(c);
        }
        return nameBuilder.toString();
    }

    // random age
    private static int generateAge() {
        return RANDOM.nextInt(AGE_MAX);
    }
}
