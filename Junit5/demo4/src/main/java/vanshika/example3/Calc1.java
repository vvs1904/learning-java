package vanshika.example3;

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
public class Calc1
{
    public int divide(int numerator,int denominator){
        if(denominator==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numerator/denominator;
    }
}