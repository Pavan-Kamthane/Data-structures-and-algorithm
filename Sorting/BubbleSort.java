import java.util.Arrays;

public class BubbleSort {
/*  What is sorting?
* Ans: Sorting means arranging array in either ascending or descending
*
* Bubble sort is one of the type of sorting , it is also known as syncing sort or exchange sort.
*
* In this type your going to compare adjacent elements
*
* Example:-
*  pass 1 or i=0;
*            [3,1,5,4,2]
*            /\   is 3<1, no its not ok swap it
*           [1,3,5,4,2]
*           /\ | |       is 3<1, no then j++
*             /\ |       is 5<3, no then j++
*                /\      is 4<5, yes  ok swap it
*           [1,3,4,5,2]
*                 /\     is 2<5 yes, then swap
*           [1,3,4,2,5]
*
* Now in pass 2 i.e i=1
*            [1, 3, 4,2,5]
*             /\ |  |    is 3<1 no j++
*               /\  |    is 4<3 yes j++
*                  /\    is 2<4 yes then swap
*            [1,3,2,4,5]
*
* Now i=2
*
*           [1,3,2,4,5]
*           /\ |      is 3<1 no j++
*              /\     is 2<3 yes then swap
*          [1,2,3,4,5] ===> Answer
*
* ======================= Array is sorted =========================
*
* You see in second pass (i=1) the second-largest element is at 2ed position from last, similary in first pass
* largest element comes at last position.
*
* Space complexity = O(1)//constant //No extra space required  //Also knowing inplace sorting algorithm
*
* Time complexity =
*   Best Case = O(N)
*   Worst Case = O(Nsr)   */
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

   
    static void bubbleSort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped= false;
            for (int j = 1; j <= arr.length-i-1; j++) {
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped= true;
                }
            }
            //If you did not swap so break
            if (!swapped){
                break;
            }
        }
    }
}
