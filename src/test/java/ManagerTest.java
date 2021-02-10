import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Sandy", "123abc", 30000.0, "Management Staff");
    }

    @Test
    public void hasName() {
        assertEquals("Sandy", manager.getName());
    }

    @Test
    public void canSetName() {
        manager.setName("Bob");
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void cannotSetNameAsNull() {
        manager.setName(null);
        assertEquals("Sandy", manager.getName());
    }

    @Test
    public void hasNin() {
        assertEquals("123abc", manager.getNin());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Management Staff", manager.getDeptName());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000.0, manager.getSalary(), 0.01);
    }

    @Test
    public void cannotIncreaseSalaryByNegative() {
        manager.raiseSalary(-1.0);
        assertEquals(30000.0, manager.getSalary(), 0.1);
    }
    @Test
    public void raiseBy100Percent() {
        manager.raiseSalary(1.0);
        assertEquals(60000.0, manager.getSalary(), 0.01);
    }

    @Test
    public void payBonus() {
        manager.payBonus();
        assertEquals(30300.0, manager.getSalary(), 0.01);
    }


}
