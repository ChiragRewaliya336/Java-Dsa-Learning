public class c8 {
    public static void rectangle(int row, int col) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rectangle(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void paramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invtparamid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = row; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void rotatparamd(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numparamid(int n){
        for(int i=1; i<=n; i++){
            int num =1;
            for(int j=n; j>=i; j--){                
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void flyodparamid(int n){
         int num =1;
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num +" ");
                num ++;
            }           
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        // rectangle(4, 5);
        // hollow_rectangle(4, 5);

        // paramid(4);
        // invtparamid(4);
        // rotatparamd(4);
        // numparamid(5);
        // flyodparamid(5);
    }
}
