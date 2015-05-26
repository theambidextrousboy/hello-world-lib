import com.evrythng.hello.world.util.HelloWorldUtil;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldUtilTest {

    @Test
    public void getHelloWorldTest(){
        Assert.assertEquals("Hello World! From Don@EVRYTHNG", HelloWorldUtil.getHelloWorld());
    }
}
