import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calc{

    double ans;
    double x, y;
    private static final Logger logger = LogManager.getLogger(Calc.class);

    public double add(double x, double y){
        double ans = x+y;
        logger.info("add " + x + " + " + y + " = " + ans);
        return ans;
    }

    public double evaluate(int op, double x, double y){
        switch(op) 
        { 
            case(1): 
                ans = add(1, x); 
                break; 
            case(2): 
                ans = add(x, y); 
                break;
        } 
        return ans;
    }

    
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose operation \n1. Increment \n2. Addition");
        
        int op = scan.nextInt();
        double x = 0;
        double y = 0;
        
        if (op<2){
            System.out.print("Enter operand x: ");
            x = scan.nextInt();
        }
        else {
            System.out.print("Enter operands x y: ");
            x = scan.nextInt();
            y = scan.nextInt();
        }
        
        Calc mycalc = new Calc();
        System.out.println("Your Answer: " +  mycalc.evaluate(op, x, y));
    }
}
