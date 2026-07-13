public class Day1 {
    public static void main(String[] args) {
        
        //QUESTION 1- DECLARE VARIABLES AND PRINT THEM 
        String name = "Jaanvi Gangwal ";
        int age = 20;
        float cgpa = 7.26f;
        char grade = 'B';
        double expectedsal = 3000000.999999999;
        System.out.println("My name is " + name);
        System.out.println("My age is  " + age);
        System.out.println("My cgpa is " + cgpa);
        System.out.println("My grade  is " + grade);
        System.out.println("My salary expectations are  " + expectedsal);


        //QUESTION 2 - AREA AND PERIMETER OF RECTANGLE (LENGTH BREADTH GIVEN )
        int length = 5;
        int breadth = 10;
        int perimeter = 2 * (length + breadth);
        int area = length * breadth;
        System.out.println(" The perimeter is : " + perimeter);
        System.out.println("The area is : " + area );

        //QUESTION 3 - CONVERT TEMPERATURE FROM CELSIUS TO  FAHRENHITE
        float tempC = 32.8f;
        float tempF = (tempC * 9/5) + 32;
        System.out.println(tempC + " degree celsius is equal to this " + tempF + " Fahrenheit");

        // QUESTION 4 - SWAP TWO NUMBERS -(IMPORTANT QUESTION )
        int a= 9, b=3;
        int temp = b; // stores value of b in temp variable 
        b= a ; // b=9 ie b becomes equal to a 
        a=temp;// a= 3 ie a gets value of temp = b
        System.out.println( "Value of a =" + a + " Value of b = " + b);


        //QUESTION 5 - TAKE CHARACTER AND PRINT ITS ASCII VALUE - ( TYPECASTING )
        int charact = 'H';
        System.out.println("The ASCII value of H is :" + charact);


    }
    
}
