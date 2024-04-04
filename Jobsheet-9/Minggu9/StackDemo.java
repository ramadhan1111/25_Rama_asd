public class StackDemo {
    public static void main(String[] args) {
        Stack25 Stack = new Stack25(10);
        Stack.push(8);
        Stack.push(12);
        Stack.push(18);
        Stack.print();
        Stack.pop();
        Stack.peek();
        Stack.pop();
        Stack.push(-5);
        Stack.print();
    }
}
