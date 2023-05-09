/**
 * blatt4 Aufgabe 8
 */
public class blatt4 {

    public static void main(String[] args) {
        ArrayLoopWrapper t = new ArrayLoopWrapper(5);
        t.insert(2);
        t.insert(4);
        t.insert(8);
        t.insert(16);
        t.insert(32);
        
        System.out.println(t.at(3));
        System.out.println(t.at(9));
        System.out.println(t.at(-1));

        t.printToConsole();
    }

    /**
     * ArrayLoopWrapper
     */
    public static class ArrayLoopWrapper {

        private Object[] arr;
        private int len;
        private int pointer;
        private int curLen;

        public ArrayLoopWrapper(int len) {
            this.len = len;
            arr = new Object[len];
            pointer = 0;
        }

        public void insert(Object objT) {
            if (curLen < len) {
                System.out.println("inserting at " + ((pointer + curLen) % len));
                this.arr[(pointer + curLen) % len] = objT;
                curLen += 1;
            } else {
                System.out.println("list already full");
            }
        }

        public void pop() {
            if (curLen != 0) {
                System.out.println("deleting at " + pointer);
                arr[pointer] = null;
                curLen -= 1;
                pointer = (pointer + 1) % len;
            } else {
                System.out.println("list already emtpy");
            }
        }

        public Object at(int i) {
            if (i >= 0 && i <= curLen) {
                return arr[(pointer + i) % len];
            } else {
                System.out.println("out of bounds");
                return null;
            }
        }

        public void printToConsole() {
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}