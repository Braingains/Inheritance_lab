import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Sandy", "123abc", 30000.0, "Teaching Staff");
    }

    @Test
    public void hasName() {
        assertEquals("Sandy", manager.getName());
    }


}
