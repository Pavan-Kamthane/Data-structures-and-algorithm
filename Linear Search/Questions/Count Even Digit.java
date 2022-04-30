public class QuestionCountEvenDigit {
//    Given an array nums of integers, return how many of them contain an even number of digits.

    public static void main(String[] args) {
        int[] nums = {1234,344,56,677,87};
        System.out.println(findHowManyNumbersAreEvenDigit(nums));
    }

    static int findHowManyNumbersAreEvenDigit(int[] nums){

//          First count the digit by creating digit function
//          create a function of even in which it takes digit count, telling even or not.
        int count = 0;
        for (int num:nums) {
            if (even(num)){
                count++;
            }
        }

        return count;
    }

    static int digit(int number){

        int count = 0;

        if(number < 0){
            return -1;
        }

        if(number == 0){
            return 1;
        }

        while (number >0){
            count ++;
            number = number/10;
        }

        return count;
    }

    static boolean even(int numBer){
        int numberOfDigits = digit(numBer);

        if (numberOfDigits % 2 == 0){
            return true;
        }

        return false;
    }
}
