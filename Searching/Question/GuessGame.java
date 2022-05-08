public class GuessGame {
    /*
    Link Of Q : https://leetcode.com/problems/guess-number-higher-or-lower/
    * We are playing the Guess Game. The game is as follows:

    I pick a number from 1 to n. You have to guess which number I picked.

    Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

    You call a pre-defined API int guess(int num), which returns three possible results:

    -1: Your guess is higher than the number I picked (i.e. num > pick).
    1: Your guess is lower than the number I picked (i.e. num < pick).
    0: your guess is equal to the number I picked (i.e. num == pick).
    Return the number that I picked.

    Example:-
    Input: n = 10, pick = 6
    Output: 6
    */

    public static void main(String[] args) {
        int num =10;
        int pick = 6;
        int guessHigherOrLower = guess(num,pick);
        System.out.println(guessHigherOrLower);
    }

    static int guess(int num , int pick){
        if(num > pick){
            return -1;
        }else if (num < pick){
            return 1;
        }else {
            return 0;
        }
    }

}
