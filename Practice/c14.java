package Practice;
import java.util.Arrays;

public class c14 {
    public int searchInsert(int[] nums, int key) {
        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while (start <= end) {
            mid = (start + end) / 2;

            if (nums[mid] == key) {
                return mid;
            } else if (nums[mid] > key) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = Integer.MIN_VALUE;
        while (start <= end) {
            mid = (start + end) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int square(int nums[]) {
        int n = nums.length;
        int num[] = new int[n];
        int square = 0;
        for (int i = 0; i < n; i++) {
            square = nums[i] * nums[i];
            num[i] = square;
        }
        Arrays.sort(num);
        return num ;
    }

    public static void main(String[] args) {
        // System.out.println("Practice Day Jai Bajrang Bali :)");

    }
}
