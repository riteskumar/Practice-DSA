import java.util.Scanner;
public class Searching {
    public static void main(String[] args)
    {
        //1.linear search
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:  ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.print("Enter the element in array:  ");
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value you want to search : ");
        int key = sc.nextInt();
        int index = 0;
        boolean flag = false;
        for(int i = 0 ; i < size ; i++)
        {
            if(arr[i] == key) {
                flag = true;
                index = i;
            }
        }
        if(flag)
        {
            System.out.println("Element is found at position "+(index+1));
        }
        else{
            System.out.println("Element is not found");
        }

        // 2 . Binary Search
        int low = 0 , high = size-1;
        while (low <= high)
        {
            int mid = (low+high)/2;
            if(arr[mid] == key)
            {
                System.out.println("Element is found at position: "+(mid+1));
                flag = true;
                break;
            }
            else if(arr[mid] > key)
                high = mid -1;
            else
                low = mid + 1;
        }
        if(!flag)
        {
            System.out.println("Element is not found");
        }
    }
}
