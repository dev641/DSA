package Recursion.ReverseArray;

public class ReverseArray {
    private static void reverseArr(int[] arr, int l, int r){
        if (l>=r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
        reverseArr(arr, l+1, r-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        reverseArr(arr, 0, arr.length -1);
        for(int el: arr){
            System.out.print(el + " ");
        }

    }
}
