import java.util.*;
public class InbuiltSort {
     public static void printnums(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
     public static void printnum(Integer nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // int nums[] ={1,5,4,9,8,10};
        // Arrays.sort(nums);
        // Arrays.sort(nums,0,3);
        // printnums(num);
        Integer num[] ={1,5,4,9,8,10};
        // Arrays.sort(num,Collections.reverseOrder());
        Arrays.sort(num,0,3,Collections.reverseOrder());
        printnum(num);
    }
}
