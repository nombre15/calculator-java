import javax.swing.JOptionPane;

public class java2 {

    public static void main(String[] args) {
    
        short option;
        int x;
        int y;
        int result = 0;
        float result2 = 0;

        do{
            option = Short.parseShort(JOptionPane.showInputDialog("Welcome to calculator what do want to do\n\n1. Addition \n2. Substract \n3. Multiply \n4. Divide \n5. Power \n6. Random number \n7. Square root sum \n8. Percentage \n9. Square root"  
            + "\n10. Logarithm \n11. Find minimum number \n12. Find maximum number \n0.Exit"));

            if(option > 12){
                JOptionPane.showMessageDialog(null, option + " is not a valid option, try again plz");
            }
        }while(option > 12);

        if(option == 0){

            JOptionPane.showMessageDialog(null,"Bye fucking");
            System.exit(0);
        }

        x = Integer.parseInt(JOptionPane.showInputDialog("Enter first number: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Enter second number: "));

        while (option != 0){

            switch(option){

                    case 1: result = x + y;
                        JOptionPane.showMessageDialog(null,"\n" + x + " + " + y + " = " + result);
                    break;

                    case 2: result = x - y;
                        JOptionPane.showMessageDialog(null,"\n" + x + " - " + y + " = " + result);
                    break;

                    case 3: result = x * y;
                        JOptionPane.showMessageDialog(null,"\n" + x + " x " + y + " = " + result);
                    break;

                    case 4: result2 = (float)x / y;
                        JOptionPane.showMessageDialog(null,"\n" + x + " / " + y + " = " + result2);
                    break;

                    case 5: result = (int) Math.pow(x,y);
                        JOptionPane.showMessageDialog(null,"\n" + x + " ^ " + y + " = " + result);
                    break;
                    
                    case 6: 
                        if(x > y){
                            result = (int)(Math.random()*(x-y+1)+y);
                        }
                        else if(y > x){
                            result =  (int)(Math.random()*(y-x+1)+x);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Cant generate same number idio t");
                            break;
                        }
                        JOptionPane.showMessageDialog(null,"\nThe number generated between " + x + " and " + y + " is " + result);
                    break;

                    case 7: result2 = (float) (Math.sqrt(x) + Math.sqrt(y));
                        JOptionPane.showMessageDialog(null,"\nSqrt" + x + " + " + " Sqrt" + y + " = " + result2);
                    break;

                    case 8: result2 = (x * y) / 100;
                        JOptionPane.showMessageDialog(null,"\nThe " + x + "%" + " of " + y + " is " + result2);
                    break;

                    case 9: result2 = (float) (Math.sqrt(x));
                        JOptionPane.showMessageDialog(null,"\nSqrt" + x + " = " + result2);

                        result2 = (float) (Math.sqrt(y));
                        JOptionPane.showMessageDialog(null,"\nSqrt" + y + " = " + result2);
                    break;
                    
                    case 10: result2 = (float) (Math.log(x));
                        JOptionPane.showMessageDialog(null,"\nLog" + x + " = " + result2);

                        result2 = (float) (Math.log(y));
                        JOptionPane.showMessageDialog(null,"\nLog" + y + " = " + result2);
                    break;

                    case 11: result = Math.min(x, y);
                        JOptionPane.showMessageDialog(null,"The minimum number between " + x + " & " + y + " is " + result);
                    break;
                    
                    case 12: result = Math.max(x, y);
                        JOptionPane.showMessageDialog(null,"The maximum number between " + x + " & " + y + " is " + result);
                    break;

                    default:
                        JOptionPane.showMessageDialog(null,"error wtf how you hacker");
                    break;    
            } 
        }
        System.out.println("Bye fucking");
    }    
}
