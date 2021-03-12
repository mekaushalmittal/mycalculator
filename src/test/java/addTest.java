import org.junit.*;
import static org.junit.Assert.*;


public class addTest {

    @Test
    public void test1(){
        Calc mycalc = new Calc();
        assertEquals("3+4 Test Failed", 7, mycalc.add(3, 4), 0.001);
    }

    @Test
    public void test2(){
        Calc mycalc = new Calc();
        assertEquals("3+(-4) Test Failed", -1, mycalc.add(3, -4), 0.001);

    }

    @Test
    public void test3(){
        Calc mycalc = new Calc();
        assertEquals("(-3)+(-4) Test Failed", -7, mycalc.add(-3, -4), 0.001);

    }

}
