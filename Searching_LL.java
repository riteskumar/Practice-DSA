import java.util.Scanner;
public class Searching_LL {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
   Node head;
    public void addFirst(int val)
    {
       Node newNode = new Node(val);
        if(head == null)
        {
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public int Search(int val)
    {
       Node temp = head;
       int pos = 1;
       while(temp.data != val)
       {
           temp= temp.next;
           pos++;
       }
       return pos;
    }
    public void printList()
    {
        if(head == null){
            System.out.println("List is empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Searching_LL list = new Searching_LL();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        System.out.println("LinkedList : ");
        list.printList();
        System.out.print("Enter the value of you want to search: ");
        int val = sc.nextInt();
        System.out.println("Element found at position: "+list.Search(val));



    }
}
