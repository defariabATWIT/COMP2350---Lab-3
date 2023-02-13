import java.util.Scanner ;

/**
 * @author Laura Wysocki and Bryan DeFaria
 *
 * @version 1.0.0 2023-02-10 Initial implementation
 */
public class Bruteforce
{

    /**
     * @param firstString
     *     (first) user inputted String
     * @param secondString
     *     (second) user inputted String
     *
     * @return the array sorted from least to greatest
     */
    public static int bruteforce( final String firstString,
                                        final String secondString )
    {
        int count = 0;

        for( int i = 0; i<= firstString.length() - secondString.length(); i++)
        {

            // Increments the count in the event of a character match
            while( ( count < secondString.length() ) && ( firstString.charAt( count + i ) == secondString.charAt( count ) ) )
            {
                count++;
            }

            // Returns the index if a match is detected
            if( count == secondString.length() )
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
            String firstString = input.next();

            System.out.print( "Please input another String: " ) ;
            String secondString = input.next();

            int result = bruteforce( firstString, secondString ) ;

            // prints out the index at which the pattern appears
            if ( result == -1 )
            {
                System.out.println( "\nSecond String does not appear in First String.") ;

            } // end if
            else
            {
                System.out.printf( "%nSecond String appears in First String at index %d.", result ) ;

            } // end else

        } // end try

    } // end main()

}
// end class Bruteforce
