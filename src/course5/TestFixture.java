package course5;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Test Fixture 是指一个测试运行所需的固定环境，准确的定义：
 *
 *   The test fixture is everything we need to have in place to exercise the SUT
 *
 * 在进行测试时，我们通常需要把环境设置成已知状态（如创建对象、获取资源等）来创建测试，
 * 每次测试开始时都处于一个固定的初始状态；测试结果后需要将测试状态还原，
 * 所以，测试执行所需要的固定环境称为 Test Fixture。
 * 代码中的注释已经对 @BeforeClass、 @AfterClass 、 @Before 、 @After 做了说明。
 *
 * 至于什么时候会用到这些方法跟你具体的业务用例有关，如果是 Web UI 自动化测试，
 * 可以把 浏览器驱动的定义放到 @Before 中，浏览器的关闭放到 @After 中。
 */
public class TestFixture {

    //在当前测试类开始时运行。
    @BeforeClass
    public static void beforeClass(){
        System.out.println("-------------------beforeClass");
    }

    //在当前测试类结束时运行。
    @AfterClass
    public static void afterClass(){
        System.out.println("-------------------afterClass");
    }

    //每个测试方法运行之前运行
    @Before
    public void before(){
        System.out.println("=====before");
    }

    //每个测试方法运行之后运行
    @After
    public void after(){
        System.out.println("=====after");
    }

    @Test
    public void testAdd1() {
        int result=new Count().add(5,3);
        assertEquals(8,result);
        System.out.println("test Run testadd1");
    }

    @Test
    public void testAdd2() {
        int result=new Count().add(15,13);
        assertEquals(28,result);
        System.out.println("test Run testadd2");
    }

}