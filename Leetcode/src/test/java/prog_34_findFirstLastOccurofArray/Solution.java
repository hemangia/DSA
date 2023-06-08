package prog_34_findFirstLastOccurofArray;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstIndexBinary(0, nums.length-1, nums, target);
        int second = -1 ;
        if(first != -1){
            second = LastIndexBinary(first, nums.length-1, nums, target);
        }
        return new int[] {first, second} ;
    }
    public int firstIndexBinary(int low, int high, int[] nums, int target){
        while(low<=high){
            int mid = low + (high - low) / 2 ;
            if(nums[mid] == target){
                if(mid == 0 || nums[mid - 1] != nums[mid]) {
                    return mid ;
                }
                else{
                    high = mid -1 ;
                }
            }
            else {
                if(nums[mid] > target){
                    high = mid - 1;
                }
                else if(nums[mid] < target){
                    low = mid + 1 ;
                }

            }
        }
        return -1 ;
    }

    public int LastIndexBinary(int low, int high, int[] nums, int target){
        while(low<=high){
            int mid = low + (high - low) / 2 ;
            if(nums[mid] == target){
                if(mid == nums.length - 1 || nums[mid + 1] != nums[mid]) {
                    return mid ;
                }
                else{
                    low = mid  + 1 ;
                }
            }
            else {
                if(nums[mid] > target){
                    high = mid - 1;
                }
                else if(nums[mid] < target){
                    low = mid + 1 ;
                }

            }
        }
        return -1 ;
    }
}

