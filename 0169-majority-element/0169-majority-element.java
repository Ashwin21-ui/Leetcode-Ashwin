class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, count = 0;
        
        // Find the candidate for majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }
}
