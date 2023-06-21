

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class KontrolorÜrünTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KontrolorÜrünTest
{
    private KontrolorÜrün kontrolo1;
    private KontrolorSipariş_ödeme kontrolo2;
    private DBConnection dBConnec1;
    private DBModelUrun dBModelU1;
    private GUIÜrün gUIÜrün1;

    /**
     * Default constructor for test class KontrolorÜrünTest
     */
    public KontrolorÜrünTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        kontrolo1 = new KontrolorÜrün();
        kontrolo2 = new KontrolorSipariş_ödeme();
        dBConnec1 = new DBConnection();
        dBConnec1.hashCode();
        dBModelU1 = new DBModelUrun();
        gUIÜrün1 = new GUIÜrün();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
