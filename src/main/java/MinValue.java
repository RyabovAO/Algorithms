import java.util.Arrays;

public class MinValue {
    public static void main(String[] args) {
        int[] a = {65, 23, 14, 1, 6, 77, 86, 79,90, 47, 53, 62, 17, 22};
        for(int step = 0; step < a.length; step++){
            System.out.println(Arrays.toString(a));
            int index = min(a, step);
            int tmp = a[step];
            a[step] = a[index];
            a[index] = tmp;
        }

        //   System.out.println("min: " + min(a));
    }
    public static int min(int[] array, int start){
        int minIndex = start;
        int minValue = array[start];
        for(int i = start + 1; i < array.length; i++){
            if(array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}