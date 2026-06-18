public class c05 {
    public static void main(String[] args) {
        // for(int i =1; i<=4; i++){ //row
        //     for(int j =1; j<=i; j++){    //clumn
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i =1; i<=4; i++){ //row
        //     for(int j =4; j>=i; j--){    //clumn
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i =1; i<=4; i++){ //row
        //     for(int j =1; j<=i; j++){    //clumn
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        char ch ='A';
        for(int i =1; i<=4; i++){ //row
            for(int j =1; j<=i; j++){    //clumn
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
