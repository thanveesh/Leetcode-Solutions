class Solution {
    public int diagonalSum(int[][] mat) {
        int s=0;
        for(int i=0;i<mat.length;i++){
            s+=mat[i][i];
            s+=mat[i][mat.length-i-1];
        }
        if(mat.length%2!=0){
            s-=mat[mat.length/2][mat.length/2];
        }
        return s;
    }
}