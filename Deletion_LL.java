public class Deletion_LL {
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

    public void deleteValue(int val)
    {
        if(head == null)
            System.out.println("List is empty!! Can't delete");
        else if(head.data == val)
        {
            head = head.next;
        }
        else{
            Node temp = head;
            Node prev = null;
            while (temp.data != val)
            {
                prev = temp;
                temp = temp.next;
            }
            prev.next = temp.next;
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
        Deletion_LL list = new Deletion_LL();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.deleteValue(5);
        list.printList();

    }
}
