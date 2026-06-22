class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for(int i = 0; i < strs.length; i++){
            if (visited[i]) continue;
            List<String> temp = new ArrayList<>();
            String word = strs[i];
            temp.add(word);
            visited[i] = true;
            for(int j = i + 1; j < strs.length; j++){
                if(!visited[j] && isAnagram(strs[i], strs[j])){
                    temp.add(strs[j]);
                    visited[j] = true;
                }
            }
            ans.add(temp);
        }
        return ans;
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) 
            return false;
        
        int [] freq = new int[26];
        for(char c : s.toCharArray())
            freq[c - 'a']++;
        for(char c : t.toCharArray())
            freq[c - 'a']--;
        
        for(int i = 0; i < 26; i++){
            if(freq[i] != 0)
                return false;
        }
        return true;
    }
}
