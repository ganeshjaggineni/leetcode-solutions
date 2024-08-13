class Solution {
        List<List<Integer>> mainList = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        combinationSumHelper(candidates,0,target,new ArrayList<>());
      return mainList;
    }
    public void combinationSumHelper(int[] candidates,int idx,int target,List<Integer> subList)
    {
        
        if(target == 0 )
        {
            mainList.add(new ArrayList<>(subList));
            return;
        }
        if(idx >= candidates.length || target < 0)
            return ;
        for (int i = idx; i < candidates.length; i++) {
            if (i > idx && candidates[i] == candidates[i - 1]) {
                continue; // Skip duplicates
            }
            subList.add(candidates[i]);
        combinationSumHelper(candidates,i+1,target-candidates[i],subList);
        subList.remove(subList.size()-1);
            
    }
    }
}