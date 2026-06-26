class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            int len = s.length();
            String lengthHeader = String.format("%04d", len); 
            sb.append(lengthHeader);
            sb.append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            String lengthHeader = str.substring(i, i + 4);
            int len = Integer.parseInt(lengthHeader);
            i += 4; 
            String s = str.substring(i, i + len);
            ans.add(s);
            
            i += len;
        }
        return ans;
    }
}
