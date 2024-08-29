//import java.util.*;
public class Valid_Palindrome{
    public static boolean isPalindrome(String s) {
       int left = 0;
       int right = s.length()-1;
       if (s.length()==1){
        return true;
       }
       while(left < right){
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        left = left +1;
        right = right -1;
    }
    return true;
}


public static void main(String[] arg) {
    String[] testCase = {
      "RACEACAR",
      "A",
      "ABCDEFGFEDCBA",
      "ABC",
      "ABCBA",
      "ABBA",
      "RACEACAR"
  };
  for(int i = 0; i < 7; i++){
    if(isPalindrome(testCase[1])==true){
        System.out.println("Khanh ngu" );
    }
}
}
}