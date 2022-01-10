import java.util.Arrays;
import  java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i=0;i<array.length;i++){
            array[i]=new Random().nextInt(100);
        }
        System.out.print("Elements Before Sort:"+ Arrays.toString(array)+"\n");
        quickSort(array);
        System.out.print("Elements After Sort:"+ Arrays.toString(array));
    }
    public static void quickSort(int[] array){
        quickSort(array,0,array.length-1);
    }

    public static void quickSort(int[] array,int lowIndex,int highIndex){
        if(lowIndex >= highIndex){
            return;
        }
        int pivotIndex= new Random().nextInt(highIndex-lowIndex)+lowIndex;
        int pivot = array[pivotIndex];
        swap(array,pivotIndex,highIndex);
        int leftPointer = partition(array,lowIndex,highIndex,pivot);
        quickSort(array,lowIndex,leftPointer-1);
        quickSort(array,leftPointer+1,highIndex);
    }

    public static int partition(int[] array, int lowIndex, int highIndex, int pivot){
        int leftPointer = lowIndex;
        int rightPointer= highIndex;

        while(leftPointer < rightPointer){
            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(array,leftPointer,rightPointer);
        }
        swap(array,leftPointer,highIndex);
        return leftPointer;
    }

    public static void swap(int[] array , int leftIndex,int rightIndex){
        int temp=array[leftIndex];
        array[leftIndex]=array[rightIndex];
        array[rightIndex]=temp;
    }
}
