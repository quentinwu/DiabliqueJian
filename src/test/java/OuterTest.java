/**
 * Created by quentin on 9/3/2017.
 */
import com.basics.Outer;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class OuterTest extends TestCase {
    public OuterTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite( OuterTest.class );
    }

    public void testAbc() {
        Outer outer = new Outer();
        assertEquals(outer.test(), 100);
    }
}
