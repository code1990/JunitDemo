package course3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class CountTest {

    @Test
    public void testAdd() {
        Count count = new Count();
        int result = count.add(2,2);
        System.out.println(result);
        assertEquals(result, 3);
    }

}