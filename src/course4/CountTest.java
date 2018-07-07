package course4;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
/**
 *
 * JUnit 注解说明：
 * 注解 	说明
 * @Test： 标识一条测试用例。 (A) (expected=XXEception.class)   (B) (timeout=xxx)
 * @Ignore: 忽略的测试用例。
 * @Before: 每一个测试方法之前运行。
 * @After :  	每一个测试方法之后运行。
 * @BefreClass 所有测试开始之前运行。
 * @AfterClass 所有测试结果之后运行。
 *
 */

/**
 * 1、在 testAdd() 用例中设置 timeout=100 , 说明的用例的运行时间不能超过 100 毫秒，
 * 但故意在用例添加 sleep() 方法休眠 101 毫秒，所以会导致用例失败。
 *
 * 2、在 Java 中被除数不能为0，所以 8⁄0 会报 ArithmeticException 异常,
 * 在 @Test 中设置 expected=ArithmeticException.class ，说明抛该异常符合预期。
 *
 * 3、@Ignore 表来标识该用例跳过，不管用例运行成功还是失败。
 */

public class CountTest {

    //验证超时
    @Test(timeout=100)
    public void testAdd() throws InterruptedException {
        Thread.sleep(101);
        new Count().add(1, 1);
    }

    //验证抛出异常
    @Test(expected=ArithmeticException.class)
    public void testDivision() {
        new Count().division(8, 0);
    }

    // 跳过该条用例
    @Ignore
    @Test
    public void testAdd2() {
        Count count = new Count();
        int result = count.add(2,2);
        assertEquals(result, 5);
    }

}
