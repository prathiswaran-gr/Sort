public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            int min_index=i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index=j;
                }
            }
            swap(arr,i,min_index);
        }
    }
 
