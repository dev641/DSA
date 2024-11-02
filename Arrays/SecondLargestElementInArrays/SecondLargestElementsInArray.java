package Arrays.SecondLargestElementInArrays;

import java.util.*;

public class SecondLargestElementsInArray {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int secLargestEl = -1, largestEl = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>largestEl) {
                secLargestEl = largestEl;
                largestEl = arr[i];
            }
            else if (arr[i] < largestEl && arr[i] > secLargestEl) {
                secLargestEl = arr[i];
            }
        }
        return secLargestEl;
    }
}