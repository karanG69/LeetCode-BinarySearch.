class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        ArrayList<Integer> ans= new ArrayList<>();
        while (s<=e){
            int mid=(s+e)/2;
            if(nums[mid]==target){
                int f=mid;
                int en=mid;
                while(f>=0 && nums[f]==target){
                    f-=1;
                }
                ans.add(f+1);
                while(en<nums.length && nums[en]==target){
                    en+=1;
                }
                ans.add(en-1);
                break;
            }
            else if (nums[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        if(ans.size()==0){
            ans.add(-1);
            ans.add(-1);
        }
        int[] array = ans.stream().mapToInt(Integer::intValue).toArray();
        return array;
    }
}
