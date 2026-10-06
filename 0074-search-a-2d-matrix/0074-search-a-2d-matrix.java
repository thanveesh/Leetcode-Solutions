class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=matrix.length;
        int j=matrix[0].length;
        int l=0;
        int r=i*j-1;
        while(l<=r){
            int mid=(l+r)/2;
            int midi=mid/j;
            int midj=mid%j;
            if(matrix[midi][midj]==target){
                return true;
            }
            else if(matrix[midi][midj]<target){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return false;
    }
}