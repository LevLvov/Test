package Lessons;

import org.testng.annotations.Test;

public class Splited {

    @Test
    public static void sent() {
        String str = "My email is metall_l@ukr.net";
        String[] asd = str.split(" ");
        for (String words : asd) {
            System.out.println(words);

        }
    }
}