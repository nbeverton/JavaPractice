package Dio.BootcampJavaAngular.Exerc_1;

import java.io.Console;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexExample {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String patternString = "e";

        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Found match at index " + matcher.start());
        } else {
            System.out.println("No match found");
        }
    }
}
