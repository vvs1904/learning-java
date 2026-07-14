package vanshika.example4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.RepeatedTest;

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
// class ArrayUtils1Test{
//     @Test
//     void test(){
//         int input[]={4,2,1,5,6};
//         assertTimeout(Duration.ofMillis(15),()->ArrayUtils1.sortArray(input));

//     }
// }
class ArrayUtils1Test{
    @RepeatedTest(3)
    void testSortArray(RepetitionInfo info){
        int input[]={4,2,5,1,6};
        if(info.getCurrentRepetition()==1)
            assertTimeout(Duration.ofMillis(20),()->ArrayUtils1.sortArray(input));
        if(info.getCurrentRepetition()==2)
            assertTimeout(Duration.ofMillis(15),()->ArrayUtils1.sortArray(input));
        if(info.getCurrentRepetition()==3)
            assertTimeout(Duration.ofMillis(5),()->ArrayUtils1.sortArray(input));
    }
}
