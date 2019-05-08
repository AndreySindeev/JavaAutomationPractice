package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TaskOne {


    void task1(){

        String testString = "Word cAT DATA A site Java tExt";

        String regex = "\\b[A-Z][A-Za-z]*\\s";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(testString);

        while(matcher.find()) {
            System.out.print(testString.substring(matcher.start(), matcher.end()));
        }
    }



}
