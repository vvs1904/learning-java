package vanshika.example2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

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
class ArrayUtilsTest{
    @Test 
    void test(){
    //     int input[]={4,2,5,6};
    //     int expectedResult[]={1,2,4,5,6};
    //     ArrayUtils.sortArray(input);
    //     int actualResult[]=ArrayUtils.sortArray(input);
    //     assertArrayEquals(expectedResult,actualResult,"Arrays are not matching");
    // }
    int input[]=null;
    assertThrows(NullPointerException.class,()->ArrayUtils.sortArray(input));
    }
}
