// 575. Distribute Candies

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> uniqueTypes = new HashSet<>();
        int maxCandies = candyType.length / 2;

        for (int type : candyType) uniqueTypes.add(type);
        return Math.min(uniqueTypes.size(), maxCandies);
    }
}
