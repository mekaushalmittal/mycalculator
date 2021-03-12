import org.junit.*;
import static org.junit.Assert.*;


public class calcTest {

    @Test
    public void test1(){
        Calc mycalc = new Calc();
        assertEquals("sqrt Test Failed", 5, mycalc.evaluate(1, 25, 0), 0.001);
    }

    @Test
    public void test2(){
        Calc mycalc = new Calc();
        assertEquals("factorial Test Failed", 720, mycalc.evaluate(2, 6, 0), 0.001);
    }

    @Test
    public void test3(){
        Calc mycalc = new Calc();
        assertEquals("ln Test Failed", 2.30258509, mycalc.evaluate(3, 10, 0), 0.001);
    }

    @Test
    public void test4(){
        Calc mycalc = new Calc();
        assertEquals("pow Test Failed", 64, mycalc.evaluate(4, 4, 3), 0.001);
    }


}
