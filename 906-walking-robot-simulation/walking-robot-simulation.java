class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        
        int x = 0;
        int y = 0;
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        Set<String> obstacleSet = new HashSet<>();
        int ans = 0;
        int curr = 0;
        for(int[] obstacle : obstacles )
        {
            obstacleSet.add(obstacle[0]+"_"+obstacle[1]);
        }
        for(int command : commands)
        {
            if(command == -1)
            {
               curr = (curr + 1)%4; 
               System.out.println("in comm 1 = "+curr);
               continue;
            }
            else if(command == -2)
            {
                curr = (curr + 3)%4;
                System.out.println("in comm 2 = "+curr);

                continue;
            }
            for(int j=0;j<command;j++)
            {
                int nextX = x+ dir[curr][0];
                int nextY = y+dir[curr][1];
                String obStr = nextX+"_"+nextY;
                System.out.println(obStr);
                if(obstacleSet.contains(obStr))
                    break;
                 x = nextX;
                 y = nextY;
            }
           
            ans = Math.max(ans,x*x+y*y);
        }
        return ans;
    }
}