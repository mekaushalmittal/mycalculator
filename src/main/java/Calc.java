import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.lang.Math;


public class Calc{

    double ans;
    double x, y;
    private static final Logger logger = LogManager.getLogger(Calc.class);


    static double factorial(double n) { 
        if (n < 1)
            return 1.0;

        return n*factorial(n-1); 
    }

    public double evaluate(int op, double x, double y){
        switch(op) 
        { 
            case(1): 
                ans = Math.sqrt(x);
                logger.info("[SQRT] - " + x);
                logger.info("[RESULT - SQRT] - " + ans);

                break; 
            case(2): 
                ans = factorial(x);
                logger.info("[FACTORIAL] - " + x);
                logger.info("[RESULT - FACTORIAL] - " + ans);

                break;
            case(3):
                ans = Math.log(x);
                logger.info("[LOG] - " + x);
                logger.info("[RESULT - LOG] - " + ans);

                break;
            case(4):
                ans = Math.pow(x, y);
                logger.info("[POWER] - " + x + ", " + y);
                logger.info("[RESULT - POWER] - " + ans);
                break;              

        } 
        return ans;
    }

    
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Choose operation \n1. Square Root \n2. Factorial \n3. Log (base e) \n4. Power (x^b) ");
        
        System.out.print("Choose operation : ");
        int op = scan.nextInt();
        double x = 0;
        double y = 0;
        
        if (op<4){
            System.out.print("Enter operand x: ");
            x = scan.nextDouble();
        }
        else {
            System.out.print("Enter operands x y: ");
            x = scan.nextDouble();
            y = scan.nextDouble();
        }
        
        Calc mycalc = new Calc();
        System.out.println("Your Answer: " +  mycalc.evaluate(op, x, y));
    }
}
