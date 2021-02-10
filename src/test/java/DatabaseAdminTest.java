import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Jon", "42069", 28000.0);

    }
    @Test
    public void hasName () {
        assertEquals("Jon", databaseAdmin.getName());
    }

    @Test
    public void hasNin () {
        assertEquals("42069", databaseAdmin.getNin());
    }

    @Test
    public void hasSalary () {
        assertEquals(28000.0, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void raiseBy100Percent() {
        databaseAdmin.raiseSalary(1.0);
        assertEquals(56000.0, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        databaseAdmin.payBonus();
        assertEquals(28280.0, databaseAdmin.getSalary(), 0.01);
    }
}

