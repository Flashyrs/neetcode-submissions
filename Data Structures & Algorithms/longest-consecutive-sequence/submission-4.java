class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int ans = 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums)
            set.add(num);
        for(int num : nums){
            if(!set.contains(num - 1)){
                int count = 1;  
                int currentNum = num;
                while (set.contains(currentNum + 1)) {
                    currentNum++; 
                    count++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
