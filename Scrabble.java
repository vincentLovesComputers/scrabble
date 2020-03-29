/*
* Scrabble game  that scores words
 */

import acm.program.ConsoleProgram;

public class Scrabble extends ConsoleProgram {
    public int sum=0;
    public void run() {

        while(true)
        {
            String input = readLine("Enter string to scrabble: ");
            println(points(input));
            String query = readLine("Do you want to scrabble again? ");
            if(query.equals("yes"))
            {
                println(points(input));
            }
            else
            {
                println("scrabble  over");
                break;
            }
        }


    }

    /*method to score words*/
    public int points(String input) {
        int score = 0;
        for(int i=0; i<=input.length() - 1; i++) {

            switch (input.charAt(i)) {
                case 'A':
                case 'E':
                case 'I':
                case 'L':
                case 'N':
                case 'O':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                    score += 1;
                    break;

                case 'D':
                case 'G':
                    score += 2;
                    break;

                case 'B':
                case 'C':
                case 'M':
                case 'P':
                    score += 3;
                    break;

                case 'F':
                case 'H':
                case 'V':
                case 'W':
                case 'Y':
                    score += 4;
                    break;

                case 'K':
                    score += 5;
                    break;

                case 'J':
                case 'X':
                    score += 8;
                    break;

                case 'Q':
                case 'Z':
                    score += 10;
                    break;

            }

        }
        return score;

    }
}