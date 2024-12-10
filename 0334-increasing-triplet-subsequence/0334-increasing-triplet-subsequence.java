class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;
        for(int n=0;n<nums.length;n++){
            if(nums[n]<=min1){
                min1=nums[n];
            }
            else if(nums[n]<=min2){
                min2=nums[n];
            }
            else{
                return true;
            }
        }
        return false;
    }
}