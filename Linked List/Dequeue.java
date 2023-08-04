class Q {
    int[] arr;
    int front;
    int rear;
    int size;

    Q(int x) {
        size =x;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(int val) {
        if (isFull())
            System.out.println("Overflow ");
        else {
            rear++;
            arr[rear] = val;
            System.out.println("Element is added: " + val);
        }
    }

    int dequeue() {
        if (isEmpty())
            System.out.println("Queue is empty");
        else {
            int element = front;
            front++;
            System.out.println("Deleted element is :" + arr[element]);
            return arr[element];
        }
        return -1;
    }

    boolean isEmpty() {
        return (front == -1);
    }

    boolean isFull() {
        return (front == 0 && rear == size - 1);
    }
}
public class Dequeue {
    public static void main(String[] args) {
        Q que = new Q(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(60);
        que.dequeue();
        que.dequeue();
    }
}
