import com.sun.deploy.security.SessionCertStore;

import java.util.Arrays;
import java.util.Scanner;

public class SearchEllementinArray {



    public static void SearchEllement(){
        int n,arr[];

        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");
        n = in.nextInt();


        System.out.println("Введите элемент массива");
        int b = in.nextInt();

        arr = new int [n];
        boolean number = false;

        for (int i=0;i<arr.length;i++){
            arr[i] = (int) ( Math.random() * n);
            System.out.print(arr[i] + " ");

            if (arr[i] == b){
                number = true;

            }


        }
        System.out.println(number);
    }


}
