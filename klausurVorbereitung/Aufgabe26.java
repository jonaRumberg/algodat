package klausurVorbereitung;

/**
 * Aufgabe26
 */
public class Aufgabe26 {


    static Integer[] elements = { 1, 2, 3, 4, 5, 7, 12, 14, 16, null };
    static int lastIndex = 8;

    public static void main(String[] args) {
        printArray(elements);
        System.out.println("----");
        sortedInsert(6);
        printArray(elements);
        System.out.println("----");

        System.out.println(remove(3));
        System.out.println("----");

        printArray(elements);
        System.out.println("----");


    }

    public static void printArray(Integer[] array) {
        for (Integer i : array) {
            System.out.println(i);
        }
    }

    public static void sortedInsert(int o) {
        if (elements.length <= (lastIndex + 1)) {
            throw new RuntimeException();
        }
        if (lastIndex == -1) {
            elements[0] = o;
            lastIndex++;
        } else {
            int index = 0;
            for (int i = 0; elements[i].compareTo(o) < 0; i++) {
                index = i;
            }
            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            lastIndex++;
            elements[index] = o;
        }
    }

    public static Integer remove(int k) { // entferne das Element bei Index k
        if (k > lastIndex || k < 0)
            throw new RuntimeException("Element existiert nicht!");
        Integer hilf = elements[k];
        for (int i = k; i < lastIndex; i++) {
            elements[i] = elements[i + 1];
        }
        elements[lastIndex] = null; // optional, sollte aber sein
        lastIndex--;
        return hilf;
    }

}