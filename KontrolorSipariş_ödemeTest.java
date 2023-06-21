

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class KontrolorSipariş_ödemeTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KontrolorSipariş_ödemeTest
{
    private DBModelMüşteri dBModelM1;
    private GUISipariş_ödeme gUISipar1;
    private KontrolorSipariş_ödeme kontrolo1;
    private DBModelSipariş_ödeme dBModelS1;

    /**
     * Default constructor for test class KontrolorSipariş_ödemeTest
     */
    public KontrolorSipariş_ödemeTest()
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
        dBModelM1 = new DBModelMüşteri();
        gUISipar1 = new GUISipariş_ödeme();
        kontrolo1 = new KontrolorSipariş_ödeme();
        dBModelS1 = new DBModelSipariş_ödeme();
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
