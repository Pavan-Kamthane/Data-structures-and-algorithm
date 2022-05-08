import java.util.Arrays;

public class SearchCharInString {
    public static void main(String[] args) {

//        Here, in this code we take input a string and target , and computer will tell us weather target is exist in  string or not ok.
        String name = "PavanK";
        char target = 'v';
        System.out.println(search(name,target));//True
        System.out.println(Arrays.toString(name.toCharArray()));//[P, a, v, a, n, K]

    }

    static boolean search(String str, char target){

        if(str.length() == 0){
//            in above line we have written str.length() but in array we write it as arr.length we did not write bracket here but in str.length() bracket present bcoz it is function
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }

}
