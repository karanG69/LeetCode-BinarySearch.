class Solution {
public:
    int search(vector<int>& nums, int target) {
        int s=0;
        int e=nums.size();
        if (e==1){
            if (nums[s]==target){
                return s;
            }
            else{
                return -1;
            }
        }
        while (s<=e){
            int middle=(s+e)/2;
            if (nums[middle]==target){
                return middle;
            }
            else if (nums[middle]>target){
                e=middle-1;
            }
            else{
                s=middle+1;
            }
        }
        return -1;

    }
};
