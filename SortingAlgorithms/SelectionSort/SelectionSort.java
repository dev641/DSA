package SortingAlgorithms.SelectionSort;

public class SelectionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i=0;i<n;i++) {
            int k;
            for (int j = k = i; j<n;j++) {
                if (arr[j]<arr[k]) {
                    k = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[k];
            arr[k] = temp;
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
