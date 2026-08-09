class Solution {
    public int characterReplacement(String s, int k) {
        int low=0;
        int maxCount =0;
        int res=0;

        int []freq = new int [26];
        for(int high=0;high<s.length();high++){
            char c= s.charAt(high);
            freq[c-'A']++;
         maxCount = Math.max(maxCount , freq[c-'A']);
        
        while((high-low+1)-maxCount>k){
            freq[s.charAt(low)-'A']--;
            low++;
        } res=Math.max(res, (high-low+1));
    } return res;}
}
