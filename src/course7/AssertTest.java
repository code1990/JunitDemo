package course7;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * assertArrayEquals(expecteds, actuals) 	查看两个数组是否相等。
 * assertEquals(expected, actual) 	查看两个对象是否相等。类似于字符串比较使用的equals()方法。
 * assertNotEquals(first, second) 	查看两个对象是否不相等。
 * assertNull(object) 	查看对象是否为空。
 * assertNotNull(object) 	查看对象是否不为空。
 * assertSame(expected, actual) 	查看两个对象的引用是否相等。类似于使用“==”比较两个对象。
 * assertNotSame(unexpected, actual) 	查看两个对象的引用是否不相等。类似于使用“!=”比较两个对象。
 * assertTrue(condition) 	查看运行结果是否为true。
 * assertFalse(condition) 	查看运行结果是否为false。
 * assertThat(actual, matcher) 	查看实际值是否满足指定的条件。
 * fail() 	让测试失败。
 */
//关于断言方法，我们前面用得最多的是 assertEquals ，用于断言两个对象是否相等。
// 这里再介绍一个 assertTrue 的使用。
public class AssertTest {

    /**
     * 判断一个数是否为素数
     */
    public static Boolean Prime(int n) {
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testPrime(){
        int n = 7;
        assertTrue(AssertTest.Prime(n));
    }

}