import java.lang.reflect.Array;
import java.util.Random;

public class Helper{
    public void DontThrowException(){
        System.out.println("ReturnsInt execution completed");
    }

    public void ThrowException() {
        int a = 10/0;
    }
}
