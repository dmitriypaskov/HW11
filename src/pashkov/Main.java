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
        GeneratePerson generatePerson = new GeneratePerson();
        int weight;
        int height;
        for (int i = 0; i < 100;i++){
            weight = generatePerson.GenerateWeight();
            height = weight + generatePerson.GenerateHeight();
            listOfPersons.add(i,new Person(generatePerson.GenerateName(),
                    generatePerson.GenerateSurname(),generatePerson.GenerateAge (),weight,height));

            System.out.println(listOfPersons.get(i));
        }
    }
}
