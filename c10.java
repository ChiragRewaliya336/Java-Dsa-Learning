// import java.util.*;

public class c10 {
    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
            System.out.print(marks[i] + " ");
        }
    }

    public static int linearsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int getlargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }
        System.out.println("Smallest number is = " + smallest);
        return largest;
    }

    public static int binarysearch(int bins[], int key){
        int start =0, end=bins.length-1;
        while(start<=end){
            int mid = (start+end) /2;
            if (bins[mid]==key) {
                return mid;
            }
            if (bins[mid]<key) {
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return-1;
    }

    public static void reverse(int revs[]){
        int first =0, last=revs.length-1;
        while (first<last) {
            int temp = revs[last];
            revs[last] = revs[first];
            revs[first]= temp;
            first++;
            last--;
        }
    }

    public static void pairs(int pair[]){
        int tp =0;
        for(int i =0;  i<pair.length-1;i++){
            int curr = pair[i];
            for(int j=i+1; j<pair.length;j++){
                System.out.print("(" + curr +"," + pair[j] +")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);
    }
    public static void main(String[] args) {
        // int marks[] = {98,95,87};
        // // Scanner sc = new Scanner(System.in);
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
        // update(marks);
        // System.out.println();
        // int numbers [] ={1,23,45,10,85,95,10,87,62};
        // int key =5;
        // int index = linearsearch(numbers, key);
        // if (index==-1) {
        // System.out.println("Number is not found");
        // }
        // else{
        // System.out.println("Key is at index: "+index);
        // }

        // Largest numbers:
        // int num[] = { 1, 8, 7, 6, 9, 2, 10 };
        // System.out.println("Largest number of array is = " + getlargest(num));

        // int bins[] = { 1, 2, 4, 8, 10, 12, 18 };
        // int key = 10;
        // System.out.println("Index for key is: " +binarysearch(bins, key));

        // int revs[] ={1,2,3,5,6,8,9};
        // reverse(revs);
        // for(int i=0; i<revs.length; i++){
        //     System.out.print(revs[i]+" ");
        // }

        int pair[] ={1,2,3,5,6,8,9};
        pairs(pair);
    }
}
