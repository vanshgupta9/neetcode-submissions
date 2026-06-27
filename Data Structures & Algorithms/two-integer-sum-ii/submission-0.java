class Solution {
    public int[] twoSum(int[] number, int target) {
        int i = 0;
        int j = number.length-1;
         while(i<=j){
            if(number[i] + number[j] < target){
                i++;
            }
            else if(number[i] + number[j] > target){
                j--;
            }
            else{
                return new int[]{i+1 , j+1};
            }
         }
         return null;
        
    }
}
