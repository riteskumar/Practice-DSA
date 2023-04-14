import java.util.Scanner;

public class Traversing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:  ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter the element in array:  ");
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
