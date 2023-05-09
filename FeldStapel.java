public class FeldStapel<T> {
    // Stack using a Field
    Object[] stack = new Object[0];

    public static void main(String[] args) {
        //test this class
        FeldStapel<Integer> stack = new FeldStapel<Integer>();
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

    public T push(T item) {
        Object[] tmp = stack;
        stack = new Object[tmp.length + 1];

        stack[0] = item;
        for (int i = 0; i < tmp.length; i++) {
            stack[i + 1] = tmp[i];
        }

        return item;
    }

    public Object pop() {
        Object[] tmp = stack;
        if (isEmpty()) {
            return null;
        }
        stack = new Object[tmp.length - 1];
        Object item = tmp[0];
        for (int i = 1; i < tmp.length; i++) {
            stack[i - 1] = tmp[i];
        }

        return item;
    }

    public Object peek() {
        if(isEmpty()){
            return null;
        }
        return stack[0];
    }

    public boolean isEmpty() {
        return stack.length == 0;
    }
}
