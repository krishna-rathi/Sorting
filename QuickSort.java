public class QS {

    int partition(int arr[], int start, int end) {
        int pivot = arr[end]; //pivot ele last ele
        int pindex = start;
        for (int i = start; i<end;i++) {
            if(arr[i]<=pivot) {
                //swap(arr[i], arr[pindex]);
                int temp = arr[i];
                arr[i] = arr[pindex];
                arr[pindex] = temp;
                pindex = pindex+1;
            }
        }
        //swap(arr[pindex], arr[end]);
        int temp = arr[pindex];
        arr[pindex] = arr[end];
        arr[end] = temp;
        return pindex;
    }

    void quicksort(int a[], int start, int end) {
        if(start<end) {  //base condition
            int pindex = partition(a,start, end);
            quicksort(a, start, pindex - 1);
            quicksort(a, pindex + 1, end);
        }
    }

    public static void main(String args[]) {
        int arr[] = {8,9,1,3,6,7};
        QS obj = new QS();
        obj.quicksort(arr,0,5);
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }    
}
