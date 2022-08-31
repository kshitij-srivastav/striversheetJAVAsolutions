class Solution {
    int dp[][];
    int recur(int row, int col,int m,int n)
    {
        // out of the matrix, we simply return 0
        if(row == m || col == n)
        {
            return 0;
        }
        
        // we found out 1 way
        if(row == (m-1) && col == (n-1))
        {
            return 1;
        }
        
        // if answer for some row & col (it is calculated then return that answer)
        if(dp[row][col]!=-1)
        {
            return dp[row][col];
        }
        
        // 
        int firstOption = recur(row+1,col,m,n);
        int secondOption = recur(row,col+1,m,n);
        
        int currentWays = firstOption+secondOption;
        dp[row][col] = currentWays;
        return currentWays;
    }
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                dp[i][j] = -1;
            }
        }
        
        return recur(0,0,m,n);
    }
}