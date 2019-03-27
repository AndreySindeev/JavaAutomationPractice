public class BubbleSorting {
    
    public void sortArray(int[] numArray) {
        int n = numArray.length;
        int temp; /**0 will be initialized by default*/

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (numArray[j - 1] > numArray[j]) {
                    temp = numArray[j - 1];
                    numArray[j - 1] = numArray[j];
                    numArray[j] = temp;
                }
            }
            for (i=0; i<n; ++i) { /**  { } */
                System.out.print(numArray[i] + " "); /**Arrays.toString...*/
            }
              
            System.out.println("Bubble Sort");
        }

    }

}
