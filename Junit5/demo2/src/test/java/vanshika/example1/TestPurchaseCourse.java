package vanshika.example1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

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
class TestPurchaseCourse
{
    @Test
    void test(){
        PurchaseCourse Course =new PurchaseCourse();
       boolean status= Course.proceedWithCourse(new JavaCourse());
       assertTrue(status);


    }
}
