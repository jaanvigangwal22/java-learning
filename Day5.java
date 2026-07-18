// import java.util.Scanner;

public class Day5{
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        int x = 7;
        int y = -5;

        if(x>0 && y>0){
            System.out.println("QUADRANT 1");
        }
         if(x<0 && y>0){
            System.out.println("QUADRANT 2");
        }
         if(x<0 && y<0){
            System.out.println("QUADRANT 3");
        }
         if(x>0 && y<0){
            System.out.println("QUADRANT 3");
        }
        else if( x==0 && y==0){
            System.out.println("ORIGIN");
        }
        else{
            System.out.println("ERROR");
        }
        

        

    }
    
}
