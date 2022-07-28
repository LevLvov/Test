package Lessons;

import org.testng.annotations.Test;

public class Ret {
    int asd = 100;
    @Test
    public void star(){
        System.out.println(sum(5,2,3));
    }
    public int sum(int a, int b, int c){
        return a*b-c;
    }
}

