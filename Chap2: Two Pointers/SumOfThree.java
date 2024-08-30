
import java.util.Arrays;
import java.util.Scanner;

//import java.util.*;

 class SumOfThree{
   public static boolean findSumOfThree(int[] nums, int target) {

    Arrays.sort(nums);

    for (int i = 0; i < nums.length ; i ++){
        int low = i+1;
        int high = nums.length - 1;
        while (low < high){
            int sum = nums[i] + nums[low] + nums[high];
            if ( sum == target ){
                return true;
            }
    
            else if (sum < target){
                low ++;
            }
            else {
                high --;
            }
        }
    }


      return false;
   }


public static void main(String[] arg) {
    int[] testCase = {
        3,7,1,2,8,4,5
  };
    Scanner sc = new Scanner(System.in);
    int target = sc.nextInt();

    System.out.print(findSumOfThree(testCase, target));
 
}
}
