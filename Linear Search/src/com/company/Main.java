package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] arr= {1,45,56,78,9,89,56};
        int target = 78;
        int ans = linearSearch(arr,target);
        System.out.println(ans); // 3
    }

    static int linearSearch(int[] arr, int target){

        if (arr.length == 0 ){
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
