public class MaxmimumVal2DArr {
    public static void main(String[] args) {
        int[][] arr = {
                {23,34,55},
                {46,78,90},
                {12,56,67}
        };

        int ans = maximumValueIn2DArray(arr);

        System.out.println(ans);

    }

    static int maximumValueIn2DArray(int[][] arr){
        int ans = Integer.MIN_VALUE;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] > ans){
                    ans = arr[row][col];
                }
            }
        }

        return ans;
    }
}
