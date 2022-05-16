import java.util.Arrays;

public class SelectionSort {
/*    You are  going to select an element and put it at right index
* In selection sort first we are finding a maximum element and then put it at last index OK
* You can also find minimum element in array and then putting at first index and so on
*
* Example :-
* arr = {4,5,1,2,3}
*          |
*          | 5 is largest element so swap it with last index
*       {4,3,1,2,5}
*        | Now the the last index has its correct element, so we can ignore last element now
*        | So now find maximum element in 0th to last but one index which now is 4
*        | Swap 4 with last but one th index
*       {2,3,1,4,5}
*          |
*          | swap 3 with 1
*       {2,1,3,4,5}
*        |
*        | swap 2 with 1
*       {1,2,3,4,5} // Answer
*
* ====================== Complexity analysis ========================
*  In worst case
*  [1+2 .... (n-1) ] comparison which (n-1)n/2 comparison ====> n sqr -n / 2 ==> T&C is O(N sqr)
*  IN best case T&C is O(N)
* */


    public static void main(String[] args) {

        int[] arr = {4,5,1,2,3};
        SelectionSorting(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void SelectionSorting(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length -i -1;
            int Max = getMax(arr,0,last) ;
            // swap(arr,Max,last);
            int temp = arr[Max];
            arr[Max] =arr[last];
            arr[last]= temp;
        }
    }

    static int getMax(int[] arr,int start,int end){
        int max =start;
        for (int i = 0; i <= end; i++) {
                if (arr[i]>arr[max]){
                    max = i;
                }
        }
        return max;
    }

    // static void swap(int[] arr,int first,int second){
    //     int temp = arr[first];
    //     arr[first] =arr[second];
    //     arr[second]= temp;
    // }

}
