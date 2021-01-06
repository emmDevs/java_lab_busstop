import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person1;
    private Person person2;

    @Before
    public void before(){
        bus = new Bus("The Gyle", 1);
        person1 = new Person();
        person2 = new Person();
    }

    @Test
    public void busHasDestination(){
        assertEquals("The Gyle", bus.getDestinationName());
    }

    @Test
    public void busHasCapacity(){
        assertEquals(1, bus.getCapacity());
    }

    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void busCanAddPassengers__true(){
        bus.addPassengers(person1);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busCanAddPassengers__false(){
        bus.addPassengers(person1);
        bus.addPassengers(person2);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void busCanRemovePassengers(){
        bus.addPassengers(person1);
        bus.removePassengers(person1);
        assertEquals(0, bus.passengerCount());
    }


}
