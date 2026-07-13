class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]+nums[j-i]==target){
                    result[0]=j-i;
                    result[1]=j;
                    return result;
                }
            }

        }
        return result;
        // HashMap<Integer ,Integer >map=new HashMap<>();
        // for(int i=0;i<nums.length;i++ )
        // {
        //     int need=target-nums[i];
        //     if(map.ContainsKey(need))
        //     {
        //         return new int []{map.get(need),i};
        //     }
        //     map.put(nums[i],i);
        // }
        // return new int []{-1,-1};
    }
}
