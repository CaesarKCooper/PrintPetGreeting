package Kingdom;

import java.util.Arrays;

public class AnimalKingdom {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.breed = "Pitbull";


        //dog.makeNoise();

        Cat cat = new Cat();
        //cat.eat();

        RoboDog roboDog = new RoboDog();

        IPet[] pets = {dog, cat, roboDog};

        //for each loop
        for (IPet x : pets){
            x.beFriendly();

        }

        String [] names = {"do", "mo", "ra"};
        for (String x : names){
            System.out.println(x);
        }

        //Animal[] animals = {dog, cat, hippo};
        //for (int x = 0; x < animals.length; x++){

            //animals[x].eat();

        //}

        //System.out.println(Arrays.toString(animals));
        //Animal animal = new Animal();
        //animal.giveCoronaShot(dog);


    }

}
