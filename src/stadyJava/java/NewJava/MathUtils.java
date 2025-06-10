package NewJava;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathUtils {
 public int MaxNumber(int a,int b, int c){
    return  Math.max(a,Math.max(b,c));
 }
 @Test
    public void TheSameNumber(){
     int test1  = MaxNumber(2,2,2);
     Assert.assertEquals(test1, 2);
     int test2  = MaxNumber(2,2,4);
     Assert.assertEquals(test2, 4);
     int test3  = MaxNumber(3,7,4);
     Assert.assertEquals(test3, 7);
     int test4  = MaxNumber(3,-7,4);
     Assert.assertEquals(test4, 4);
    }


}
