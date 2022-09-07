import javax.swing.JOptionPane;

public class calculator {
    
    private int result;
    private float result2;

    public void Addition(int x, int y) {
        
        result = x + y;
        JOptionPane.showMessageDialog(null, x + " + " + y + " = " + result);
    }

    public void Substract(int x, int y) {
        
        result = x - y;
        JOptionPane.showMessageDialog(null, x + " - " + y + " = " + result);
    }

    public void Multiply(int x, int y) {
        
        result = x * y;
        JOptionPane.showMessageDialog(null, x + " x " + y + " = " + result);
    }

    public void Divide(int x, int y) {
        
        result = x / y;
        JOptionPane.showMessageDialog(null, x + " ÷ " + y + " = " + result);
    }

    public void Power(int x, int y) {
        
        result = (int) Math.pow(x,y);
        String prints = "<html>";
        prints = prints + x + "<sup>" + y + "</sup>";
        JOptionPane.showMessageDialog(null,prints + " = " + result);
    }

    public void Random(int x, int y){
        result = (int)(Math.random()*(x-y+1)+y);
        JOptionPane.showMessageDialog(null,"The number generated between " + x + " and " + y + " is " + result);
    }

    public void SquareSum(int x, int y){
        result2 = (float) (Math.sqrt(x) + Math.sqrt(y));
        JOptionPane.showMessageDialog(null,"\u221A" + x + " + " + " \u221A" + y + " = " + result2);
    }

    public void Percentage(int x, int y){
        result2 = (x * y) / 100;
        JOptionPane.showMessageDialog(null,"The " + x + "%" + " of " + y + " is " + result2);
    }

    public void Square(int x, int y){
        result2 = (float) (Math.sqrt(x));
        JOptionPane.showMessageDialog(null,"\nSqrt" + x + " = " + result2);

        result2 = (float) (Math.sqrt(y));
        JOptionPane.showMessageDialog(null,"\nSqrt" + y + " = " + result2);
    }

    public void Logarithm(int x, int y){
        result2 = (float) (Math.log(x));
        JOptionPane.showMessageDialog(null,"\nLog" + x + " = " + result2);

        result2 = (float) (Math.log(y));
        JOptionPane.showMessageDialog(null,"\nLog" + y + " = " + result2);
    }

    public void Minimum(int x, int y){
        result = Math.min(x, y);
        JOptionPane.showMessageDialog(null,"The minimum number between " + x + " & " + y + " is " + result);
    }

    public void Maximum(int x, int y){
        result = Math.max(x, y);
        JOptionPane.showMessageDialog(null,"The maximum number between " + x + " & " + y + " is " + result);
    }
}
