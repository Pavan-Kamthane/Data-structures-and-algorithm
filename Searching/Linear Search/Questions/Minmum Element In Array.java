public class minmumNumberInArray {
    public static void main(String[] args) {
        int[] arr = {34,57,35,68,90,20,22};

        int ans = findMinimumNum(arr);
 
        System.out.println( ans);

    }

    static int findMinimumNum(int[] arr){
        int ans=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
                if(arr[i] < ans){
                    ans = arr[i];
                }
        }

        return ans;
    }
}
