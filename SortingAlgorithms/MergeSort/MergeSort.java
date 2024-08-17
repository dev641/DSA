package SortingAlgorithms.MergeSort;

import java.util.ArrayList;

public class MergeSort {
    public static void merge(int[] arr, int l, int mid, int r) {
        int i =l, j = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(i<=mid && j<=r) {
            if(arr[i]>= arr[j]) {
                temp.add(arr[j++]);
            } else {
                temp.add(arr[i++]);
            }
        }
        while (i<= mid) {
            temp.add(arr[i++]);
        }

        while (j<=r) {
            temp.add(arr[j++]);
        }

        for(int k=l;k<=r;k++) {
            arr[k] = temp.get(k-l);
        }
    }
    public static void sort(int[] arr, int l, int r) {
        if(l>=r) return;
        int mid = (l+r)/2;
        sort(arr,l,mid);
        sort(arr,mid+1,r);
        merge(arr, l,mid, r);
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,4,10, 1, 3 , 6, 23,6,5,3,2};
        sort(arr,0, arr.length-1);
        for(int el: arr) {
            System.out.print(el + " ");
        }
    }
}
