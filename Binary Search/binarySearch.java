public class binarySearch {
    public static void main(String[] args) {
        int[] array= {34,56,67,89,123,456,765,908};
        int searchTarget = 123;

//        In linear search mee target pura array scan krta hai or badme output btata hai
//        Linear search mee time complexsity :-
//        In best case(mtlb ager target 0th index pe hoto) T&C is O(1)
//        In worst case(mtlb array pura scan hua or last me pta chla ki target hai hi nhi) t&C is O(N)

//        But Binary search mee ye sab nhi hota
//        Usme Scaning Middle element ( mid = (start + end)/2 ) se kiya jata hai
//        Or binary search sirf tbhi hmm apply kr skte jb array sorted ho ya to asending nhi to desending
//        Iamgine array is in asending order
//        Now start scaning from mid if target < mid tho end ko mid -1 one kr
//        Or ager target > mid hai tho start ko mid +1 kr
//        Or ha ye while loop mee kr, and start < end
//        Time complexsity :-
//        in best case (target ager middle me ho) O(1)
//        In worst case(last tk )

//        target =92

//        [1,23,45,56,77,89,92] ==== 1/2^0
//                  |
//                  | size half
//                 [56,77,89,92] ====1/2
//                      |
//                      |
//                      [77,89,92] ===1/4 ===1/2^2
//                          |
//                          |
//                          [89,92] ==1/8 == 1/2^3
//                              |
//                              |
//                              [92] == 1/16 == 1/2^4

//                              |
//                              |
//                              |
//                              ==== 1/2^n = k
//
//                      k = log(n)
//
//        time complexity is log(n)



        int indexOfTarget = BinarySearch(array,searchTarget);
        System.out.println(indexOfTarget);// 4

    }

    static int BinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;

//        while(start < end) wrong "=" is missed it gives you -1
        while(start <= end){
            int mid = start + (end - start)/2; // Hmne ager s+e/2 direct likh diya tho syad int ki range berak ho skti islye is tarh likh hoga is ka reason oops me ptalagega

            if (target <arr[mid]){
                end = mid -1;

            }else if(target > arr[mid]){
                start = mid+1;
            }else {
                return mid;
            }

        }

       return -1;
    }
}
