package Package;

public class Demo {
    public static void main(String[] args) {

        //int x; //declaring variable

        //x = 0; //initialise variable

        //static final int; //static variable

        //public static void main; //static method

        //Person person = new Person(); //Person is a data type, person is a reference data type

        //Integer is wrapper class for int (uppercase and full name of data type)

        //"1" == 1 only use two equal signs

/*
        Strings are objects
        Strings are arrays of characters(elements)
*/

/*
        String s = "Year";
        String anotherSting = s.concat("Up"); you need to build another string, strings are immutable and cant be changed
*/

/*
        StringBuilder string = new StringBuilder();
        StringBuilder.append("Year").append("Up"); stringbuilder builds strings, string builder is changable so can reassigned
*/

/*
        double x = 13
        int y = (int) x; casting bigger type to smalller, loses some value
*/

/*
        String s = "Yo, Chill";
        char theLastChar = s.charAt(s.length) -1); //equals l
*/

        //Exceptions usually errors

/*
        String numberOneCity = "wilmington, DE";
        String numberTwoCity = "Wilmington, DE";
        System.out.println(numberOneCity.equals(numberTwoCity)); .equals is used for objects, == is used for primitives
*/


/*
        System.out.println("My name is %s. I was born in %d, Mike");
        int age = 22;
        String str = String.format("My name is %s. I was born in %d, Mike");
        System.out.println(str);
*/


/*
        %d int, short byte
        %c char
        %f double float
        %s string
*/

/*
        String firstName = "Christopher";
        System.out.println(firstName.substring(0,5)); prints out Chris
*/

        //import static java.util.Arrays.*; imports array library, * import all

        //int[] numbers = ?


/*
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to wakanda, what is your name?");
        String name = userInput.nextLine();
        System.out.println("Welcome home " + name);


        Scanner userInput2 = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = userInput.nextInt();
        System.out.println("Welcome home " + name + " you must be" + age);
*/

/*
        Scanner userInput = new Scanner(System.in);
        System.out.println("What prouct would you like?");
        String name1 = userInput.nextLine();
        System.out.println("How many would you like?");
        int Qty = userInput.nextInt();
        double Price = 5.0;
        System.out.println("The Price is " +  Price );
        double total = Qty * Price;
        System.out.println(" ");
        System.out.println("Product: " + name1 + "   Qty: " + Qty + "   Price: " + Price + "   Total: " + total);
*/

/*
        //Scan for user input
        Scanner userInput = new Scanner(System.in);
        System.out.println("What do you want to buy?");
        //I need to store the user answer: product they want
        String Product = userInput.nextLine();
        System.out.println(Product);
        //How many do they want to buy
        System.out.println("How many do you want to buy?");
        int Qty = userInput.nextInt();
        System.out.println(Qty);
        System.out.println("How much do you want to pay");
        double Price = userInput.nextDouble();
        System.out.println(Price);
        //Calculation total prices
        //Multiply qty by price
        double Total = Qty * Price;
        System.out.println("You owe :" + Total);
        //Format strings
        //I need the title
*/


/*
        System.out.println("What are you looking to buy today ?");
        String product =  userInput.nextLine();
        System.out.println("How many are you looking to buy?");
        int qty =  userInput.nextInt();
        System.out.println("How much are you willing to pay for each one? ");
        int price =  userInput.nextInt();
        double total = qty * price ;
        String title = String.format("%-10s %5s %10s  %10s", "Product", "Qty", "Price", "Total");
        String underlines = String.format("%-10s %5s %10s %10s", "----", "---", "-----", "-----");
        String result = String.format("%-10s %5s %10s %10s", product, qty, price, total);
        System.out.println(title);
        System.out.println(underlines);
        System.out.println(result);
        System.out.println("\n");
        System.out.printf("%30s","Thank you. Come Again!!!"); Correct answer
*/

/*
        Scanner userInput = new Scanner(System.in);
        int age = user.Input.nextInt();

        if(age >= 21) {
            System.out.println("Come in");
        }else if(age > 18 && age <= 21);
            System.out.println("18 to party, 21 to drink");
        }else {
            System.out.println("You can't come in");
*/

/*
        Scanner userInput = new Scanner(System.in);
        String temp = user.Input.nextInt();

      HW:
        if(temp = high){
            System.out.println("Sunblock may be needed");
        } else if(temp = low){
            System.out.println("A coat may be needed");
        }
*/

/*
        String[][] artistInfo = {
                {"Biggie", "Jayz", "Nas"},
                {"Juicy", "99 Problems", "One mic"},
        };
        System.out.println(artistInfo[1][1]);
*/
/*
        int x = 1;
        while (x < 9) {
            System.out.println(x);
            x = x + 1;
        }
*/
/*
        int x = 0;
        do{
            System.out.println("The value of x in the do while loop is: " + x);
            x++;
        }while(x < 5);
    }
*/

/*
    for(int x = 0; x < 10; x++){
        System.out.println(x);
*/

    }

}






