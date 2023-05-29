import java.util.Arrays;

public class SortingAlgos {
    public static void main(String[] args) {

        // in dieses Array die zu sortierenden elemente schreiben
        Character[] testArray = { 'J', 'D', 'C', 'K', 'A' };
        for (Character t : testArray) {
            System.out.print(t + " ");
        }
        System.out.println();
        insertionSort(testArray);

    }

    public static <T extends Comparable<T>> T[] insertionSort(T[] tComparable) {

        for (int i = 1; i < tComparable.length; i++) {
            int j = i;
            while (j > 0 && tComparable[j].compareTo(tComparable[j - 1]) < 0) {
                T temp = tComparable[j];
                tComparable[j] = tComparable[j - 1];
                tComparable[j - 1] = temp;
                for (T t : tComparable) {
                    System.out.print(t + " ");
                }
                System.out.println();
                j--;
            }

        }
        return tComparable;
    }

    public static <T extends Comparable<T>> T[] selectionSort(T[] t) {

        // loop over and select smallest
        for (int i = 0; i < t.length; i++) {
            int sInd = i;
            for (int j = i; j < t.length; j++) {
                if (t[i].compareTo(t[j]) > 0)
                    sInd = j;
            }
            T temp = t[i];
            t[i] = t[sInd];
            t[sInd] = temp;
            for (T t1 : t) {
                System.out.print(t1 + " ");
            }
            System.out.println();
        }
        return t;
    }

    public static <T extends Comparable<T>> T[] bubbleSort(T[] t) {

        boolean swap;

        do {
            swap = false;
            for (int i = 0; i < t.length - 1; i++) {
                if (t[i].compareTo(t[i + 1]) > 0) {
                    T tmp = t[i];
                    t[i] = t[i + 1];
                    t[i + 1] = tmp;
                    swap = true;
                }
            }

            for (T t1 : t) {
                System.out.print(t1 + " ");
            }
            System.out.println();
        } while (swap);

        return t;
    }

    public static <T extends Comparable<T>> T[] mergeSort(T[] t) {

        if (t.length <= 1) {
            return t;
        }

        T[] lList = Arrays.copyOfRange(t, 0, (int) t.length / 2);
        T[] rList = Arrays.copyOfRange(t, (int) t.length / 2, t.length);

        int ri = 0, li = 0;
        for (T t1 : lList) {
            System.out.print(t1 + " ");
        }
        System.out.print("| ");

        for (T t1 : rList) {
            System.out.print(t1 + " ");
        }

        System.out.println();

        lList = mergeSort(lList);
        rList = mergeSort(rList);

        for (int i = 0; i < t.length; i++) {
            if (li >= lList.length || (!(ri >= rList.length) && lList[li].compareTo(rList[ri]) > 0)) {
                t[i] = rList[ri];
                ri++;
            } else {
                t[i] = lList[li];
                li++;
            }
        }

        for (T t1 : t) {
            System.out.print(t1 + " ");
        }
        System.out.println();
        System.out.println();

        return t;
    }

    public static <T extends Comparable<T>> T[] quickSort(T[] t, int begin, int end) {
        T[] t2 = t;

        if (begin < end) {
            int partitionIndex = partition(t2, begin, end);

            for (T t1 : Arrays.copyOfRange(t2, begin, partitionIndex)) {
                System.out.print(t1 + " ");
            }
            System.out.print("| ");
            System.out.print(t2[partitionIndex] + " ");
            System.out.print("| ");

            for (T t1 : Arrays.copyOfRange(t2, partitionIndex + 1, end + 1)) {
                System.out.print(t1 + " ");
            }

            System.out.println();

            quickSort(t2, begin, partitionIndex - 1);
            quickSort(t2, partitionIndex + 1, end);
        }

        for (T t1 : Arrays.copyOfRange(t2, begin, end + 1)) {
            System.out.print(t1 + " ");
        }
        System.out.println();
        System.out.println();

        return t2;
    }

    private static <T extends Comparable<T>> int partition(T arr[], int begin, int end) {
        T pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j].compareTo(pivot) <= 0) {
                i++;

                T swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;

            }
        }

        T swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

}
