public class cyclingSort {
    /**
     * When given numbers from range 1,N => use cyclic sort
     * ex= {3,5,2,1,4}
     * 
     * after sorting
     * 
     *  index = value - 1
     *   0 1 2 3 4
     *  {1,2,3,4,5}
     * 
     * In just one pass you can sort the array using cyclic sort
     * 
     *  {3,4,2,1,4}
     *   is (index = value - 1) No then swap 3 with index 2
     *  {2,5,3,1,4}
     *   is (index = value - 1) No then swap 2 with index 1
     *  {5,2,3,1,4}
     *  is (index = value - 1) No then swap 5 with index 4
     *  {4,2,3,1,5}
     *   is (index = value - 1) No then swap 4 with index 3
     *  {1,2,3,4,5}
     *  Sorted
     * ====================================T&C=======================================
     * 
     * T&C = O(N)
     *  
     */

     public static void main(String[] args) {
        int[] arr = {4,5,1,3,2};
        cyclicSorting(arr);
        System.out.println(arr);
     }

    static void cyclicSorting(int[] arr) {
        int i =0;
        while (i < arr.length) {
            int correctIndex = arr[i] -1;
            if (arr[i] != arr[correctIndex]) {
                // int temp = arr[i];
                // arr[i] = arr[correctIndex];
                // arr[correctIndex] = temp;
                swap(arr, arr[i], arr[correctIndex]);   
            }else{
                i++;
            }
        }
    }
    
    static void swap(int[] arr,int first,int second){
            int temp = arr[first];
            arr[first] =arr[second];
            arr[second]= temp;
        }
}
