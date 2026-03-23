class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                if(r-left+1<minlen)
                minlen=r-left+1;
                sum-=nums[left];
                left++;
            }
        }
        return minlen!=Integer.MAX_VALUE?minlen:0;
    }
}