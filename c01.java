//import java.util.*;

public class c01 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println("Hello, World!\nThis is a simple Java program.");
        // System.out.println("****\n***\n**\n*");

        /*
         * int a = 10;
         * int b = 20;
         * int sum = a + b;
         * System.out.println("The value of a is: " + a);
         * System.out.println("The value of b is: " + b);
         * System.out.println("THe sum of " + a + " and " + b + " is :" + sum);
         * a = 15;//
         * b = 20;
         * System.out.println("The value of a is: " + a);
         * System.out.println("The value of b is: " + b);
         * sum = a + b;
         * System.out.println("THe sum of " + a + " and " + b + " is :" + sum);
         */

        /*
         * int a = 10; //This is a integer variable & size is 4 bytes
         * byte b = 20; //This is a byte variable & limit is -128 to 127
         * short c = 30; //This is a short variable & size is 2 bytes
         * char d = 'A'; //This is a char variable & used for single characters & size
         * is 2 bytes
         * long e = 100000L; //This is a long variable & size is 8 bytes
         * float f = 3.14f; //This is a float variable & used for decimal values with
         * less precision & size is 4 bytes
         * double g = 3.14159; //This is a double variable & used for long decimal
         * values & size is 8 bytes
         * boolean h = true; //This is a boolean variable & used for true or false
         * values
         * System.out.println("The value of a is: " + a);
         * System.out.println("The value of b is: " + b);
         * System.out.println("The value of c is: " + c);
         * System.out.println("The value of d is: " + d);
         * System.out.println("The value of e is: " + e);
         * System.out.println("The value of f is: " + f);
         * System.out.println("The value of g is: " + g);
         * System.out.println("The value of h is: " + h);
         */

        // Input in Java
        /*Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        String input = sc.nextLine(); // sc is the object of Scanner class & nextLine() is a method to read a line of
        // text from the user
        System.out.println("You entered: " + input);*/
        /*Scanner my = new Scanner(System.in);
        Boolean isJavaFun = my.nextBoolean();
        System.out.println("Is Java fun? " + isJavaFun); */

        // 02 Questions:- area and sum of two numbers
        /*Scanner my =new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        float radius = my.nextFloat();
        float area;
        area = 3.14f * radius * radius;
        System.out.println("The area of the circle is: " + area);*/

        //Type conversion
        //int a =25;
        //long b=a;
        //Type casting
        /*float a = 25.25f;
        int b= (int)a;
        System.out.println(b);
        char ch = 'A';
        int asciiValue = (int) ch;
        System.out.println("The ASCII value of " + ch + " is: " + asciiValue);*/
        //Type promotion
        /*char ch = 'A';
        char ch2 = 'B';
        System.out.println(ch - ch2); // This will print the difference of ASCII values of 'A' and 'B'
        byte b =5;
        //b = b*2; // This will give an error because the result of b*2 is an int, and we cannot assign an int to a byte without explicit casting
        b = (byte )(b*2);
        System.out.println(b); */
    }
}
