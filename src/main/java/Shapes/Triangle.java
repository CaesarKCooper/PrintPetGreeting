package Shapes;

//create two more shapes. A Triangle and a Circle
//calculatePerimeter and calculateArea of each shape
//Make all your fields private
//Use one of your setters and getters in main
//Print out your objects

public class Triangle {

    private int base;
    private int height;
    private int side1;
    private int side2;
    private int side3;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;

    }

    public Triangle(int base, int height, int side1, int side2, int side3) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {

    }

    public Triangle(int base, int height) {

        this.base = base;
        this.height = height;

    }

    public Triangle(int side1, int side2, int side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }


    public void calcAreaTriangle(int base, int height) {

        int area = base * height / 2;
        System.out.println("The area of the triangle is " + area);
    }

    public void calcPerimeterTriangle(int side1, int side2, int side3) {

        int perim = side1 + side2 + side3;
        System.out.println("The perimeter of the Triangle is " + perim);

    }




    }

