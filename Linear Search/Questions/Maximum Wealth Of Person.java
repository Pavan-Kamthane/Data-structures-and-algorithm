public class QTotalWealth {
    public static void main(String[] args) {
        int[][] accounts = {

//              bank1  bank2   bank3
                {1    ,  9,     3},//person1
                {2    ,  8,     4},//person2
                {5    ,  7,     6} //person3
        };

        int ans = maximumWealth(accounts);

        System.out.println(ans);//18 third person's wealth

    }

    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;


//        for (int person = 0; person < accounts.length; person++) {
//        int sum = 0;
//            for (int account = 0; account < accounts[person].length; account++) {
//                sum+= accounts[person][account];
//            }
//        }

//        Enhanced for loop
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }


//        Now we have sum of account of person
//        check with ans
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;

    }
}
