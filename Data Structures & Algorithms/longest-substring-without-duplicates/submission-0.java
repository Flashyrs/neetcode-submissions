class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] hash = new int[256];
        Arrays.fill(hash,-1);
        int left = 0, right = 0;
        int n = s.length();
        int maxLen = 0;
        while(right < n){
            char c = s.charAt(right);
            if(hash[c] != -1){
                if(hash[c] >= left)
                    left = hash[c] + 1;
            }
            int len = right - left + 1;
            maxLen = Math.max(len,maxLen);
            hash[c] = right;
            right++;
        }
        return maxLen;
    }
}
