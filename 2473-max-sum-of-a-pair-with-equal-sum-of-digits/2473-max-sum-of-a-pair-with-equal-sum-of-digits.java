class Solution {
    public int maximumSum(int[] nums) {
        int ans=-1;
        int[] max=new int[82];
        for(int x:nums){
            int sum=0;int temp=x;
            while(temp!=0){
                sum+=temp%10;
                temp=temp/10;
            }
            if(max[sum]!=0){
                ans=Math.max(ans,x+max[sum]);
            }
            max[sum]=Math.max(x,max[sum]);
        }
        return ans;
        
    }
}