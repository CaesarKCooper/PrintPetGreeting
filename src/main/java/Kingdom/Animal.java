package Kingdom;

//Base, Super, Parent
//we made animal which is abstract

public abstract class Animal {

    String breed;


    public Animal() {
    } //default constructor

    public void eat() {
        System.out.println("Animal eating");
    }

    //abstract method
    abstract public void makeNoise();


    public void giveCoronaShot(Animal a) {

        a.makeNoise();

    }

    //overload
    public void giveCoronaShot(Animal a, String x) {

        a.makeNoise();


    }
}