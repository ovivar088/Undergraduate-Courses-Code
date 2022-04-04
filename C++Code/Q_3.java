import java.util.*;
public class Q_3 {
  
  public static int[] twoSum(int[] numbers, int targetSum) {
      if (numbers == null || numbers.length < 2) {
        return null;
      }

      for (int i = 0; i < numbers.length; i++) {
        int diff = targetSum - numbers[i];
        for (int j = i + 1; j < numbers.length; j++) {
          if (numbers[j] == diff) {
            return new int[]{i,j};
          }
        }
      }
      return null;
  }

  public static void main(String[] args){
    
    System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));

  }
}

