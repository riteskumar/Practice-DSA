import java.util.Scanner;
public class Deletion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:  ");
        int size = sc.nextInt();
        int [] arr = new int[size+1];
        System.out.print("Enter the element in array:  ");
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the position:  ");
        int pos = sc.nextInt();
        for(int i = pos-1 ; i < size ; i++)
        {
            arr[i] = arr[i+1];
        }
        System.out.println("Resultant array after deleting : ");
        for(int i = 0 ; i <size-1 ; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }
}
