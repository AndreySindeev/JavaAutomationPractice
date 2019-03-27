public class SelectionSortArray {

    
    /**Again: if you already create instance of class them you should not use static method 
     * e.g you could merge static and non static method but in this case you do not need static*/
    public void SelectionSort(int arr[])
    {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array 
            /**Code of conduct: minIdx instead of min_idx*/
            int minIdx = i;
            for (int j = i+1; j < n; j++) { /**Code of conduct: { } for look, if/else and so on*/
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first
            // element
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i]+" "); /**Arrays.toString...*/
        }
        
        System.out.println("Selection Sort ");
    }
}
