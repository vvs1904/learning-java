package vanshika.example3;

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
class calcTest{
    @Test
    void test(){
        Calc1 obj=new Calc1();
        assertThrows(ArithmeticException.class,()->obj.divide(100,0));
        
    }
}
