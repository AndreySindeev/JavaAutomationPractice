package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskFour {

    void task4(){
        String[] testDates = new String[]{"2018/10/09", "12/10/2019", "45/15/2019", "aa\0\\9"};

        String regex = "((0[1-9]|[1-2][0-9]|3[0-1])/(0[1-9]|1[1-2])/([1-9][0-9][0-9][0-9]))";

        Pattern pattern = Pattern.compile(regex);

        for (String testCase : testDates) {
            Matcher matcher = pattern.matcher(testCase);
            System.out.print(testCase + " - " + matcher.matches() + "\n");
        }
    }

}
