

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class DBConnectionTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DBConnectionTest
{
    private DBConnection dBConnec1;

    /**
     * Default constructor for test class DBConnectionTest
     */
    public DBConnectionTest()
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
