import java.util.*;

public class c7 {
    public static void prth() {
        System.out.println("Hello world!");
        // return;
    }

    public static int calsum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum(f1) is: " + sum);
        return sum;
    }

    public static int calsum(int num1, int num2) { // parameter
        int sum = num1 + num2;
        System.out.println("Sum(f2) is: " + sum);
        return sum;
    }

    public static int calcsum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static float sum(float a, float b) {
        return a + b;
    }

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(" Value of a = " + a + " by swap ");
        System.out.println(" Value of b = " + b + " by swap ");
    }

    public static int product(int num1, int num2) {
        int prod = num1 * num2;
        System.out.println("Product is: " + prod);
        return prod;
    }

    public static int factorai(int num) {
        int fact = 1;
        if (num == 0) {
            return 1;
        } else {
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }

    public static boolean prime(int n) {
        if (n==2) {
            return true;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // // prth();
        // // calsum();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // // calsum(a,b); //arguments

        // int sum= calcsum(a, b);
        // System.out.println("Sum(calcsum) is: "+sum);

        // int a=10;
        // int b=5;
        // swap(a,b); // call by value means that you swap the values but it will not
        // effect original vlaue of a and b
        // System.out.println("a= "+a); // the swap will be avaliable in function value
        // System.out.println("b= "+b);

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int multiply= product(a, b);
        // System.out.println("Product by mu. variable:" +multiply);

        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // System.out.println( factorai(a));

        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int r = sc.nextInt();
        // int numerator = factorai(n);
        // int denominator = factorai(r) * factorai(n-r);
        // int coffiecent = numerator/denominator;
        // System.out.println("Binominal coffiecent is: "+coffiecent);

        // function overloading:using no of parameters.
        // calsum();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum= calsum(a,b);
        // System.out.println(sum);

        // using data types
        // System.out.println(sum(3, 5));
        // System.out.println(sum(3.2f, 5.2f));

        // prime
        // System.out.println(prime(1));

    }
}
