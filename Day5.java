import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //QUESTION 1 - CALCULATOR 
        while(true){
            int answer = 0;
            System.out.print("Enter operator :");
            char op = in.next().trim().charAt(0);

            if(op == '+'|| op=='-' || op=='*'|| op=='/'){
                System.out.print("Enter a and b :");
                int a = in.nextInt();
                int b = in.nextInt();
                
            
                if(op == '+'){
                    answer = a+b;
                }
                if(op == '-'){
                    answer= a-b;
                }
                if (op == '*'){
                    answer = a*b;
                }
                if( op =='/'){
                    if(b!=0){
                        answer= a/b;
                    }
                    else{
                        System.out.println("Enter valid number ");
                    }
                }
            
            }
            else if( op =='x'|| op =='X'){
                break;
            }
            else{
                System.out.println("Enter Valid operator");
            }
        }
        System.out.println(answer);

    }
    
}
