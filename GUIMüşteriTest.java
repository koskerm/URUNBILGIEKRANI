

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class GUIMüşteriTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class GUIMüşteriTest
{
    private DBModelMüşteri dBModelM1;
    private DBConnection dBConnec1;

    /**
     * Default constructor for test class GUIMüşteriTest
     */
    public GUIMüşteriTest()
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
