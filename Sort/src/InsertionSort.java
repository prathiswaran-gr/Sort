import java.util.*;
public class InsertionSort
{
    public static void main(String[] args) {
        int i,j;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of elements to be sort:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter "+ n+ " elements:");
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("\nElements before Sort:");
        System.out.print(Arrays.toString(arr));

        for(i=1;i<n;i++){
            int temp=arr[i];
            j=i-1;
            while(j>=0 && temp<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;

        }
        System.out.print("\nElements after Sort:");

        System.out.println(Arrays.toString(arr));
    }
}
