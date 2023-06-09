class Que{
    int[] arr;
    int front;
    int rear;
    int size;

    Que(int x) {
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
    void printlist(){
        while(front <= rear)
        {
            System.out.print(arr[front]+ " ");
            front++;
        }
    }

}
public class Traversing {
    public static void main(String[] args) {
        Que q = new Que(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(60);
        q.dequeue();
        q.dequeue();
        System.out.print("My queue is : ");
        q.printlist();


    }
}
