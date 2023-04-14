public class Insertion_LL {
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
/*   public Node add(Node HEAD , int val , int pos)
   {

        Node temp = HEAD;
       if(pos == 1)// beginning at first
       {
           Node newNode = new Node(val);
           newNode.next = HEAD;
           temp = newNode;
       }
       else{
           for(int i =1 ; i < pos-1 ; i++)
           {
               HEAD = HEAD.next;
           }
           Node newNode = new Node(val);
           newNode.next = HEAD.next;
           HEAD.next = newNode;
       }
       return temp;
   }*/
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
    public void addLast(int val)
    {
        Node newNode = new Node(val);
        if(head == null)
        {
            head = newNode;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next= null;
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
            Insertion_LL list = new Insertion_LL();

            list.addFirst(5);
            list.addFirst(4);
            list.addFirst(3);
            list.addLast(6);
            list.printList();
    }
}
