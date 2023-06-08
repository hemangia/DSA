package prog_704_binarySearch;

public class Solution {
    public int search(int[] nums, int target) {
        return binary(nums, target, 0, nums.length);
    }
    int binary(int[] nums, int target, int start, int end){
        int mid = start + (end - start) / 2 ;
        if(start>end){
            return -1 ;
        }
        if(target == nums[mid]){
            return mid ;
        }
        if(target > nums[mid]){
            return binary(nums, target, mid+1 , end);
        }
        if(target< nums[mid]){
            return binary(nums, target, start, mid-1);
        }
        return -1;
    }
}
