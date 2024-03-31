package org.example.data.structures;

public class Stack<T> {
    T[] arrayOfData;
    private int size;
    private int top;

    public Stack(int size) {
        this.size = size;
        arrayOfData = (T[]) new Object[size];
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean push(T element) {
        if (isFull()) {
            System.out.println("the stack is already full");
            return false;
        } else {
            arrayOfData[++top] = element;
            return true;
        }
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("the stack is already empty and nothing to retrieve");
            return null;
        } else {
            T element = arrayOfData[top];
            arrayOfData[top--] = null;
            return element;
        }
    }

    public T peek() {
        if (isEmpty()) {
            System.out.println("the stack is already empty and nothing to retrieve");
            return null;
        } else {
            return arrayOfData[top];
        }
    }

    public int size() {
        return top + 1;
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arrayOfData[i]);
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();
        System.out.println("\nAfter popping out");

        stack.printStack();

    }
}