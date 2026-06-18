public class BubbleSort {
    public static void bubblesort(int nums[]) {
        for (int trn = 0; trn < nums.length; trn++) {
            boolean swapped = false;
            for (int j = 0; j < nums.length - 1 - trn; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
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
        bubblesort(nums);
        printnums(nums);
    }
}
