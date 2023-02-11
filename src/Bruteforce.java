import java.util.Scanner ;

/**
 * @author Laura Wysocki and Bryan DeFaria
 *
 * @version 1.0.0 2023-02-10 Initial implementation
 */
public class Bruteforce
{

    /**
     * @param first
     *     (first) user inputted String as a list of characters
     * @param second
     *     (second) user inputted String as a list of characters
     *
     * @return the array sorted from least to greatest
     */
    public static int bruteforce( final char[] first,
                                        final char[] second )
    {

        for( int i = 0; i<= first.length - second.length; i++)
        {
            int count = 0;

            while( count < second.length && first[ count ] == second[ count + i ] )
            {
                count++;
            }

            if( count == second.length )
            {
                return i;
            }
        }

        return -1;

    }   // end bruteforce()


    /**
     * @param args
     *     an array of command-line arguments for the application
     */
    public static void main( String[] args )
    {
        try ( Scanner input = new Scanner( System.in ) )
        {
            System.out.println( "This program is a demonstration of Brute-Force String Matching." ) ;

            System.out.print( "Please input a String: " ) ;
            String firstString = input.next() ;
            char[] first = firstString.toCharArray();

            System.out.print( "%nPlease input another String: " ) ;
            String secondString = input.next() ;
            char[] second = secondString.toCharArray();

            int result = bruteforce( first, second ) ;

            // prints out the index at which the element appears
            if ( result == -1 )
            {
                System.out.printf( "%nSecond String does not appear in First String.") ;

            } // end if
            else
            {
                System.out.printf( "%nSecond String appears in First String at index %d.", result ) ;

            } // end else

        } // end try

    } // end main()

}
// end class SelectionSort