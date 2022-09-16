class Solution {
    public int fib(int n) {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        int dp[]= new int[n+1];
        Arrays.fill(dp,-1);
        fibo(n,dp);
        return dp[n];
    }
    static int fibo(int n , int a[]){
        if(n<=1)
            return n;
        if(a[n]!=-1)return a[n];
        return a[n]=fibo(n-1,a)+ fibo(n-2,a);
    }
}