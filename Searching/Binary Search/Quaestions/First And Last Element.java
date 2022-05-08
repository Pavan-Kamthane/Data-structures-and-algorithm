import java.util.Arrays;

public class firstAndLastElement {
/*  Find the first and last index of target in array
*   int arr = {5,7,7,7,7,8,9,10};
*   target = 7;
*
*   Brute force method:-
*
* ============================== Create a function called search to find index only ====================================
*
*   1. Find first occurrence
*
*   How we can get first occurrence / first index?
*
* Ans:- Simply search in left side for this apply end = middle - 1 because 1st index   is  left side of middle
*
*   2. Similarly, find last occurrence just put start = middle + 1;
*
* ================================ Index values are found ==============================================================
*
* Now create a function array in which you are returning { startIndex, lastIndex } */

//    code: -

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8,8};// remember array should be sorted
        int target = 8;
        int[] ans = findRange(arr,target);
        System.out.println(Arrays.toString(ans));//[5, 7]
    }

    static int search(int[] arr, int target , boolean findStart ){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end){
            int mid = start + (end -start)/2;
            if (target < arr[mid]){
                end = mid -1;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else {
                 ans = mid;
                if (findStart){
                    end=mid-1;
                }else {
                    start = mid +1;
                }
            }
        }

        return ans;
    }

//    Now we have found index
    static int[] findRange(int[] arr , int target){
        int[] ans = {-1,-1};

        int firstIndex= search(arr,target,true);

        int lastIndex= search(arr,target,false);

        ans[0] = firstIndex;
        ans[1] = lastIndex;

        return ans;
    }
}
