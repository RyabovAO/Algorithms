public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {17, 24, 45, 102, 41, 0, 3, 9, 1, 0, 97, 88, 25, 69, 75, 75, 4};
        printArrya(array);
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int m = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = m;
                    isSorted = false;
                }
            }
            printArrya(array);
        }
    }
    public static void printArrya(int[] a){
        System.out.print("[");
        for(int i = 0; i < a.length; i++){
            if(i > 0){
                System.out.print(", ");
            }
            System.out.print(a[i]);
        }
        System.out.println(" ]");
    }
}