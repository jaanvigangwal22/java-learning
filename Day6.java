import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        // Print numbers 1 to N.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number :");
        int n = in.nextInt();
        // for (int index = 1; index<= n; index++) {
        //     System.out.println(index);   
        // }

        //Find the sum of the first N natural numbers.
        int  sum = 0;
        for(int i = 1; i<=n;i++){
            sum= sum +i;
        }
        System.out.println(sum);

    }
    
}
