public class findPositionOfAnelementInASortedArrayOfInfiniteNumber {
//    find Position Of An element In A Sorted Array Of Infinite Number
/*
*   In this question we are not able to use ".length" factor because array is of infinite length for searching
*
*   Here array is sorted, so definitely we are using binary searching ,
*
*   int[] arr = { 2,4,5,6,7,12,34,56,89,...   .....} ;
*   int target  =56 ;
*
*   Only thing is we don't know the size.
*
*   Here we know our target is in array instead of making mid , we are now start and end
*   are 0th and 1st index and then applying binary search in between start and end
*   if target not found in start and end change start = start +1 and double the size of array
*
*
*
*     s e
*   { 2,4,5,6,7,12,34,56,89,...   .....}
*      ||
*      ||apply binary search if not found go to next step start = end +1,end = end + size of array * 2
*      ||size of array = (e-s+1)
*      ||
*      ||
*         s      e
*   { 2,4,5,6,7,12,34,56,89,...   .....}
*       ||
*                   s              e
*   { 2,4,5,6,7,12,34,56,89,...   .....}
*  */

    public static void main(String[] args) {
        int[] arr = { 2,4,5,6,7,12,34,56,89};
        int target =12;
        int ans = search(arr,target);
        System.out.println(ans);

    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start , int end){


//        chaek weather array is asending or desending
//        boolean isAsc = arr[start] < arr[end];
        boolean isAsc;
        if (arr[start] < arr[end]){
            isAsc= true;
        }else {
            isAsc = false;
        }

        while (start <= end){
            int mid = start + (end - start)/2; // Hmne ager s+e/2 direct likh diya tho syad int ki range berak ho skti islye is tarh likh hoga is ka reason oops me ptalagega
            if (arr[mid] == target){
                return  mid;
            }

            if (isAsc){
                if (target <arr[mid]){
                    end = mid -1;

                }else if(target > arr[mid]) {
                    start = mid + 1;
                }
            }else {
                if (target <arr[mid]){
                    start = mid + 1;


                }else if(target > arr[mid]) {
                    end = mid -1;
                }
            }
        }

        return -1;


    }

    static int search(int[] arr,int target){
//        find the range
//        first start with box of size of 2
        int start =0;
        int end = 1;

//        condition for target to lay in range
        while (target > arr[end]){
            int newStart = end + 1;// we need to update old start in following steps hence we are not assigning
//            directly as Start = end + 1
//            double the box
//            end = end + size of array * 2
            end = end + (end -start + 1 );
            start = newStart;
        }

        return orderAgnosticBinarySearch(arr,target,start,end);
    }


}
