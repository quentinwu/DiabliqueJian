package com.lambda;

/**
 * Created by quentin on 1/16/2017.
 */
public class LambdaArgumentDemo {
    private static String changeStr(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Quentin Wu is a Great Troll/Demon Hunter!!";
        String outStr;

        System.out.println("Input: " + inStr);

        StringFunc upperCase = (s) -> s.toUpperCase();
        StringFunc reverseAll = (s) -> s.replace(" ", "-");
        StringFunc reverseIt = (s) -> {
            String result = "";
            for(int i = s.length() - 1; i >= 0; i--) {
                result += s.charAt(i);
            }
            return result;
        };
        outStr = changeStr(upperCase, inStr);
        outStr = changeStr(reverseAll, outStr);
        outStr = changeStr(reverseIt, outStr);
        System.out.println("Output: " + outStr);
    }
}
