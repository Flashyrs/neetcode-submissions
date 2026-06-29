class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0 ;i < n - 2 ; i ++){
            if(i > 0 && nums[i] == nums[i - 1])
                continue;
            int first = i + 1;
            int last = n - 1;
            while( first < last){
                int sum = nums[i] + nums[first] + nums[last];
                if(sum < 0)
                    first++;
                else if(sum > 0)
                    last--;
                else{
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[first]);
                    temp.add(nums[last]);
                    ans.add(temp);
                    first++;
                    last--;
                    while(first < last && nums[first] == nums[first - 1])   first++;
                    while(first < last && nums[last] == nums[last + 1])     last--;
                }
            }
        }
        return ans;
    }
}