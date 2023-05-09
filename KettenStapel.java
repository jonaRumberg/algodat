import java.util.Collection;
import java.util.Iterator;

public class KettenStapel<T> {

    public static void main(String[] args) {
        //test this class
        KettenStapel<Integer> stack = new KettenStapel<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.peek());

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }


    }


    StackEl top = null;

    public T push(T item) {
        StackEl el = new StackEl(item);

        if(top == null){
            el.next = null;
        } else {
            el.next = top;
        }
        top = el;
        
        return item;
    }

    public T pop() {
        StackEl tmp = top;
        top = tmp.next;

        return tmp.ref;
    }

    public T peek() {
        return top.ref;
    }

    public boolean isEmpty() {
        return top == null;
    }

    /**
     * StackEl
     */
    public class StackEl {
        public T ref;
        public StackEl next;
        public StackEl(T ref) {
            this.ref = ref;
        }
        
    }

}
