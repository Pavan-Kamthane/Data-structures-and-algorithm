public class sqrtOfx {
    /*
    *  Find the square root of number x
    *
    *  Ex:- x = 64 obviously its square root is 8
    *
    *   Let us assume y*y <= x ok
    *   And we have to find largest y whose square is smaller or equal to x
    *
    *   Let's start from y= 1, y*y = 1 < x yes!
    *                    y= 2, y*y = 4 < x yes!
    *                    y= 3, y*y = 9 < x yes!
    *                    y= 4, y*y = 16 < x yes!
    *                    y= 5, y*y = 25 < x yes!
    *                    y= 6, y*y = 36 < x yes!
    *                    y= 7, y*y =  49< x yes!
    *                    y= 8, y*y = 64 = x yes! =========> answer is y=8
    *                    y = 9 , y*y = 81 > No!
    *
    *   Now for example x =69
    *   Let's start from y= 1, y*y = 1 < x yes!
    *                    y= 2, y*y = 4 < x yes!
    *                    y= 3, y*y = 9 < x yes!
    *                    y= 4, y*y = 16 < x yes!
    *                    y= 5, y*y = 25 < x yes!
    *                    y= 6, y*y = 36 < x yes!
    *                    y= 7, y*y =  49< x yes!
    *                    y= 8, y*y = 64 < x yes! =========> answer is y=8
    *                    y = 9, y*y = 81 > x  No!
    * */
    public static void main(String[] args) {
        int x =65;
        long answer = sqrtInLinearSearch(x);
//        System.out.println(answer);

        long answer2 = sqrtInBinarySearch(x);
        System.out.println(answer2);
    }
    static long  sqrtInLinearSearch(int x){
        long   y = 1;
        while (y*y <= x){
            y++;
        }
        return y-1;// After debug, you will understand why we take y-1
    }

    static long sqrtInBinarySearch(int x){
        long start = 0;
        long end = Integer.MAX_VALUE;
        long ans=0;
        while (start <= end){
            long mid = start + (end - start)/2;
            if (mid*mid <= x){
                ans = mid;
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return ans;
    }


}
