

class Solution {
    public boolean hasDuplicate(int[] nums) {

        Arrays.sort(nums);

        int a = 0;
        int b = 1;

        while (b < nums.length) {

            if (nums[a] == nums[b]) {
                return true;
            }

            a++;
            b++;
        }

        return false;
    }
}