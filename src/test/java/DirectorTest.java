import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    Director director;

    @Before
    public void before(){
        director = new Director("Melinda", "50505", 1000000.0, "Management Staff", 10000000.0);
    }

    @Test
    public void hasName() {
        assertEquals("Melinda", director.getName());
    }

    @Test
    public void hasNin() {
        assertEquals("50505", director.getNin());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Management Staff", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(10000000.0, director.getBudget(), 0.01);
    }

    @Test
    public void hasSalary() {
        assertEquals(1000000.0, director.getSalary(), 0.01);
    }

    @Test
    public void raiseBy100Percent() {
        director.raiseSalary(1.0);
        assertEquals(2000000.0, director.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        assertEquals(20000, director.payBonus(), 0.01);
    }


}