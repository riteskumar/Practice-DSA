import java.util.Scanner;

public class Sorting {
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
        int temp = 0;
        for(int i = 0 ;i < size -1 ; i++)
        {
            int min = i;
            for(int j = i+1 ; j < size ; j++)
            {
                if(arr[min] > arr[j])
                    min = j;
            }
            if(min != i)
            {
                temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println("After sorting resultant array: ");
        for(int i = 0 ; i < size ; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
