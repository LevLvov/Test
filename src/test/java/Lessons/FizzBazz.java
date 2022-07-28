package Lessons;

import org.testng.annotations.Test;

public class FizzBazz {
    @Test
    public void fb(){
        for (int asd = 1; asd <= 100; asd++){
            if (asd%15==0){
                System.out.println("FizzBazz");
            }
            else if (asd%5 == 0){
                System.out.println("Bazz");
            }
            else if (asd%3==0){
                System.out.println("Fizz");
            }
            else {
                System.out.println(asd);
            }
        }
    }
}
