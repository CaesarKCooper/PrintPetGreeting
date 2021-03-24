package Shapes;

//create two more shapes. A Triangle and a Circle
//calculatePerimeter and calculateArea of each shape
//Make all your fields private
//Use one of your setters and getters in main
//Print out your objects

public class Circle {

    private int radius;

    public int setRadius(){

        return radius;

    }

    public void setRadius(int radius){

        this.radius = radius;

    }

    public Circle() {

    }


    public Circle(int radius){

        this.radius = radius;

    }



    public void calcAreaCircle(int radius) {

        double area = Math.PI * radius * radius;

        System.out.println("The area of the Circle is " + area);

    }

    public void calcCircumferenceCircle(int radius){

        double circum = Math.PI * 2 * radius;

        System.out.println("The circumference of the Circle is " + circum);

    }




}


