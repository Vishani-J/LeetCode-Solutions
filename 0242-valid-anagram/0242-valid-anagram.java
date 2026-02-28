class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        int[] arr=new int[26];
        for(int j=0;j<s.length();j++){
            arr[s.charAt(j)-'a']++;
            arr[t.charAt(j)-'a']--;
        }
        for(int x:arr){
            if(x!=0)
            return false;
        }
        return true;
    }
}