class Solution {
        List<List<Integer>> mainList = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        combinationSumHelper(candidates,0,target,new ArrayList<>());
      return mainList;
    }
    public void combinationSumHelper(int[] candidates,int idx,int target,List<Integer> subList)
    {
        
        if(idx >= candidates.length || target < 0)
            return ;
        if(target == 0 )
        {
            mainList.add(new ArrayList<>(subList));
            return;
        }
        subList.add(candidates[idx]);
        combinationSumHelper(candidates,idx,target-candidates[idx],subList);
        subList.remove(subList.size()-1);
        combinationSumHelper(candidates,idx+1,target,subList);
            
    }
}