public class Sorting_LL {
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
                        // Insertion at beginning
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
                            // Sorting a list
   public void sort()
   {
       Node start = head;
       int temp;
       Node i ;
       Node j;
       for( i = start ; i.next != null ; i = i.next)
       {
           Node min = i;
           for( j = i.next ; j != null ; j = j.next)
           {
               if (i.data > j.data)
               {
                   min = j;
                }
           }
           if(min != i)
           {
               temp = i.data;
               i.data = min.data;
               min.data = temp;
           }
       }
   }
                    // Printing a list
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
        Sorting_LL list = new Sorting_LL();
        list.addFirst(1);
        list.addFirst(6);
        list.addFirst(4);
        list.addFirst(90);
        System.out.println("Before Sorting: ");
        list.printList();
        list.sort();
        System.out.println("After Sorting");
        list.printList();

    }
}
