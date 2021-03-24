package Shapes;

public class RectangleFactory {
    public static void main(String[] args) {
        Rectangle defaultRect = new Rectangle();
        defaultRect.color = "Gray";
        System.out.println(defaultRect);

        defaultRect.calcArea();// invokes calcArea on defaultRect

        Rectangle colorfulRectangle = new Rectangle("RED", 200, 200);// creates Rectangle object named defaultRect - refers to constructor in Rectangle.java
        colorfulRectangle.color = "PINK";
        colorfulRectangle.setName("pink rectangle");

        System.out.println(colorfulRectangle.getName());

        System.out.println(colorfulRectangle);

        colorfulRectangle.calcArea();

        Rectangle.addObject("BLUE", 300, 100);


    }
}
