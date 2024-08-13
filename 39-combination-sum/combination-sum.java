class Solution {
        List<List<Integer>> mainList = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        combinationSumHelper(candidates,0,0,target,new ArrayList<>());
        return mainList;
    }
    public void combinationSumHelper(int[] candidates,int idx,int sum,int target,List<Integer> subList)
    {
        // List<Integer> subList = new ArrayList<>();
        if(sum > target || idx >= candidates.length)
            return ;
        if(sum == target)
        {
           mainList.add(new ArrayList<>(subList)); // Add a copy of subList
            return;
        }
        subList.add(candidates[idx]);
        combinationSumHelper(candidates,idx,sum+candidates[idx],target,subList);
        subList.remove(subList.size()-1);
        combinationSumHelper(candidates,idx+1,sum,target,subList);

    }
}