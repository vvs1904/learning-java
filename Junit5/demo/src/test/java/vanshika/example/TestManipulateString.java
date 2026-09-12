package vanshika.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Nested;

// /**
//  * Unit test for simple App.
//  */
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
public class TestManipulateString {
    @Nested
    class TestReverseString{
      @Test
    public void testReverseString() {
        ManipulateString str = new ManipulateString();
        String ac = str.reverseString("Java");
        String er = "avaJ";
        assertEquals(ac, er);
    }

    @Test
    void testReverseString_MultipleWords(){
        assertEquals("ysae si avaJ",new ManipulateString().reverseString("Java is easy"));
    }
    }
    @Nested
    class SortedArray{
    @Test
    void testUnsortedArrays(){
        int []unsorted={4,2,8,6};
        int []expected={2,4,6,8};
        int actual[]=new ManipulateString().sortingArray(unsorted);
        assertArrayEquals(actual,expected);
    }

    }
    
}