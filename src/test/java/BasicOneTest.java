/**
 * Created by quentin on 9/3/2017.
 */
import com.annotation.MyAnno;
import com.basics.BasicOne;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Unit test for simple Parent class.
 */
public class BasicOneTest
        extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public BasicOneTest(String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( BasicOneTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        boolean b = true;
        BasicOne basicOne = new BasicOne(b);
        assertTrue(basicOne.getIndicator());
    }

    /**
     * !!!!!!!! Important !!!!!!!!!!!!!!!
     * This shows how reflection works
     */
    public void testAnno() {
        boolean b = true;
        BasicOne basicOne = new BasicOne(b);
        Class<?> cls = basicOne.getClass();

        try {
            Method m = cls.getMethod("getIndicator");
            System.out.println("Specific Method: " + m.getName() + " " + m.getReturnType());
        }
        catch(NoSuchMethodException exc) {
            System.out.println("No method " + exc);
        }

        for(Method m: cls.getDeclaredMethods()) {
            System.out.println("MMMMMMM " + m.getName());
            for(Parameter p : m.getParameters()) {
                System.out.println("Parameter " + p.getName() + " " + p.getType());
            }
            for(Annotation annotation : m.getDeclaredAnnotations()) {
                System.out.println("Annotation " + annotation.toString());
            }
            MyAnno myAnno = m.getAnnotation(MyAnno.class);
            try {
                System.out.println("JJJ anno " + myAnno.str() + " " + myAnno.val());
            }
            catch(NullPointerException exc) {
                System.out.println("No anno " + exc);
            }
        }
    }
}
