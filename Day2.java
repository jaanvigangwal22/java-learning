import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //QUESTION 1 - INPUT NAME AND PRINT ALONG WITH GREETINGS 
        System.out.print("Enter your name : ");
        String name = in.nextLine();
        System.out.println("Hello " + name);

        // QUESTION 2 INPUT TWO NUMBERS AND PRINT THEIR SUM 
        System.out.print("Enter num1 : ");
        int x = in.nextInt();
    
        System.out.print("Enter num2 : ");
        int y = in.nextInt();
 
        System.out.println("Sum is :" + (x+y));

        // QUESTION 3 - TAKE RADIUS AND PRINT AREA OF CIRCLE
        System.out.print("Enter radius : ");
        int r = in.nextInt();
        double area = (3.14 * r * r);
        System.out.println("Area : " + area);

        //QUESTION 4 - TAKE A NUM AND PRINT SQAURE AND CUBE 
        System.out.print("Enter your number : ");
        double num = in.nextDouble();
        double square = ( num * num );
        double cube = ( square * num ); // (num * num * num )
        System.out.print(" Square is : " + square);
        System.out.print(" Cube is : " + cube);
        
    }
}
