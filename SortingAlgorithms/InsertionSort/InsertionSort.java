package SortingAlgorithms.InsertionSort;

public class InsertionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i=0;i<n;i++) {
            int j= i;
            while (j > 0 && arr[j-1] >= arr[j]) {
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,4,6,5,3,2};
        sort(arr);
        for(int el: arr) {
            System.out.print(el + " ");
        }
    }
}