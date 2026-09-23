package vanshika.example5;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.CsvSource;

/**
 * Unit test for simple App.
 */
// public class AppTest 
// {
//     /**
//      * Rigorous Test :-)
//      */
//     @Test
//     public void shouldAnswerWithTrue()
//     {
//         assertTrue( true );
//     }
// }

class NumOpsTest{
    NumberOps num=new NumberOps();
    @ParameterizedTest
    @ValueSource(ints={2,4,6,8})
    void testIsEven(int number){
      Boolean status=  num.isEven(number);
      assertTrue(status);
    }
    @ParameterizedTest
    @CsvSource({"4,5,9","2,2,4","3,3,6"})
    void testAdd(int n1,int n2,int expected){
        int result=num.add(n1,n2);
        assertEquals(result,expected);
    }
}
