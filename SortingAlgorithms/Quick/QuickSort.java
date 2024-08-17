package SortingAlgorithms.Quick;

public class QuickSort {
    public static int partition(int[] arr, int l, int r) {
        int pivot = r, i=l,j=r;
        while(i<j) {
            while(i <=r-1 && arr[i]<=arr[pivot]){
                i++;
            }
            while(j>= l+1 && arr[j]>arr[pivot]){
                j--;
            }
            if (i<j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[r];
        arr[r] = arr[pivot];
        arr[pivot] = temp;
        return j;
    }
    public static void sort(int[] arr, int l, int r) {
        if(l>r) return;
        int j = partition(arr, l, r);
        sort(arr, j+1, r);
        sort(arr, l, j-1);
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,4,6,5,3,2};
        sort(arr,0, arr.length-1);
        for(int el: arr) {
            System.out.print(el + " ");
        }
    }
}
