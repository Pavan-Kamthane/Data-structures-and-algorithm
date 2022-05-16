import java.util.Arrays;

public class inserctionsort {
    /* In insertion sorting We are partially sorting the array , for every index put that index element at
    correct index of LHS

      [5,3,4,1,2]
     |___|
     |_____|
     |_______|
     |__________|

     // Code==>

           j>0
        [5,3,4,1,2] // pass 1(i=0) means sort array till index 1
        |__|  j<j-1 ok swap
          ||             here j will 0 so now j is 2ed index bcoz till 1st index array is sorted
          || j
        [3,5,4,1,2] // pass 2(i=1) means sort array till index 2
        |____| j< j-1 ok swap
          ||
          ||   j
        [3,4,5,1,2]// pass 3(i=2) means sort array till index 3
        |______| j<j-1 ok swap
           ||
           ||     j
        [1,3,4,5,2]// pass 4(i=3) means sort array till index 4
        |_________|
             ||
             ||
        [1,2,3,4,5] Answer

    Observe that i will run from 0 < i < n-2

    ============================Complexity Analysis========================
    worst case T&C= O(N sqr)
    best case T&C = O(N)


,
    */
    public static void main(String[] args) {
        int[] arr = {4,5,1,3,2};
        insertionSorting(arr);
        System.out.println(arr);
    }

    static void insertionSorting(int[] numArray) {
         //declare an array and print the original contents
      
        System.out.println("Original Array:" + Arrays.toString(numArray));
        //apply insertion sort algorithm on the array
        for(int k=1; k<numArray.length-1; k++)   {  
            int temp = numArray[k];  
            int j= k-1;  
            while(j>=0 && temp <= numArray[j])   {  
                numArray[j+1] = numArray[j];   
                j = j-1;  
            }  
            numArray[j+1] = temp;  
        }  
        //print the sorted array
        System.out.println("Sorted Array:" + Arrays.toString(numArray));
    }

    // static void swap(int[] arr,int first,int second){
    //     int temp = arr[first];
    //     arr[first] =arr[second];
    //     arr[second]= temp;
    // }
}
