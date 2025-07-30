class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0; //return 0 if array is of 0 length

        int current = 0; //two pointers
        for(int next = 1; next<nums.length; next++)
        {
            if(nums[next] != nums[current])
            {
                current++;
                nums[current] = nums[next];
            }
        }
        return current+1;
    }
}