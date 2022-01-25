public class BubbleSort {
    public static void  main(String[] args) {
        int arr[] = { 12, 11, 20, 4, 9 };
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        /* Print the sorted array*/        
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
    }
    
}
