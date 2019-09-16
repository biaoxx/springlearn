import org.junit.Before;
import org.junit.Test;

public class TextString {
    private String name;

    @Before
    public void aaa() {
        name = "qwer";
    }

    @Test
    public void aaa1() {
        System.out.println("My word");
    }

    @Test
    public void aaa2() {
        System.out.println("my word");
    }

    @Test
    public void aaa3() {
        System.out.println("My Word");
    }

    @Test
    public void aaa4() {
        System.out.println("My Word");
        System.out.print(name);
    }

}
