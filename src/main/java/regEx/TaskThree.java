package regEx;

public class TaskThree {

    void task3(){

        String testString = "  Removing        Extra Spaces       Between Words in  the             text  ";

        String regex = " +";

        String result = testString.trim().replaceAll(regex, " ");
        System.out.print(result);
    }

}
