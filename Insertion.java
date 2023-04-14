import java.util.Scanner;
public class Insertion {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:  ");
        int size = sc.nextInt();
        int [] arr = new int[size+1];
        System.out.print("Enter the element in array:  ");
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value which you want insert:  ");
        int value = sc.nextInt();
        System.out.print("Enter the position:  ");
        int pos = sc.nextInt();
        for(int i = size -1 ; i >= pos-1 ; i--)
        {
            arr[i+1] = arr[i];
        }
        arr[pos-1] = value;
        System.out.println("Resultant array after inserting : ");
        for(int i = 0 ; i <= size ; i++)
        {
            System.out.print(arr[i] + " ");
        }


    }
}
