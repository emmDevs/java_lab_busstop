import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Bus bus;
    private Person person1;
    private Person person2;

    @Before
    public void before(){
        busStop = new BusStop("Ocean Terminal");
        bus = new Bus("The Gyle", 1);
        person1 = new Person();
        person2 = new Person();
    }

    @Test
    public void busStopHasName(){
        assertEquals("Ocean Terminal", busStop.getName());
    }

    @Test
    public void busStopHasEmptyQueue(){
        assertEquals(0, busStop.countQueue());
    }
}
