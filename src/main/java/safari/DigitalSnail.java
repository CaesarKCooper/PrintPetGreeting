package safari;

public class DigitalSnail implements IPet {



    @Override
    public void greetOwner() {
        System.out.println(getClass().getSimpleName() + " says HI");
    }

    public String toString() {
        return "Animal{" +
                "breed='" + "digital" + '\'' +
                '}';
    }
}
