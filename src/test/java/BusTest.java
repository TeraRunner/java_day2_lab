import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void createBus() {
        this.bus = new Bus("London", 1);
        this.person = new Person();
    }

    @Test
    public void busHasBeenCreated() {
        assertEquals("London", bus.getDestination());
        assertEquals(1, bus.getCapacity());
    }

    @Test
    public void busHasPassengers() {
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerList());
    }

    @Test
    public void busHasCapacity() {
        bus.addPassenger(person);
        bus.addPassenger(person);
        assertEquals(1, bus.getPassengerList());
    }

    @Test
    public void removePassengerTest() {
        bus.addPassenger(person);
        bus.removePassenger();
        assertEquals(0, bus.getPassengerList());
    }

    @Test
    public void canPickupPassenger() {
        BusStop busStop = new BusStop("London");
        busStop.addPerson(person);
        bus.pickupPassenger(busStop);
        assertEquals(1, bus.getPassengerList());
        assertEquals(0, busStop.getQueue());
    }
}
