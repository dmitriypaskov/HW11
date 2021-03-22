package pashkov;

import java.util.Random;

public class PersonGenerator {

    private static final String LOVER = "abcdefghijklmnopqrstuvwxyz";
    private static final Random RANDOM = new Random();
    private static final StringBuilder SB = new StringBuilder();

    public static String generateName() {
        SB.append(Character.toUpperCase(LOVER.charAt(RANDOM.nextInt(25))));
        for (int i = 0; i < 7; i++) {
            SB.append(LOVER.charAt(RANDOM.nextInt(25)));
        }
        return SB.toString();
    }

    public static String generateSurname() {
        SB.append(Character.toUpperCase(LOVER.charAt(RANDOM.nextInt(25))));
        for (int i = 0; i < 7; i++) {
            SB.append(LOVER.charAt(RANDOM.nextInt(25)));
        }
        String suffix = "enko";
        SB.append(suffix);
        return SB.toString();
    }

    public static int generateAge() {
        return RANDOM.nextInt(60) + 19;
    }

    public static int generateWeight() {
        return RANDOM.nextInt(60) + 55;
    }

    public static int generateHeight() {
        return RANDOM.nextInt(5) + 95;
    }

    public Person generatePerson() {
        int weight = PersonGenerator.generateWeight();
        int height = weight + PersonGenerator.generateHeight();
        return new Person(PersonGenerator.generateName(),
                PersonGenerator.generateSurname(), PersonGenerator.generateAge(),weight,height);
    }
}

