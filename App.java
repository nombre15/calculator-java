import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        
        System.out.println("Welcome to calculator what do want to do");
        System.out.println("1. Addition \n2. Substract \n3. Multiply \n4. Divide \n5. Power \n6. Random number \n7. Square root sum \n8. Percentage \n9. Square root \n10. Logarithm");
        
        short option;
        int x;
        int y;
        double x2;
        double y2;
        int result = 0;
        float result2 = 0;

        System.out.print("Your answer: ");
        option = cin.nextShort();

        while(option > 10){

            System.out.println(option + " is not a valid option, try again plz");
            option = cin.nextShort();
        }

        System.out.print("Enter first number: ");
        x = cin.nextInt();
        x2 = Double.valueOf(x);
        System.out.print("Enter second number: ");
        y = cin.nextInt();
        y2 = Double.valueOf(y);

        switch(option){

                case 1: result = x + y;
                    System.out.println("\n" + x + " + " + y + " = " + result);
                    break;

                case 2: result = x - y;
                    System.out.println("\n" + x + " - " + y + " = " + result);
                    break;

                case 3: result = x * y;
                    System.out.println("\n" + x + " x " + y + " = " + result);
                    break;

                case 4: result2 = (float)x / y;
                    System.out.println("\n" + x + " / " + y + " = " + result2);
                    break;

                case 5: result = (int) Math.pow(x,y);
                    System.out.println("\n" + x + " ^ " + y + " = " + result);
                    break;
                
                case 6: 
                
                    if(x > y){
                        result = (int)(Math.random()*(x-y+1)+y);
                    }
                    else if(y > x){
                        result =  (int)(Math.random()*(y-x+1)+x);
                    }
                    else{
                        System.out.println("Cant generate same number idio t");
                        break;
                    }
                    System.out.println("\nThe number generated between " + x + " and " + y + " is " + result);
                    break;

                case 7: result2 = (float) (Math.sqrt(x) + Math.sqrt(y));
                    System.out.println("\nSqrt" + x + " + " + " Sqrt" + y + " = " + result2);
                    break;

                case 8: result2 = (x * y) / 100;
                    System.out.println("\nThe " + x + "%" + " of " + y + " is " + result2);
                    break;

                case 9: result2 = (float) (Math.sqrt(x));
                    System.out.println("\nSqrt" + x + " = " + result2);

                    result2 = (float) (Math.sqrt(y));
                    System.out.println("\nSqrt" + y + " = " + result2);
                    break;
                
                case 10: result2 = (float) (Math.log(x));
                    System.out.println("\nLog" + x + " = " + result2);

                    result2 = (float) (Math.log(y));
                    System.out.println("\nLog" + y + " = " + result2);
                    break;
        }   
    }
}
