import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void evalRPNTest1(){
        String[] tokens = {"2","1","+","3","*"};
        int expected = 9;
        int actual = new Solution().evalRPN(tokens);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void evalRPNTest2(){
        String[] tokens = {"4","13","5","/","+"};
        int expected = 6;
        int actual = new Solution().evalRPN(tokens);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void evalRPNTest3(){
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int expected = 22;
        int actual = new Solution().evalRPN(tokens);
        /* (9 + 3) * -11 */
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void evalRPNTest4(){
        String[] tokens = {"3","11","+","5","-"};
        int expected = 9;
        int actual = new Solution().evalRPN(tokens);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void evalRPNTest5(){
        String[] tokens = {"4","3","-"};
        int expected = 1;
        int actual = new Solution().evalRPN(tokens);

        Assert.assertEquals(expected, actual);
    }
}
