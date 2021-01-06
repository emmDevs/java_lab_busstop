import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }

    public String getDestinationName() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassengers(Person person) {
        if (passengerCount() < this.capacity) {
            this.passengers.add(person);
        }
//        }else{
//            System.out.println("Sorry bus is full");
//        }
    }

    public void removePassengers(Person person) {
        this.passengers.remove(person);
    }
}

