package src.solution;// 2144. Minimum Cost of Buying Candies With Discount

import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscount {
    public int minimumCost(int[] cost) {
        int sum=0;
        int len=cost.length;
        Arrays.sort(cost);

        int val = 1;
        for (int i=len-1; i>=0; i--) {
            if (val%3==0) val=1;
            else {
                sum+=cost[i];
                val++;
            }
        }
        return sum;
    }
}
