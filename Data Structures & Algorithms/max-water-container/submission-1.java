class Solution {
    public int maxArea(int[] heights) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = heights.length - 1;
        while(left < right){
            int high = Math.min(heights[left], heights[right]);
            int breadth = right - left;
            max = Math.max(max, high * breadth);
            if(heights[left] < heights[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
