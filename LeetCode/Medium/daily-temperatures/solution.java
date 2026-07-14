class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int[ ] nums=new int[temperatures.length];
        Arrays.fill(nums,0);
        for(int i=0;i<temperatures.length;i++)
        {
            int val=temperatures[i];
            while(!st.isEmpty()&&temperatures[st.peek()]<val)
            {
                int idx = st.pop();
                nums[idx] = i - idx;
            }
            st.push(i);
        } 
        return nums;
    }
}