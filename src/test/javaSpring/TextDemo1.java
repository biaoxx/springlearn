import com.biao.test.Beans.AbstractBase;
import com.biao.test.Beans.Demo1;
import com.biao.test.Beans.Dog;
import com.biao.test.Beans.SomeBodyPeople;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * public class [abstract]
 * pullic enum
 * public interface
 * public @interface
 */
public class TextDemo1 {
    @Autowired
    com.biao.test.Beans.Demo1 Demo1;

    @Test
    public void nn(){
        System.out.println("jieguo"+Demo1);
    }


    /**
     * 继承同一个接口,继承同一个父类,继承同一个抽象类
     */
    @Test
    public void testAbstract(){
        SomeBodyPeople someBodyPeople = new SomeBodyPeople();
        System.out.println(someBodyPeople.name);
        System.out.println(someBodyPeople.msg);

        AbstractBase someBodyPeople2;

        someBodyPeople2 = new SomeBodyPeople();
        System.out.println(someBodyPeople2.name);

        someBodyPeople2 = new Dog();
        System.out.println(someBodyPeople2.name);

    }
}
