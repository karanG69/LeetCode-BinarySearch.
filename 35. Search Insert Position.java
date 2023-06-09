class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums[0]>=target){
            return 0;
        }
        else if(nums[nums.length-1]<target){
            return nums.length;
        }
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                if(nums[mid-1]<target){
                    return mid;
                }
                else{
                    e=mid-1;
                }
            }
            else{
                if(nums[mid+1]>target){
                    return mid+1;
                }
                else{
                    s=mid+1;
                }
            } 
        }
        return -1;
    }
}
