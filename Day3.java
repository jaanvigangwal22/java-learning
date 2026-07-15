import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        //QUESTION 1 - CHECK IF A NUMBER IS EVEN OR ODD 
        System.out.print("Enter your number : ");
        int n = in.nextInt();
        String result = (n % 2== 0) ? "Even":"odd"; // shorthand if else used 
        System.out.println(result);

        //QUESTION 2 = SIMPLE INTEREST 
        System.out.print(" Enter  amount , rate , time : ");
        double p = in.nextDouble(); //principal amount
        double r = in.nextDouble();// rate of interest 
        double t = in.nextDouble(); // time 

        double sI =( ( p*r*t) /100 );
        System.out.println("Simple Interest is : "  + sI );


        // QUESTION 3 - LEAP YEAR (IMP QUESTION)
        System.out.print(" Enter year :");
        int year = in.nextInt();
        boolean leap = ( year %4 == 0 && year %100!=0) || (year % 400 ==0); // year %400 checks for century years 
        System.out.println("leap year ? : " + leap);

       

    }
    
}
