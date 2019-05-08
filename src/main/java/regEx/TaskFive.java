package regEx;

public class TaskFive {

    void task5(){
        String testString = "Regular regular popular expressions entered popular use from 1968 1968 1968";

        String regex = "\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b)";

        String result = testString.replaceAll(regex, " ");

        System.out.print(result);
    }
}
