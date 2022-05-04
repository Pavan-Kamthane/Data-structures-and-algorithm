public class findTheMinimumInRotatedArr {
    /*
    *  What is rotated array?
    *  Example given array is  arr =[ 1,2,3,4,5,6,7,8,9]
    *                                       |
    *                                       |Rotated 1st time
    *                                [9,1,2,3,4,5,6,7,8]
    *                                       |
    *                                       |Rotated 2ed Time
    *                               [8,9,1,2,3,4,5,6,7]
    *
    *  So, this type of rotation of element gives rotated array
    *  Here in question they have given you a rotated array ok, and we have to find minimum value of element in array ok
    *
    *  For this first we have to find pivot ok,Now what is pivot?
    *  Pivot simply means the largest element of array and (pivot + 1 ) is the number of rotation
    *
    *  How to find pivot?
    *
    *         s             e
    *         0 1 2 3 4 5 6 7
    *   arr =[5,6,7,8,1,2,3,4]
    *   According to this question from element of value 5 to 8 array is ascending order / increasing and
    *   from 1 to 4 also it is in ascending order but from 8 to 1 it is in descending order/ decreasing order
    *
    *  It is one type of sorted array so let's try binary search
    *  int ans;
    *  case 1 : if mid > mid + 1 ::: ans = mid
    *  case 2 : if mid-1 > mid ::: ans =  mid - 1
    *  case 3 : if start >= mid :: in this case all element from mid will be < start, hence we can ignore all
    * them, becoz we are looking for largest element
    *  end = mid -1;
    *
    *  if start<mid , here in this case mid is not an answer becoz if it is answer then it would have been detected
    * in case 1 or 2
    *
    *  hence bigger number is after mid
    *  start  = mid + 1
    *  ======================================= Pivot found =================================================
    *
    *  Now we found pivot and in question we have to find lowest value element so simply (pivot + 1)th
    *  index number's element is lowest number therefore answer is arr[pivot +1]
    *
    * */
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,1,2,3,4};
        int pivot = findPivot(arr);
        System.out.println( "The pivot is "+ arr[pivot]);
        System.out.println("The minimum value of element in rotated array is "+ arr[pivot +1]);

    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length;

        while (start <= end){

            int mid = start + (end -start)/2 ;

            if (arr[mid] > arr[mid+1]){
                return  mid;
            }

            if (arr[mid -1] > arr[mid]){
                return mid -1;
            }

            if (arr[start] >= arr[mid]){
                end = mid -1;
            }

            if (arr[start] < arr[mid]){
                start = mid +1;
            }

        }

        return  -1;
    }
}
