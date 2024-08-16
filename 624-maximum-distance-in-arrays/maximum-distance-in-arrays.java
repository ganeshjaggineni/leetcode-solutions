import java.util.List;

class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        
        int maxDist = 0;
        int minEle = arrays.get(0).get(0);
        int maxEle = arrays.get(0).get(arrays.get(0).size() - 1);

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> list = arrays.get(i);
            int currMin = list.get(0);
            int currMax = list.get(list.size() - 1);
            
            // Calculate the possible maximum distance
            maxDist = Math.max(maxDist, Math.abs(maxEle - currMin));
            maxDist = Math.max(maxDist, Math.abs(currMax - minEle));
            
            // Update global min and max values
            minEle = Math.min(minEle, currMin);
            maxEle = Math.max(maxEle, currMax);
        }

        return maxDist;
    }
}
