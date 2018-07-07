package course6;

/**
 * （六）JUnit 用例执行顺序
 * 在运行测试的过程中，有时候需要控制用例的执行顺序。
 * @FixMethodOrder
 *
 * JUnit 通过 @FixMethodOrder 注解来控制测试方法的执行顺序的。@FixMethodOrder 注解的参数是 org.junit.runners.MethodSorters 对象,在枚举类 org.junit.runners.MethodSorters 中定义了如下三种顺序类型：
 *
 *     MethodSorters.JVM
 *
 *     Leaves the test methods in the order returned by the JVM. Note that the order from the JVM may vary from run to run (按照JVM得到的方法顺序，也就是代码中定义的方法顺序)
 *
 *     MethodSorters.DEFAULT(默认的顺序)
 *
 *     Sorts the test methods in a deterministic, but not predictable, order() (以确定但不可预期的顺序执行)
 *
 *     MethodSorters.NAME_ASCENDING
 *
 *     Sorts the test methods by the method name, in lexicographic order, with Method.toString() used as a tiebreaker (按方法名字母顺序执行)
 */
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.assertEquals;

// 按字母人顺序执行
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestRunSequence {

    @Test
    public void TestCase1() {
        assertEquals(2+2, 4);
    }

    @Test
    public void TestCase2() {
        assertEquals(2+2, 4);
    }

    @Test
    public void TestAa() {
        assertEquals("hello", "hi");
    }
}
