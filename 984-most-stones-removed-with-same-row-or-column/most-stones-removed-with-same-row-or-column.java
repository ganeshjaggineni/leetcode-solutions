class Solution {
    public int removeStones(int[][] stones) {
       int n = stones.length;
       List<List<Integer>> adjList = new ArrayList<>();
       for(int i=0;i<n;i++)
       {
        adjList.add(new ArrayList<>());
       }
       for(int i=0;i<n;i++)
       {
        for(int j=i+1;j<n;j++)
        {
            if(stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1])
            {
                adjList.get(i).add(j);
                adjList.get(j).add(i);
            }
        }
       }
           int components = 0;
           boolean[] visited = new boolean[n];
           for(int i=0;i<n;i++)
           {
            if(!visited[i])
            {
                dfs(adjList,visited,i);
                components++;
            }
           }
           return n-components;
}
    public void dfs(List<List<Integer>> adjList,boolean[] visited,int idx)
    {
        visited[idx] = true;
        for(int nei : adjList.get(idx))
        {
            if(!visited[nei])
            {
                dfs(adjList,visited,nei);
            }
        }
    }
}