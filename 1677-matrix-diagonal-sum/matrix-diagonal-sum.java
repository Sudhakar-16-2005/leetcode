class Solution {
    public int diagonalSum(int[][] mat) {
           int n = mat.length;
        int pD = 0;
        int sD = 0;
        for(int i =0;i<n;i++){
            pD += mat[i][i];
            sD += mat[i][n-1-i];
        }
        if(n % 2 == 1){
            sD -= mat[n/2][n/2];
        }
        return pD+sD;
    }
}