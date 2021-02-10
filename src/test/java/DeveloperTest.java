import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Keith", "77777", 100000.0);

    }
    @Test
    public void hasName () {
        assertEquals("Keith", developer.getName());
    }

    @Test
    public void hasNin () {
        assertEquals("77777", developer.getNin());
    }

    @Test
    public void hasSalary () {
        assertEquals(100000.0, developer.getSalary(), 0.01);
    }

    @Test
    public void raiseBy100Percent() {
        developer.raiseSalary(1.0);
        assertEquals(200000.0, developer.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        developer.payBonus();
        assertEquals(101000.0, developer.getSalary(), 0.01);
    }
}