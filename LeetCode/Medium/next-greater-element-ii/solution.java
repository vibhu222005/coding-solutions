import java.util.*;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int arr[] = new int[nums.length];
        Arrays.fill(arr, -1);
        for(int i = 2 * nums.length - 1; i >= 0; i--)
        {
            int j = i % nums.length;
            while(!st.isEmpty() && st.peek() <= nums[j])
            {
                st.pop();
            }
            if(i < nums.length){
                if(!st.isEmpty())
                arr[j] = st.peek();
            }
           st.push(nums[j]); 
        }
        return arr;
    }
}