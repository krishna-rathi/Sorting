public class SelectionSort {
    public static void  main(String[] args) {
        int arr[] = { 12, 11, 18, 4, 9 };
        int n = arr.length;
        for(int i=0;i<n-1;i++) {
            int min_index = i; //stores the smallest element for the current iteration
            for(int j=i+1;j<n;j++) {
                if (arr[j] < arr[min_index])
                    min_index = j; //update the minimum index

            }
            /* swap operation begin */
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
            /* swap operation end */
        }
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
    }
    
}
