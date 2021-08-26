class MergeSorting {
    void merge(int A[], int L[], int R[]) {
        int nl = L.length;
        int nr = R.length; //num of ele
        int i=0, j=0, k=0;
        while(i<nl && j<nr) {
            if (L[i]<R[j]) {
                A[k] = L[i];
                k++;
                i++;
            } else {
                A[k] = R[j];
                k++;
                j++;
            }
        }
        
        while(i<nl) {
            A[k] = L[i];
            k++;
            i++;
        }
        while(j<nr) {
            A[k] = R[j];
            k++;
            j++;
        }
    }

    void mergeSort(int A[]) {
        int n = A.length;
        if (n<2)
            return;
        int mid = n/2; 
        int L[] = new int[mid]; 
        int R[] = new int[n-mid];
        for(int i=0; i<mid;i++) { 
            L[i] = A[i];//copy elements from array A to L array
        }
        for(int j=mid; j<n;j++) { 
            R[j-mid] = A[j];
        }
        mergeSort(L); 
        mergeSort(R); 
        merge(A,L,R); 
    }
    public static void main(String []args)
    {
        int arr[] = {7,9,8,3,2,6};
    
        MergeSorting ob = new MergeSorting();
        ob.mergeSort(arr);

        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        
    }
}
