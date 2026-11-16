class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        int ans=-1;
        for(int val:nums){
            low=Math.max(low,val);
            high+=val;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(nums,k,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    public boolean isPossible(int[] nums, int k, int mid){
        int count = 1;
        int sum=0;
        for(int val:nums){
            if(sum+val>mid){
                count++;
                sum=val;
            }else{
                sum+=val;
            }
        }
        return count<=k;
    }
}