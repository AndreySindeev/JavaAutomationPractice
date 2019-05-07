package regEx;

public class TaskSeven {

    void task7(){

        String testString = "password wword word Heeeeeeello";

        String pattern = "\\s*\\b[A-Za-z]*(\\w+)\\1+(\\w*)\\b\\s*";

        String result  = testString.replaceAll( pattern, "");
        System.out.print(result);

    }
}
