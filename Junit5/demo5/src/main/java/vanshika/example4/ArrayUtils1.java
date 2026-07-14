package vanshika.example4;

/**
 * Hello world!
 *
 */
// public class App 
// {
//     public static void main( String[] args )
//     {
//         System.out.println( "Hello World!" );
//     }
// }
import java.util.*;
public class ArrayUtils1
{
    public static int[] sortArray(int array[]){
        for(int i=0;i<1000000;i++){
            Arrays.sort(array);
        }
        return array;
    }
}
