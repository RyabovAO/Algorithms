public class MergeSort {
    public static void main(String[] args) {

    }
    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start,
                              int[] dest, int destStart, int size){
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        int iterationCount = src1End - src1Start + src2End - src2Start; //вычислияем количество итераций цикла что бы
        // объединить два массива
        for (int i = destStart; i < destStart + iterationCount; i++){
            
        }
    }
}
