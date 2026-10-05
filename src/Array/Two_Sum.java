//https://leetcode.com/problems/two-sum/submissions/1597322516/


package Array;

import java.util.HashMap;

public class Two_Sum {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        //HashSet<Integer>hs=new HashSet<>();
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){

            int sub=target-nums[i];
            if(hm.containsKey(sub)){
                int arr[]={hm.get(sub),i};
                return arr;
            }
            hm.put(nums[i],i);
        }
        return null;
    }
}
