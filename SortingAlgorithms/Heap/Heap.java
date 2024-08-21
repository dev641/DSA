package SortingAlgorithms.Heap;

import java.util.ArrayList;
import java.util.List;

public class Heap {
    private static final List<Integer> maxHeap = new ArrayList<>();
    private static final List<Integer> minHeap = new ArrayList<>();

    private static void insertInMaxHeap(int x) {
        int i = maxHeap.size();
        maxHeap.add(x);
        while(i > 0) {
            if (maxHeap.get(i) > maxHeap.get(i/2)) {
                int temp = maxHeap.get(i);
                maxHeap.set(i, maxHeap.get(i/2));
                maxHeap.set(i/2, temp);
                i/=2;
            } else {
                break;
            }
        }
    }

    private static void createMaxHeap(int[] arr) {
        int i = 1;
        while(i < arr.length) {
            int j = i;
            int temp = arr[i];
            while(j > 0 && temp > arr[j/2]) {
                arr[j] = arr[j/2];
                j/=2;
            }
            arr[j] = temp;
            i++;
        }

        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }

    private static void heapifyMaxHeap(int[] arr) {
        int n = arr.length;
        int i = n-1;
        while(i >= 0) {
            int j = i, k = 2* j;
            while (k < n-2) {
                if (arr[k] < arr[k+1]) {
                    k = k+1;
                }
                if (arr[j] < arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                    j = k;
                    k = 2*j;
                } else {
                    break;
                }
            }
            i--;
        }
    }

    private static void heapifyMinHeap(int[] arr) {
        int n = arr.length;
        int i = n-1;
        while(i >= 0) {
            int j = i, k = 2* j;
            while (k < n-2) {
                if (arr[k] > arr[k+1]) {
                    k = k+1;
                }
                if (arr[j] > arr[k]) {
                    int temp = arr[j];
                    arr[j] = arr[k];
                    arr[k] = temp;
                    j = k;
                    k = 2*j;
                } else {
                    break;
                }
            }
            i--;
        }
    }

    private static void createMinHeap(int[] arr) {
        int i = 1;
        while(i < arr.length) {
            int j = i;
            int temp = arr[i];
            while(j > 0 && temp < arr[j/2]) {
                arr[j] = arr[j/2];
                j/=2;
            }
            arr[j] = temp;
            i++;
        }

        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }

    private static void insertInMinHeap(int x){
        int i = minHeap.size();
        minHeap.add(x);
        while(i > 0) {
            if (minHeap.get(i) < minHeap.get(i/2)) {
                int temp = minHeap.get(i);
                minHeap.set(i, minHeap.get(i/2));
                minHeap.set(i/2, temp);
                i/=2;
            } else {
                break;
            }

        }
    }

    private static void deleteInMinHeap(int[] arr, int n) {
//        int n = arr.length;
        int temp = arr[0];
        arr[0] = arr[n];
        int i = 0, j = 0;
        while (j < n-1){
            if (arr[j] > arr[j+1]) {
                j = j+1;
            }
            if (arr[i] > arr[j]) {
                int val = arr[i];
                arr[i] = arr[j];
                arr[j] = val;
                i = j;
                j = 2*i;
            } else {
                break;
            }
        }
        arr[n] = temp;
    }

    private static void deleteInMaxHeap(int[] arr, int n) {
//        int n = arr.length;
        int temp = arr[0];
        arr[0] = arr[n];
        int i = 0, j = 0;
        while (j < n-1){
            if (arr[j] < arr[j+1]) {
                j = j+1;
            }
            if (arr[i] < arr[j]) {
                int val = arr[i];
                arr[i] = arr[j];
                arr[j] = val;
                i = j;
                j = 2*i;
            } else {
                break;
            }
        }
        arr[n] = temp;
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        createMaxHeap(arr);
        System.out.println();
        for(int i = 0;i<n;i++) {
            deleteInMaxHeap(arr, n-i-1);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,13, 45, 5, 67, 7,8};
//        sort(arr);
        heapifyMinHeap(arr);
        for(int ele: arr) {
            System.out.print(ele+ " ");
        }
    }
}
