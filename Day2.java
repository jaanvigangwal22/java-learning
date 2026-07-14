import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //QUESTION 1 - INPUT NAME AND PRINT ALONG WITH GREETINGS 
        System.out.print("Enter your name : ");
        String name = in.nextLine();
        System.out.println("Hello " + name);
    }
}
