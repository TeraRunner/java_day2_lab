import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BusStopTest {

    private BusStop busStop;

    @Before
    public void before() {
        this.busStop = new BusStop("London");
    }

    @Test
    public void hasName() {
        assertEquals("London", busStop.getName());
    }

    @Test
    public void hasQueue() {
        assertEquals(0, busStop.getQueue());
    }

    @Test
    public void addPersonToQueue() {
        Person person = new Person();
        busStop.addPerson(person);
        assertEquals(1, busStop.getQueue());
    }

    @Test
    public void removePersonFromQueue() {
        Person person = new Person();
        busStop.addPerson(person);
        busStop.removePerson();
        assertEquals(0, busStop.getQueue());
    }

}
