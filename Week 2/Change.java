import java.util.Scanner;

public class Change {
    private static int getChange(int m) {

        int coins = 0;

        while (m > 0) {
            
            
            if (m >= 10) {
            
                m -= 10;
                coins++;
            
            }
                    
            else if (m >= 5) {
            
                m -= 5;
                coins++;
            
            }
                    
            else if (m >= 1) {
                
                m -= 1;
                coins++;
            }

        }            

        //write your code here
        return coins;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

