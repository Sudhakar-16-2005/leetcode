class Solution {
    public int tribonacci(int n) {
        if(n == 0)return 0;
        if(n == 1 || n==2 )return 1;
        int t1=0;int t2=1;int t3=1;int curr=0; 
        for(int i=3;i<=n;i++){
            curr=t1+t2+t3;
            t1=t2;
            t2=t3;
            t3=curr;
        }
        return curr;
    }
}