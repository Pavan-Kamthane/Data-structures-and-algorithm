
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/

/**
 * Meaning of question:- User/question given you target and array, you have to return  two indicies
 * of that array whose addition is target, here you dont have to return -1.
 * 
 * Brut Force approch:- 
 * 
 * put i pointer on 0th index and search element whose addition gives target in remaining array simple,
 * if 0th index is not gives than go for next
 * 
 * for this you need ywo for loop, first for pointer, second for searching.
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        
        
        //First apporoach
        for(int i=0;i<nums.length;i++){
            //Now you to check that is every element after ith element if both of them added it gives target or not
            for(int j =i+1;j<nums.length;j++){
                
                if(nums[i]+nums[j]==target){
                    return new int[] {i+1,j+1};
                }
            }
        }
        
        return nums;
    }
}