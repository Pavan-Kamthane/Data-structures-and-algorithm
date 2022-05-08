public class findTheFloorOfNumber {
    /*
    * Find the floor of number ?
    * Floor means the greatest number that is smaller or equal to target
    * int[] arr = {2,3,5,9,14,16,18}
    * target = 15
    *
    *
    *   0 1 2 3  4  5  6
    *  {2,3,5,9,14,16,18}
    *         |
    *         |mid = s+e = 6/2=3
    *         |target > mid start = mid +1
    *
    *           s     e
    *           4  5  6
    *          {14,16,18}
    *              |
    *              |mid = s+e = 10/2=5
    *              | target < mid
    *              | end = mid -1
    *
    *              s m e
    *              {14}
    *               |
    *               | target > mid therefore start = end + 1
    *  here loop is breaking
    *  Just return end for greatest number that is smaller or equal to target
    * */

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target= 15;
        int ans = floorOfNumber(arr,target);
        System.out.println(ans);
    }

    static int floorOfNumber(int[] arr, int target){
        int start = 0;
        int end=arr.length-1;

        if (arr.length == 0){
            return -1;
        }

        while (start <= end){
            int mid = start + (end -start)/2;
            if (arr[mid] == target){
                return arr[mid];
            }
            if (arr[mid] < target){
                start = mid +1;
            }else {
                end = mid -1;
            }
        }
        return arr[end];
    }
}
