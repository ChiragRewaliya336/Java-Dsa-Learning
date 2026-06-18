import java.util.*;

public class c03 {
    public static void main(String[] args) {
        // Conditionl statement:
        // int age = 15;
        // if (age>=18) {
        // System.out.println("adult: drive, vote");
        // }
        // else if (age>13 && age<18) {
        // System.out.println("teenager");
        // }
        // else{
        // System.out.println("not adult ");
        // }
        // int num = 17;
        // if (num%2==0) {
        // System.out.println("Even");
        // }
        // else{
        // System.out.println("odd");
        // }

        // int a =10;
        // int b =20;
        // int c=5;
        // if (a>=b&&a>=c) {
        // System.out.println("Largest number is a: "+a);
        // }
        // else if (b>=a&&b>=c) {
        // System.out.println("largest number is b:" +b);
        // }
        // else{
        // System.out.println("largest number is c: "+c);
        // }

        // ternary operator:
        // int a = 20;
        // String type = ((a % 2) == 0) ? "even" : "odd";
        // System.out.print(type);

        // int marks=33;
        // String result = marks>=33 ? "pass" : "fail";
        // System.out.println(result);

        // switch statement:
        // int number = 2;
        // switch (number) {
        // case 1:
        // System.out.println("Samosa");
        // break;
        // case 2:
        // System.out.println("Burger");
        // break;
        // default:
        // System.out.println("Wake up");
        // break;
        // }

        // 02 activites: Calculator and swap question
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your 1st number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter your 2nd number: ");
        // int b = sc.nextInt();
        // System.out.print("Enter your operator(+,*,%,-,/):");
        // String opn = sc.next();
        // switch (opn) {
        // case "+":
        // System.out.print("Sum of the numbers is: " + (a + b));
        // break;
        // case "-":
        // System.out.print("Substract of the numbers is: " + (a - b));
        // break;
        // case "*":
        // System.out.print("Multiply of the numbers is: " + (a * b));
        // break;
        // case "/":
        // System.out.print("Divide of the numbers is: " + (a / b));
        // break;
        // case "%":
        // System.out.print("Reminder of the numbers is: " + (a % b));
        // break;45
        // default:
        // System.out.println("Bhai operations thik se daal.");
        // break;
        // }
        // sc.close();
        // swapping:
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your 1st number: ");
        // int a = sc.nextInt();
        // System.out.print("Enter your 2nd number: ");
        // int b = sc.nextInt();
        // int c;
        // c=a;
        // a=b;
        // b=c;
        // System.out.println("Value of 1st num is: "+a);
        // System.out.println("Value of 2nd num IS: "+b);

        // without of third variable:
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("value of a is:" +a);
        System.out.println("value of b is:" +b);
        sc.close();
    }
}
