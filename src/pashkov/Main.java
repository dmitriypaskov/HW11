package pashkov;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 1) Create a Person class that describes a person, with fields: name, surname, age, weight, height.
        // Create one or more constructors to ensure that everyone has a first name, last name.
        // Create an array of 100 objects of type Person filled with random data
        // (For example, create an array for several names and choose from it randomly).
        List<Person> listOfPersons = new ArrayList<>();
        PersonGenerator personGenerator = new PersonGenerator();
        for (int i = 0; i < 100;i++){
            listOfPersons.add(i,personGenerator.generatePerson());
            System.out.println(listOfPersons.get(i));
        }
    }
}
