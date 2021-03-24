package safari;
public class Main {
    public static void main(String[] args) {

        Turtle turtle = new Turtle("turtle breed");
        Dog dog = new Dog("corgi", "DoggyStyle");
        DigitalSnail digitalSnail = new DigitalSnail();

        IPet[] pets = {turtle, dog, digitalSnail};

        printPets(pets);
        System.out.println(" ");
        printPetGreetings(pets);
    }

    public static void printPets(IPet[] passMeAnArrayOfPets) {
        for (IPet pet : passMeAnArrayOfPets) {
            System.out.println("Printing Pet: " + pet.getClass().getSimpleName());

        }
    }

        public static void printPetGreetings(IPet[] passMeAnArrayOfPets){
            for(IPet pet : passMeAnArrayOfPets){
                pet.greetOwner();

            }
        }
    }
