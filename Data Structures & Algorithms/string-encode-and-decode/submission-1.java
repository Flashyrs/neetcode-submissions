class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs)
            sb.append(s.length()).append('#').append(s);

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
           
            int sizeOfString = str.indexOf('#', i);//actual length, so # just tells if its single or more than 1 digit length of word
            int length = Integer.parseInt(str.substring(i, sizeOfString));
            int end = sizeOfString + 1 + length;// the length of our required string, where it ends
            // so we just add the size + 1 + the index of #, it gives where current string end
            result.add(str.substring(sizeOfString + 1, end));// after # to where our string end, we get a substring

            i = end;
        }
        
        return result;
    }
}
