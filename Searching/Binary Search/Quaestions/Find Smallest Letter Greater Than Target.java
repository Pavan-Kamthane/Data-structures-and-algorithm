public class findSmallestLetterGreaterThanTarget {
    /*
    *
    *  1) Exact same approach from ceiling of number
    *   link is = https://github.com/Pavan-Kamthane/Data-structures-and-algorithm/blob/main/Binary%20Search/Quaestions/Ceiling%20Of%20Number.java
    *
    *  2) Only ignore equal to condition here
    *  3) arr = {'c','d','f','j'} target = 'j'
    *  in question it is given that when no character is larger than target return (Start % N)th index of array
    *  Condition is voileted when start = end + 1
    *  return Start % N where N is length of array
    * */

    public static void main(String[] args) {
        char[] arr = {'c','d','f','j'};
        char target = 'd';
        char ans = nextGreaterLetter(arr,target);
        System.out.println("The smallest letter greater than target "+target+" is "+ans);
    }

    static char nextGreaterLetter(char[] letters, char target){
        int start = 0;
        int end=letters.length-1;


        while (start <= end){
            int mid = start + (end -start)/2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
