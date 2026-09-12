package vanshika.example;
import java.util.*;

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



public class ManipulateString {

    public String reverseString(String str) {

        char[] charArray = str.toCharArray();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }

        return new String(charArray);
    }
public int[] sortingArray(int []array){
    Arrays.sort(array);
    return array;
}

}
