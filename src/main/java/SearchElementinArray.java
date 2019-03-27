import java.util.Scanner;

public class SearchElementinArray {

    /**Because you already create an instance of this class there is no need to make {@link SearchElementinArray#SearchElement()} method static*/
    public void SearchElement(){
        int n,arr[];

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        n = in.nextInt(); /**Its a good practice to validate input (for example, I still could enter -10 or 0)*/


        System.out.println("Введите элемент массива");
        int b = in.nextInt();

        arr = new int [n];
        boolean number = false;

        /**This could be replaced by Arrays.toString(arr)
         * and Random lib*/
        for (int i = 0; i <arr.length; i ++){
            arr[i] = (int) ( Math.random() * n); 
            System.out.print(arr[i] + " "); 

            if (arr[i] == b){
                number = true;
            }
        }
//        Random random = new Random();
//        for (int i=0; i<arr.length; i++){
//            arr[i] = random(n);
//            if (arr[i] == b){
//                number = true;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
        
        System.out.println(number); 
    }


}
