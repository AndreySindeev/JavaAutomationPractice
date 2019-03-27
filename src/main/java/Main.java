import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        FindMinimum minimum = new FindMinimum();
        minimum.ComputeLowest(978, 35, 89, 44);


        SearchEllementinArray search = new SearchEllementinArray();
        search.SearchEllement();

        SelectionSortArray select = new SelectionSortArray();
        int[] arr = {15, 58,37, 4, 555};
        select.SelectionSort(arr);

        BubbleSorting bubble = new BubbleSorting();
        bubble.sortArray(arr);

        Scanner newscan = new Scanner(System.in);
        TextProgramm letterCounter = new TextProgramm();

        String inputUser;
        String findChar;
        System.out.println("Введите слово: ");
        inputUser = newscan.next();
        System.out.println();
        System.out.println("Введите элемент поиска: ");
        findChar = newscan.next();
        System.out.println("Введенное слово анализируется...");
        letterCounter.getOccuringChar(inputUser, findChar);


    }











}




