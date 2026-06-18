public class SelectionSort {
    public static void selectionsort(int num[]){
        for(int i =0; i<num.length-1;i++){
            int minPos =i;
            for(int j=i+1; j<num.length ;j++){
                if (num[minPos]>num[j]) {
                    minPos=j;
                }
            }
            int temp = num[minPos];
            num[minPos]= num[i];
            num[i]=temp;
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
         selectionsort(nums);
         printnums(nums);
    }
}
