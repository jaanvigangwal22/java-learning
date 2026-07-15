import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // QUESTION 1 - LARGEST OF 2 NUMBERS 
        System.out.print(" Enter num1 & num2 :");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        if ( num1>num2){
            System.out.println(" Num 1 is larger ");
        }
        else{
            System.out.println(" Num2 is larger ");
        }


        // QUESTION 2 - LARGEST OF THREE NUM 
        int max = 0 ;
        System.out.print(" Enter a and b and c  : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a>b) {
            max=a;
            
        }
        else{
            max=b;
        }
        if (c>max) {
            max=c;
           
        }
        System.out.println("MAX is :" + max);


        // QUESTION 3 - GRADING SYSTEM 
        int marks = 65;
        if ( marks > 90 && marks <=100){
            System.out.println("GRADE = A ");
        }
        else if ( marks > 80 && marks <=90){
            System.out.println("GRADE = B ");
        }
        else if ( marks > 70 && marks <=80){
            System.out.println("GRADE = C ");
        }
         else if ( marks > 60 && marks <=70){
            System.out.println("GRADE = D ");
        }
         else if ( marks > 50 && marks <=60){
            System.out.println("GRADE = E ");
        }
        else{
            System.out.println("FAIL");
        }


        //QUESTION 4 POSITIVE NEGATIVE OR 0 
        int p = 34 ;
        if (p<0) {
            System.out.println("Negative");
            
        }
        else if (p>0) {
            System.out.println("Positive");
            
        }
        else {
            System.out.println(" Number is 0");
        }


        //QUESTION VALID TRIANGLE 
        float ag1 = 23f , ag2 = 130f , ag3 = 30f;
        float sum = ( ag1 + ag2 + ag3);
        if (sum == 180) {
            System.out.println("Valid Triangle");
            
        }
        else{
            System.out.println("Invalid Triangle ");
        }



    }
    
}
