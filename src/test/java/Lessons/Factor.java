package Lessons;

import org.testng.annotations.Test;

public class Factor {
    @Test
    public void factorial(){
        System.out.println(fact(3));
    }
   public int fact(int m){
        if (m==1||m==0){
            return 1;}
        return m*fact(m-1);
   }

}


