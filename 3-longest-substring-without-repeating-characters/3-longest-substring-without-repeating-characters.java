class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String tmp = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(tmp.contains(ch+"")){
                max = Math.max(max,tmp.length());
                int idx = tmp.indexOf(ch);
                // System.out.println(idx);
                // System.out.println("------before-----");
                // System.out.println(tmp);
                tmp = tmp.substring(idx+1) + ch;
                // System.out.println("------after-----");
                // System.out.println(tmp);
            }else{
               tmp += ch; 
            }
        }
        // System.out.println(tmp);
        max = Math.max(max,tmp.length());
        
        return max;
    }
}