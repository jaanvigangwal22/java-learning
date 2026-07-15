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


        // QUESTION 4 - MINUTES IN HOURS 
        int minutes = 150 ;
        int hours = minutes / 60 ;
        float min = (minutes % 60);
        System.out.println( "hours "+ hours + " minutes :" + min);

        // QUESTION 5 - PERCENTAGE OF THREE SUBJECTS MARKS 
        System.out.print(" Enter makers of sub A , B , C : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        float per = (( a+ b+ c )/3.0f );
        System.out.println(per);


       

    }
    
}
