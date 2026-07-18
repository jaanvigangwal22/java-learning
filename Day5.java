import java.util.Scanner;

public class Day5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int x = 7;
        // int y = -5;

        // if(x>0 && y>0){
        //     System.out.println("QUADRANT 1");
        // }
        //  if(x<0 && y>0){
        //     System.out.println("QUADRANT 2");
        // }
        //  if(x<0 && y<0){
        //     System.out.println("QUADRANT 3");
        // }
        //  if(x>0 && y<0){
        //     System.out.println("QUADRANT 3");
        // }
        // else if( x==0 && y==0){
        //     System.out.println("ORIGIN");
        // }
        // else{
        //     System.out.println("ERROR");
        // }
        System.out.print("enter day:");
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                
                break;
                case 2:
                System.out.println("Tuesday");
                
                break;
                 case 3:
                System.out.println("wednesday");
                
                break;
                 case 4:
                System.out.println("Thursday");
                
                break;
                 case 5:
                System.out.println("Friday");
                
                break;
                 case 6:
                System.out.println("Saturday");
                
                break;
                 case 7:
                System.out.println("Sunday");
                
                break;
                
        
            default:
                System.out.println("Enter day .");
            
                break;
        }

        
        

        

    }
    
}
