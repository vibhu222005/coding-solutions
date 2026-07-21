class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lt=new ArrayList<>();
        int n=nums.length;
        int i=0;
        while(i<n)
        {
            int index=nums[i]-1;
            if(nums[i]!=nums[index]&&nums[i]!=i+1)
            {
                int temp=nums[i];
                nums[i]=nums[index];
                nums[index]=temp;
            }
            else
            {
                i++;
            }
        }
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=j+1)
            {
                lt.add(j+1);
            }
        }
        return lt;
    }
}