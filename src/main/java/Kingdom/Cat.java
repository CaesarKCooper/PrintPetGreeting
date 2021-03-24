package Kingdom;
//concrete class
public class Cat extends Feline implements IPet {

    @Override
    public void eat() {
        System.out.println("Tuna");
    }

    @Override
    public void makeNoise(){
        System.out.println("meow, meow");
    }


    @Override
    public void beFriendly() {
        System.out.println("purrrrrrr");
    }
}
