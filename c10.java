import java.util.*;
public class c10 {
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]= marks[i]+1;
            System.out.print(marks[i] +" ");
        }
    }
    public static int linearsearch(int numbers[], int key){
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                return i;
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        int marks[] = {98,95,87};
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("Phy: "+marks[0]);
        // System.out.println("Math: "+marks[1]);
        // System.out.println("Eng: "+marks[2]);
        // marks[2] =100;
        // System.out.println("Update eng mark");
        // System.out.println("Eng: "+marks[2]);
        // int avg =(marks[0] + marks[1] +marks[2])/3;
        // System.out.println("Average of marks "+avg +"%");
        // System.out.println("Length of array ="+ marks.length);
        // sc.close();
        update(marks);
        System.out.println();
        int numbers [] ={1,23,45,10,85,95,10,87,62};
        int key =5;
        int index = linearsearch(numbers, key);
        if (index==-1) {
            System.out.println("Number is not found");
        }
        else{
            System.out.println("Key is at index: "+index);
        }


    }
}
