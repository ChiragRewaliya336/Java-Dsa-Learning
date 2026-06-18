public class CountingSort {
    public static void countingsort(int num[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            largest = Math.max(largest, num[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < num.length; i++) {
            count[num[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                num[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printnums(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = { 5, 4, 2, 3, 1 };
        countingsort(nums);
        printnums(nums);
    }
}
