package Arrays.CheckIfArraysIsSortedAndRotated;

import java.util.Arrays;
import java.util.Scanner;

public class CheckIfArraysIsSortedAndRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution solution = new Solution();
            boolean isArraySortedAndRotated = solution.check(arr);
            System.out.println(isArraySortedAndRotated);

            System.out.println("~");
        }
    }
}

class Solution {
    public boolean check(int[] nums) {
        int largestIndex = 0;
        for (int i =1;i<nums.length;i++) {
            if (nums[i] >= nums[largestIndex]) {
                largestIndex = i;
            } else {
                break;
            }
        }
        for (int i=largestIndex +1; i< nums.length; i++) {
            if ((i < nums.length-1 && nums[i] > nums[i+1]) || nums[i] > nums[0]) {
                return false;
            }
        }
        return true;
    }
}