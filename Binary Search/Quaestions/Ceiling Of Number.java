public class ceilingOfNumber {
    /* Ceiling means in this array find the smallest number that is greater than and equal to target
    *
    * In this question if we remove grater than condition than it is literally binary search question and array is sorted alos\
    *
    * Now because of greater than you will not return -1 here, if element not found just return next element of it
    *
    * Example
    *
    *  [2,3,5,9,14,16,18]
    *  target = 15
    *
    *  s              e
    *  0 1 2 3 4   5  6
    * [2,3,5,9,14,16,18]
    *          | ( start + end )/2 = 3
    *          |       element < target
    *          |  start = mid +1
    *          |s      e
    *          |4      6
    *         [14,16,18]
    *          |
    *          | (start + end )/2 = 5
    *          |  element > target
    *          | end = mid -1
    *           s m e
    *          [ 14]
    *             |
    *             |element < target
    *             | start = mid +1
    * but here start,mid and end are same and now we are taking start = mid + 1 means start > end
    * while loop is breaking
    *
    * when while loop break start = end +1  , next big number when no answer found
    * */
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7,8,9};
        int target= 4;
        int ans = ceilingOfNumber(arr,target);
        System.out.println(ans);
    }

    static int ceilingOfNumber(int[] arr, int target){
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
        return arr[start];
    }
}
