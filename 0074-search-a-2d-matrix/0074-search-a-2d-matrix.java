class Solution {
    public static boolean binarySearch(int row,int r,int target,int[][] matrix){
        int l=0;
        while(l<=r){
            int mi=(l+r)/2;
            if(matrix[row][mi]==target)
            return true;
            else if(matrix[row][mi]<target)
            l=mi+1;
            else
            r=mi-1;
        }
        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
    
        int n=matrix[0].length;
           for(int i=0;i<m;i++){
            if(matrix[i][n-1]>=target)
           return binarySearch(i,n-1,target,matrix);         
           }
        return false;
    }
}