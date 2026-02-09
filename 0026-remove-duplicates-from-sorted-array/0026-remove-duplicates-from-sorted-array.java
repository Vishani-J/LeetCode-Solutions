class Solution {
    public int removeDuplicates(int[] nums) {
       TreeSet<Integer> set=new TreeSet<>();
       for(int x:nums)
       set.add(x);

       int i=0;
       for(int x:set){
        nums[i]=x;
        i++;
       }
       
       return set.size();
    }
}