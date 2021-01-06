import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("The Gyle", 30);
        person = new Person();
    }

    @Test
    public void busHasDestination(){
        assertEquals("The Gyle", bus.getDestinationName());
    }

    @Test
    public void busHasCapacity(){
        assertEquals(30, bus.getCapacity());
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busCanAddPassengers(){
        bus.addPassengers(person);
        assertEquals(1, bus.passengerCount());
    }
}
