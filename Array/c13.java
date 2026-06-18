package Array;
public class c13 {
    public static int trappedrainwatter(int height[]) {
        // calculate left max boundary =array
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // calculate right max boundary =array
        int rightmax[] = new int[height.length];
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        int trapped = 0;
        // loop
        for (int i = 0; i < height.length; i++) {
            // waterlvel min(left max, right max)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // trappped water =(waterlevel-height)*width
            trapped += waterlevel - height[i];
        }
        return trapped;
    }

    public static int buysell(int price[]) {
        int bp = Integer.MAX_VALUE;
        int mp = 0;
        for (int i = 0; i < price.length; i++) {
            if (bp < price[i]) {
                int profit = price[i] - bp;
                mp = Math.max(mp, profit);
            } else {
                bp = price[i];
            }
        }
        return mp;
    }

    public static void main(String[] args) {
        // int height[]={4,2,0,6,3,2,5};
        // System.out.println(trappedrainwatter(height));
        int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buysell(price));
    }
}