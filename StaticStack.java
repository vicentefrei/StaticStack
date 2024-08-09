public class StaticStack<T> {
    private int top = -1; 
    private T[] data;


    public StaticStack(int size) {
        data = (T[]) new Object[size];
    }


    public void push(T dta) {
        if (isFull()) {
            throw new StackOverflowError("Stack is full");
        }
        data[++top] = dta;
    }


    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return data[top--];
    }


    public void clear() {
        top = -1;
    }


    public boolean isFull() {
        return top == data.length - 1;
    }


    public boolean isEmpty() {
        return top == -1;
    }


    public static void main(String[] args) {
        StaticStack<Integer> stack = new StaticStack<>(5);


        stack.push(10);
        stack.push(20);
        stack.push(30);


        System.out.println(stack.pop());
        System.out.println(stack.pop());


        System.out.println(stack.isEmpty());


        stack.clear();
        System.out.println(stack.isEmpty());
    }
}
