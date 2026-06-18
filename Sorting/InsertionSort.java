public class InsertionSort {
    public static void insertionSort(int num[]){
        for(int i=0; i<num.length; i++){
            int curr =num[i];
            int prev =i-1;
            // Findig position
            while (prev>=0&&num[prev]>curr) {
                num[prev+1] = num[prev];
                prev --;
            }
            // Insertion
            num[prev+1] =curr;
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
        insertionSort(nums);
        printnums(nums);
    }
}
