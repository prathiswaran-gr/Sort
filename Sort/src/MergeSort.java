import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] array = new int[]{9,5,1,4,6,3};

        System.out.print("Elements Before Sort:"+ Arrays.toString(array)+"\n");
        splitArray(array);
        System.out.print("Elements After Sort:"+ Arrays.toString(array));
    }
    public static void splitArray(int[] array){
        int length = array.length;
        int mid = array.length/2;
        if(length == 1){
            return;
        }
        int[] arrLeft = new int[mid];
        int[] arrRight = new int[length-mid];

        for(int i = 0 ; i<mid;i++){
            arrLeft[i]=array[i];
        }
        for(int i=mid;i<length;i++){
            arrRight[i-mid]=array[i];
        }

        splitArray(arrLeft);
        splitArray(arrRight);

        mergeArray(array,arrLeft,arrRight);
    }
    public static void mergeArray(int[] array, int[] arrLeft, int[] arrRight){
        int leftIndex=arrLeft.length;
        int rightIndex=arrRight.length;
        int i=0,j=0,k=0;
        while(i<leftIndex && j<rightIndex){
            if(arrLeft[i]<=arrRight[j]){
                array[k]=arrLeft[i];
                i++;
            }
            else {
                array[k]=arrRight[j];
                j++;
            }
            k++;
        }
        while(i<leftIndex){
            array[k]=arrLeft[i];
            i++;
            k++;
        }
        while(j<rightIndex){
            array[k]=arrRight[j];
            j++;
            k++;
        }
    }
}