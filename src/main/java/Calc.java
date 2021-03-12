import java.util.Scanner;

public class Calc{

    int ans;
    int x, y;

    public int add(int x, int y){
        return x+y;
    }

    public int evaluate(int op, int x, int y){
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
        int x = 0;
        int y = 0;
        
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
