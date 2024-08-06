import java.util.*;

public class GCD {
  private static int gcd_naive(int a, int b) {
    
    int div = 0;
    if (a>b){
      div = a % b;
      if (div == 0){
        return b;
      }
    }
      
    else {
      
      div = b % a;
      if (div == 0){
        return a;
        }
    }
      
      while (div != 0) {

        if (a > b) {

          a = b;
          b = div;
          div = a % b;
          if (div == 0){
            return b;
            }
        } else {

          b = a;
          a = div;
          div = b % a;
          if (div == 0){
            return a;
            }
        }
      }
      return 0;
  }

  public static void main(final String args[]) {
    final Scanner scanner = new Scanner(System.in);
    final int a = scanner.nextInt();
    final int b = scanner.nextInt();

    System.out.println(gcd_naive(a, b));

  }
}
