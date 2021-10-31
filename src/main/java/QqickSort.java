import java.util.Arrays;

public class QqickSort {
    public static void main(String[] args) {
        int[] a = {4, 14, 23, 54, 27, 73, 77, 45, 86, 28, 36, 16, 75, 98, 74, 46, 65, 80};
        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] a, int from, int to){
        if(from < to){
            int divideIndex = partition(a, from,to );
//            printSortStep(a, from, to, divideIndex);
            quickSort(a, from, divideIndex - 1);
            quickSort(a, divideIndex, to);

        }
    }
    private static int partition(int[] a, int from, int to){
        int leftIndex = from;
        int rightIndex = to;
        int pivot = a[from];
        while(leftIndex <= rightIndex){

            while (a[leftIndex] < pivot){
                leftIndex++;
            }
            while(a[rightIndex] > pivot){
                rightIndex--;
            }
            if(leftIndex <= rightIndex){
                swap(a, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }
//    private static int printSortStep(int[] a, int from, int to, int divideIndex){
//
//    }
    private static void swap(int[]a, int index1, int index2){
        int tmp = a[index1];
        a[index1] = a[index2];
        a[index2] = tmp;
    }
}
