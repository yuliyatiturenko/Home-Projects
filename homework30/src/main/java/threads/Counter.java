package threads;

public class Counter {

    private int value;


    public void increment() {
        synchronized (Counter.class) {
            value++;
        }
    }

    public int getValue() {
        return value;
    }

}
