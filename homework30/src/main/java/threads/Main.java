package threads;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Incrementor incrementor = new Incrementor(counter);
        Thread inc1 = new Thread(incrementor);
        inc1.setName("First");
        inc1.start();
        Thread inc2 = new Thread(incrementor);
        inc2.setName("Second");
        inc2.start();
        Thread inc3 = new Thread(incrementor);
        inc3.setName("Third");
        inc3.start();
        inc1.join();
        inc2.join();
        inc3.join();
    }
}

class Incrementor implements Runnable {
    Counter counter = new Counter();

    public Incrementor(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (counter.getValue() < 100) {
            synchronized (this) {

                if ((Thread.currentThread().getName().equals("First"))
                        && ((counter.getValue() % 3) == 0)) {

                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + counter.getValue());
                    this.notifyAll();
                } else if (Thread.currentThread().getName().equals("Second")
                        && ((counter.getValue() % 3) == 1)) {

                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + counter.getValue());

                    this.notifyAll();
                } else if (Thread.currentThread().getName().equals("Third")
                        && ((counter.getValue() % 3) == 2)) {

                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + counter.getValue());
                    this.notifyAll();
                } else {
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

        }

    }

}
