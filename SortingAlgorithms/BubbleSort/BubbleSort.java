package SortingAlgorithms.BubbleSort;

public class BubbleSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for(int i =0;i<n;i++){
            for(int j=0;j<n-i-1; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void sort(int[] arr, int n) {
        if (n == 0) return;
        for (int i = 0;i<n;i++) {
            if (arr[i]> arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        sort(arr, n-1);
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,4,6,5,3,2};
        sort(arr, arr.length-1);
        for(int el: arr) {
            System.out.print(el + " ");
        }
    }
}
