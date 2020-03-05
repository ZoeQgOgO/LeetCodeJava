class Solution{
    public String longestCommonPrefix(String[] strs){
        if(strs.length == 0 || strs == null){
            return "";
        }
        String res = new String();
        for(int i =0; i < strs[0].length();++i){
            char c = strs[0].charAt(i);
            for(String s : strs)
            if(s.length() <=i || s.charAt(i) !=c) return res;
            res +=c;
        }
        return res;
    }
}

class Solution1{
    public String LongestCommonPrefix(String[] strs){
        String prefix = strs[0];
        for(int i =1; i < strs.length;i++){
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}