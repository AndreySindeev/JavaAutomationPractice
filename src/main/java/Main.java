import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        FindMinimum minimum = new FindMinimum();
        minimum.ComputeLowest(978, 35, 89, 44);


        SearchElementinArray search = new SearchElementinArray();
        search.SearchElement();

        SelectionSortArray select = new SelectionSortArray();
        int[] arr = {15, 58,37, 4, 555, 8645, 1, 5569, 3, 4782, 2};
        select.SelectionSort(arr);

        BubbleSorting bubble = new BubbleSorting();
        bubble.sortArray(arr);

        Scanner newScan = new Scanner(System.in); /**Code of conduct*/
        TextProgramm letterCounter = new TextProgramm();

        String inputUser;
        String findChar;
        System.out.println("Введите слово: "); /**During task you need some predefined test (you could try to generate it randomly by yourself or using external Apache lib:
                                                  docs: https://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/RandomStringUtils.html*/
        inputUser = newScan.next();
        System.out.println("\nВведите элемент поиска: ");
        findChar = newScan.next();
        System.out.println("Введенное слово анализируется...");
        letterCounter.getOccuringChar(inputUser, findChar);


    }











}




