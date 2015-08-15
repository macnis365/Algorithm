package com.macnis.HR;

import java.util.Scanner;

/**
 * 
 * @author Micheal.S
 *
 */
public class StairCase
{

    private static final int _ZERO = 0;
    private static final int _ONE = 1;
    public static String UNIT_SPACE = "*";
    public static String STAIR_CASE_CHARACTER = "#";

    public static void main( String[] args )
    {

        int stairCaseSpacesSize;
        System.out.println( "Enter the size of the stair case " );
        Scanner scanner = new Scanner( System.in );

        stairCaseSpacesSize = scanner.nextInt();

        for( int characterSize = _ONE; characterSize <= stairCaseSpacesSize; characterSize++ )
        {
            printLeadingSpaces( stairCaseSpacesSize - characterSize,
                                characterSize );
        }
        scanner.close();

    }

    /**
     * 
     * @param numberOfLeadingSpaces
     * @param numberOfCharacters
     */
    private static void printLeadingSpaces( int numberOfLeadingSpaces,
            int numberOfCharacters )
    {

        StringBuilder output = new StringBuilder();

        for( int i = _ZERO; i < numberOfLeadingSpaces; i++ )
        {

            output.append( UNIT_SPACE );

        }

        for( int j = _ZERO; j < numberOfCharacters; j++ )
        {

            output.append( STAIR_CASE_CHARACTER );

        }

        System.out.println( output );
        output = null;

    }
}
