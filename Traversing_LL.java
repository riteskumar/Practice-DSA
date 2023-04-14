public class Traversing_LL {
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
        Traversing_LL list = new Traversing_LL();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        System.out.println("Linked list is : ");
        list.printList();

    }
}
