package pashkov;

import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        int[] array = {8, 0, 4, 7, 3, 7, 10, 12, -3};
        int low = 0;
        int high = array.length - 1;
        System.out.println(Arrays.toString(array));
        quickSort(array, low, high);
        System.out.println(Arrays.toString(array));
        mergeSort(array, low, high);
        System.out.println(Arrays.toString(array));
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int support = array[middle];
        int i = low;
        int j = high;
        while (i <= j) {
            while (array[i] < support) {
                i++;
            }
            while (array[j] > support) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }

    private static void mergeSort(int[] array, int low, int high) {
        if (high <= low)
            return;
        int mid = low + (high - low) / 2;
        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);
        int[] buf = Arrays.copyOf(array, array.length);
        if (high + 1 - low >= 0) System.arraycopy(array, low, buf, low, high + 1 - low);
        int i = low, j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                array[k] = buf[j];
                j++;
            } else if (j > high) {
                array[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                array[k] = buf[j];
                j++;
            } else {
                array[k] = buf[i];
                i++;
            }
        }
    }

    private static int createLeftBranch(int i) {
        return (i * 2);
    }

    private static int createRightBranch(int i) {
        return (i * 2 + 1);
    }

    public static void findMaxHeap(int[] array, int index, int heapSize) {
        int largest = index;
        int left = createLeftBranch(index);
        int right = createRightBranch(index);
        if (left <= heapSize && array[left] > array[index]) {
            largest = left;
        }
        if (right <= heapSize && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != index) {
            int a = array[index];
            array[index] = array[largest];
            array[largest] = a;
            findMaxHeap(array, largest, heapSize);
        }
    }

    public static void buildMaxHeap(int[] array) {
        int heapSize = array.length - 1;
        for (int i = ((array.length - 1) / 2); i >= 0; i--) {
            findMaxHeap(array, i, heapSize);
        }
    }

    public static void heapSort(int[] array) {
        int heapSize = array.length - 1;
        buildMaxHeap(array);
        for (int i = (array.length - 1); i > 0; i--) {
            int a = array[0];
            array[0] = array[i];
            array[i] = a;
            heapSize = heapSize - 1;
            findMaxHeap(array, 0, heapSize);
        }
    }
}

