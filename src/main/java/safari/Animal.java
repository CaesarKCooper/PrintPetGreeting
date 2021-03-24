package safari;
import java.util.Arrays;
// Mold - a blueprint
//Parent -
public abstract class Animal {
    private String breed; // ivar
    private String name;
    public Animal(String breed, String name){
        this.breed = breed;
        this.name = name;
    }

    public Animal(String breed) {
    }

    //getter
    public String getBreed(){
        return this.breed;
    }
    //getter
    public String getName(){
        return this.name;
    }
    // method signature
    public abstract void  moveAnimal(int distance);
    //create a method that takes an array of Animals

    public static void printAnimals(IPet[] passMeAnArrayOfAnimals){
        for(IPet pet : passMeAnArrayOfAnimals){
            System.out.println("printing animal : " + pet);
        }
    }
    @Override
    public String toString() {
        return "Animal{" +
                "breed='" + breed + '\'' +
                '}';
    }
}