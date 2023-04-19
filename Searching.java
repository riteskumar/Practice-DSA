class Queu{
    int[] arr;
    int front;
    int rear;
    int size;

    Queu(int x) {
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
    int Find(int val)
    {
        while(front <= rear)
        {
            if(arr[front] == val)
                return front;
            front++;
        }

        return -1;
    }

}
public class Searching {
    public static void main(String[] args) {
        Queu q = new Queu(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(60);
        System.out.println("Element found at position : "+(q.Find(60)+1));
//        q.dequeue();
//        q.dequeue();
//        System.out.print("My queue is : ");
//        q.printlist();


    }
}
