import java.util.Arrays;

public class SortingAlgos {
    public static void main(String[] args) {

        // testarray with random numbers
        Integer[] testArray  = { 7, 81, 63, 91, 27, 36, 73, 99, 51, 9, 90, 60, 82, 18, 6, 3, 39, 66, 84, 72, 93, 75, 96, 87, 54, 57, 24, 12, 42, 15, 45, 30, 33, 21, 48, 69, 20 };

        //start timer
        long startTime = System.nanoTime();
        Integer[] sortedArray = mergeSort(testArray);
        //stop timer
        long endTime = System.nanoTime();

        // print time
        System.out.println("Took "+(endTime - startTime) + " ns");

        // print sorted array
        System.out.println("Sorted Array:");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(" " + sortedArray[i]);
        }
        
    }

    public static <T extends Comparable<T>> T[] insertionSort(T[] tComparable) {
        for (int i = 1; i < tComparable.length; i++) {
            int j=i;
            while (j > 0 && tComparable[j].compareTo(tComparable[j-1]) < 0) {
                T temp = tComparable[j];
                tComparable[j] = tComparable[j-1];
                tComparable[j-1] = temp;               
                j--;
            }

        }
        return tComparable;
    }

    public static <T extends Comparable<T>> T[] selectionSort(T[] t){
        //loop over and select smallest
        for (int i = 0; i < t.length; i++) {
            int sInd = i;
            for (int j = i; j < t.length; j++) {
                if(t[i].compareTo(t[j]) < 0) sInd = j;
            }
            T temp = t[i];
            t[i] = t[sInd];
            t[sInd] = temp;
        }
        return t;
    }
    public static <T extends Comparable<T>> T[] bubbleSort(T[] t){
        boolean swap;

        do {
            swap = false;
            for (int i = 0; i < t.length-1; i++) {
                if (t[i].compareTo(t[i+1]) > 0){
                    T tmp = t[i];
                    t[i] = t[i+1];
                    t[i+1] = tmp;
                    swap = true;
                }
            }
        } while (swap);


        return t;
    }

    public static <T extends Comparable<T>> T[] mergeSort(T[] t) {

        if(t.length <= 1){
            return t;
        }

        T[] lList = Arrays.copyOfRange(t, 0, (int) t.length/2);
        T[] rList = Arrays.copyOfRange(t, (int) t.length/2, t.length);

        int ri = 0, li = 0;

        lList = mergeSort(lList);
        rList = mergeSort(rList);

        for (int i = 0; i < t.length; i++) {
            if(li >= lList.length || (!(ri >= rList.length) && lList[li].compareTo(rList[ri]) > 0)){
                t[i] = rList[ri];
                ri++;
            } else {
                t[i] = lList[li];
                li++;
            }
        }

        return t;
    }

    public static <T extends Comparable<T>> T[] quickSort(T[] t) {
        return t;
    }
    
}
