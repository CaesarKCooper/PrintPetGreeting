package Lecture2;

public class Demo2 {


        // create method outside main method
        public static void multiplyByTwo(int placeHolder){
            System.out.println(placeHolder * 2);
        }


        public static void multiplySubtractParam(int param1, int param2, int param3){
            System.out.println(param1 * param2 - param3);
        }

        public static void main (String[]args){
            //use method inside main
/*
            multiplyByTwo(4);
            multiplySubtractParam(1, 2, 3);
            System.out.println(who("Mug", 100.0, 3));
*/
            System.out.println(discountProduct(100, 10));
        }

        public static boolean whatever(boolean x){
            return true;
        }

        //method syntax
        public static String who(String product, double price, int quantity){

            //return "The final price" + 100;
            return "The final price" + price * quantity;

        }

        //create a method that takes price of product and discount amount and returns price of discount
        public static double discountProduct(double price, double discount){
            //step 1. get price
            double dis = price * (discount/100);
            double finalPrice = price - dis;

            return finalPrice;

        }




    }

