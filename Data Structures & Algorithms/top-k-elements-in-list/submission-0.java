class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer> sort = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            sort.add(entry.getKey());
        }
        Collections.sort(sort, (a,b) -> map.get(b) - map.get(a));
        int [] ans = new int[k];
        for(int i = 0 ; i < k; i++)
            ans[i] = sort.get(i);
        return ans;
    }
}
