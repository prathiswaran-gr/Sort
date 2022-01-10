import java.util.*;
public class BubbleSort
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
        System.out.print("Elements before Sort:");
        System.out.print(Arrays.toString(arr));

        for(i=0;i<n-1;i++){             //Bubble sort
            for( j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
        System.out.print("\nElements After Sort:");
        System.out.print(Arrays.toString(arr));

    }
}



