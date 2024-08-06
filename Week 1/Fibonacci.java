import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
  private static long calc_fib(long n) {
    ArrayList<Long> nums = new ArrayList<Long>();
    if (n <= 1)
      return n;
    else {
      for (int i = 0; i < n; i++) {
        if (i <= 1) {
          long var = 1;
          nums.add(var);
        }
        else {
          nums.add(nums.get(i - 1) + nums.get(i - 2));
        }
      }
    }
    return nums.get(nums.size()-1);
  }

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();

    System.out.println(calc_fib(n));
  }
}
