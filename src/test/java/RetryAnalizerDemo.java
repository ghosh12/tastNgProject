import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalizerDemo {
    @Test
    public void testA(){
        System.out.println("This is inside testA ");
    }
    @Test
    public void testB(){
        System.out.println("This is inside testB");
        int i =1/0;
    }
    @Test
    public void testC(){
        System.out.println("This is inside testC");
        Assert.assertTrue(false);
    }
}
