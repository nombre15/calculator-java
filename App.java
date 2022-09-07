import javax.swing.JOptionPane;

public class java2 {

    public static void main(String[] args) {
    
        short option;
        int x;
        int y;
        calculator result = new calculator();

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

            switch(option){

                    case 1: result.Addition(x, y);
                    break;

                    case 2: result.Substract(x, y);
                    break;

                    case 3: result.Multiply(x, y);
                    break;

                    case 4: result.Divide(x, y);
                    break;

                    case 5: result.Power(x, y);
                    break;
                    
                    case 6: 
                        if(x > y){
                            result.Random(x, y);
                        }
                        else if(y > x){
                            result.Random(y, x);
                        }
                        else{
                            JOptionPane.showMessageDialog(null,"Cant generate same number idio t");
                            break;
                        }
                    break;

                    case 7: result.SquareSum(x, y);
                    break;

                    case 8: result.Percentage(x, y);
                    break;

                    case 9: result.Square(x, y);
                    break;
                    
                    case 10: result.Logarithm(x, y);
                    break;

                    case 11: result.Maximum(x, y);
                    break;
                    
                    case 12: result.Minimum(x, y);
                    break;

                    default:
                        JOptionPane.showMessageDialog(null,"error wtf how you hacker");
                    break;    
            } 
        System.out.println("Bye fucking");
    }    
}
