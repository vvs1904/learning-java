
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalcTest {
    @Test
    void test(){

        Calc c=new Calc();
     
        int actualResult=c.divide(10,5);
        int expectedResult=2;
        assertEquals(actualResult,expectedResult);
    }
    
}
