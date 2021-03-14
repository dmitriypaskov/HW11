package pashkov;

import java.util.Random;

public class GeneratePerson {

    private static final String LOVER = "abcdefghijklmnopqrstuvwxyz";
    private static final Random RANDOM = new Random();

    public String GenerateName() {
        StringBuilder SB = new StringBuilder();
        SB.append(Character.toUpperCase(LOVER.charAt(RANDOM.nextInt(25))));
        for (int i = 0; i < 7; i++) {
            SB.append(LOVER.charAt(RANDOM.nextInt(25)));
        }
        return SB.toString();
    }

    public String GenerateSurname() {
        StringBuilder SB = new StringBuilder();
        SB.append(Character.toUpperCase(LOVER.charAt(RANDOM.nextInt(25))));
        for (int i = 0; i < 7; i++) {
            SB.append(LOVER.charAt(RANDOM.nextInt(25)));
        }
        String suffix = "enko";
        SB.append(suffix);
        return SB.toString();
    }

    public int GenerateAge() {
        return RANDOM.nextInt(60) + 19;
    }

    public int GenerateWeight() {
        return RANDOM.nextInt(60) + 55;
    }

    public int GenerateHeight() {
        return RANDOM.nextInt(5) + 95;
    }
}

