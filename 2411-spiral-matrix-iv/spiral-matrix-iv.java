/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int[][] spiralMat = new int[m][n];
        boolean[][] visited = new boolean[m][n];
        for(int[] row : spiralMat)
        {
             Arrays.fill(row,-1);
        }
        int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
        int currDir = 0;
        int currX = 0;
        int currY = -1;
        ListNode curr = head;
        while(curr != null)
        {
            int nextX = currX + dir[currDir][0];
            int nextY = currY + dir[currDir][1];
            if(validCell(nextX,nextY,m,n) && !visited[nextX][nextY])
            {
                currX = nextX;
                currY = nextY;
            }
            else
            {
                currDir = (currDir+1)%4;
                continue;
            }
            spiralMat[currX][currY] = curr.val;
            visited[currX][currY] = true;

            curr = curr.next;
        }
        return spiralMat;
    }
    public boolean validCell(int row,int col,int rowSize,int colSize)
    {
        return (row>=0 && row < rowSize && col >= 0 && col < colSize); 
    }
}