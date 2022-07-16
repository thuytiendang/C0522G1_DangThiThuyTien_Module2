package ss11_dsa_stack_queue.practice.stack_useLinkedList;

public class GenericStackClient {
    private static void stackOfString() {
        MyGenericStack<String> myGenericStack = new MyGenericStack<>();
        myGenericStack.push("one");
        myGenericStack.push("two");
        myGenericStack.push("three");
        myGenericStack.push("four");
        myGenericStack.push("five");
        System.out.println("1.1 size of stack after push operations: " + myGenericStack.size());
        System.out.println("1.2 pop element from stack: ");
        while (!myGenericStack.isEmpty()) {
            System.out.printf(" %s", myGenericStack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operations: " + myGenericStack.size());
    }

    private static void stackOfInteger() {
        MyGenericStack<Integer> myGenericStack = new MyGenericStack<>();
        myGenericStack.push(1);
        myGenericStack.push(2);
        myGenericStack.push(3);
        myGenericStack.push(4);
        myGenericStack.push(5);
        System.out.println("2.1 size of stack after push operations: " + myGenericStack.size());
        System.out.println("2.2 pop element from stack: ");
        while (!myGenericStack.isEmpty()){
            System.out.printf(" %d", myGenericStack.pop());
        }
        System.out.println("\n2.3 Size of stack after pop operations:" + myGenericStack.size());
    }

    public static void main(String[] args) {
        System.out.println("1. Stack of integers ");
        stackOfInteger();

        System.out.println("\n 2. Stack of Strings");
        stackOfString();
    }
}
