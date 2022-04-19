import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
@Test
public void TestJUnit() {
String str1 = "Hello, World!";
    assertEquals("Hello, World!", str1);
            
        }

    
}
