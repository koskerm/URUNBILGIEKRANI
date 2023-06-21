

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class KontrolorMüşteriTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class KontrolorMüşteriTest
{
    private KontrolorMüşteri kontrolo1;
    private GUIMüşteri gUIMüşte1;
    private DBConnection dBConnec1;

    /**
     * Default constructor for test class KontrolorMüşteriTest
     */
    public KontrolorMüşteriTest()
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
        kontrolo1 = new KontrolorMüşteri();
        gUIMüşte1 = new GUIMüşteri();
        dBConnec1 = new DBConnection();
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
