package Array;
public class c12 {
    public static void subarr(int nums[]) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int sum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(nums[k] + " ");
                    sum = sum + nums[k];
                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
                if (sum < minSum) {
                    minSum = sum;
                }
                System.out.print("--> Sum=  " + sum);
                ts++;
                System.out.println();
            }

            System.out.println();
        }
        System.out.println("Total subarrays: " + ts);
        System.out.println("Maximum Sum = " + maxSum);
        System.out.println("Minimum Sum = " + minSum);

    }

    public static void maxarr(int nums[]) {
        // Brute force:
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                currsum = 0;
                int end = j;
                for (int k = start; k <= end; k++) {
                    currsum = currsum + nums[k];
                }
                if (currsum > maxSum) {
                    maxSum = currsum;
                }
                System.out.print(currsum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("MAximum sum of sub arrays: " + maxSum);
    }

    public static void premaxarr(int nums[]) {
        // Prefix sum:
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int start = i;
            for (int j = i; j < nums.length; j++) {
                int end = j;
                currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if (currsum > maxSum) {
                    maxSum = currsum;
                }
            }
        }
        System.out.println("Maximum sum of sub arrays: " + maxSum);
    }

    public static void kenmaxarr(int nums[]) {
        // Prefix sum:
        int currsum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            currsum = currsum +nums[i];
            if (currsum<0) {
                currsum=0;
            }
            maxSum= Math.max(currsum, maxSum);
        }
        System.out.println("Our maximum subarrays sum =" +maxSum);
    }

    public static void main(String[] args) {
        // int nums[] = { 1, 2, 4, 6, 8 };
        // subarr(nums);
        // maxarr(nums);
        int nums[]={-2,-3,4,-1,5,-3};
        premaxarr(nums);
        // kenmaxarr(nums);
    }
}
