package Kingdom;


public class Dog extends Canine implements IPet {


    @Override
        public void makeNoise() {
            System.out.println("Woof, Woof");

        }

    @Override
    public void eat() {
        System.out.println("Shit");
    }


    @Override
    public void beFriendly() {
        System.out.println("Lick your feet");
    }
}

