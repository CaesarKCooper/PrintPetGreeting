package Shapes;

public class Rectangle {

    //instance variables - global
    public String color;
    public int width;
    public int height;
    private String name;

    //Getter
    public String getName(){
        return name;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    public Rectangle() {
        this(40, 50); //calls specified constructor
    }


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //Overloaded constructor
    public Rectangle(String color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    //Method
    public void calcArea(){
        System.out.println("Area is " + this.width * this.height);
}

public static void addObject(String color, int xAxis, int yAxis){ //adding rectangle object to screen
    System.out.println("Added a " + color + " rectangle to position " + xAxis + " on the xAxis" + " and to the postition " + yAxis + " on the yAxis");
}


    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}

