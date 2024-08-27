class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        
        //creating an adjacency list
        Map<Integer,List<Pair<Integer,Double>>> graph = new HashMap<>();
        for(int i=0;i<edges.length;i++)
        {
            int u = edges[i][0];
            int v = edges[i][1];
            double prob = succProb[i]; 
            graph.computeIfAbsent(u,k ->new ArrayList<>()).add(new Pair<>(v,prob));
            graph.computeIfAbsent(v,k ->new ArrayList<>()).add(new Pair<>(u,prob));
        }
        //create resultant probabilites
        double[] res = new double[n];
        res[start_node] = 1.0;

        //initialize a priority queue
        PriorityQueue<Pair<Double,Integer>> pq = new PriorityQueue<>((a,b)->-Double.compare(a.getKey(),b.getKey()));
        pq.add(new Pair<>(1.0,start_node));
        while(!pq.isEmpty())
        {
            Pair<Double,Integer> curr = pq.poll();
            double curProb = curr.getKey();
            int curNode = curr.getValue();
            if(curNode == end_node)
                return curProb;
                    for (Pair<Integer, Double> nxt : graph.getOrDefault(curNode, new ArrayList<>())) {
                int nxtNode = nxt.getKey();
                double pathProb = nxt.getValue();
                if (curProb * pathProb > res[nxtNode]) {
                    res[nxtNode] = curProb * pathProb;
                    pq.add(new Pair<>(res[nxtNode], nxtNode));
                }
            }
        }
        return 0.0;
     }
    
}