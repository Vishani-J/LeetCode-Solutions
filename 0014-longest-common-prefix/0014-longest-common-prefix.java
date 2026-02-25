class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0){
            return "";
        }
        String fi=strs[0];
        String res="";
        for(int i=0;i<fi.length();i++){
            char x=fi.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length()||strs[j].charAt(i)!=x)
                return res;
            }
            res+=x;
        }
        return res;
    }
}

 