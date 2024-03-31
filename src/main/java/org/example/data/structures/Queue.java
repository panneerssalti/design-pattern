package org.example.data.structures;

public class Queue<T> {
    private int front;
    private int rear;
    private final int size;
    private final T[] arrayOfData;

    public Queue(int size) {
        front = -1;
        rear = -1;
        this.size = size;
        arrayOfData = (T[]) new Object[size];
    }

    public boolean enQueue(T element) {
        if (isFull()) {
            System.out.println("The queue is already full. please check and insert");
            return false;
        } else {
            if (front == 0) front = 1;
            arrayOfData[++rear] = element;
            return true;
        }
    }

    public T deQueue() {
        if(isEmpty()){
            System.out.println("The queue is already full. please check and insert");
            return null;
        }else{
            T ele = arrayOfData[front++];
            if(front == rear) {
                front = -1;
                rear = -1;
            }
            return ele;
        }
    }

    public boolean isFull() {
        return front == 0 && rear == size - 1;
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    void display() {
        /* Function to display elements of Queue */
        int i;
        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {
            System.out.println("\nFront index-> " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(arrayOfData[i] + "  ");

            System.out.println("\nRear index-> " + rear);
        }
    }


    public static void main(String[] args) {
        var q = new Queue<String>(10);

        // deQueue is not possible on empty queue
        q.deQueue();

        // enQueue 5 elements
        q.enQueue("panneer");
        q.enQueue("is");
        q.enQueue("a");
        q.enQueue("good");
        q.enQueue("boy");

        // 6th element can't be added to because the queue is full
        q.enQueue("sfs");

        q.display();

        // deQueue removes element entered first i.e. 1
        q.deQueue();

        // Now we have just 4 elements
        q.display();

    }
}
