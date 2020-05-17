class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)return true;
        int position=nums.length-1;
        boolean flag=false;
        while(position>0){
            for(int i=0;i<position;i++){
                if(nums[i]+i>=position){
                    flag=true;
                    position=i;
                }
                else{
                    flag=false;
                    if(i==position-1){
                        return flag;
                    }
                }
            }
        }
        return flag;
        
    }
}