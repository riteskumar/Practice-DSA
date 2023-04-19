public class Enqueue {
    static class Q {
        int[] arr;
        int front;
        int rear;
        int size;

        Q(int size) {
            arr = new int[size];
            front=-1;
            rear=0;
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
        boolean isFull() {
            return (rear == size - 1);
        }
        public static void main(String[] args) {
            Q que = new Q(10);
            que.enqueue(20);
            que.enqueue(30);



        }
    }
}
