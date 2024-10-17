class Producer extends Thread {
    private int item = 0;
    private boolean available = false; 
    private final int MAX_ITEMS = 10;  

    public synchronized void produce() throws InterruptedException {
        while (available) {
            wait();
        }
        if (item < MAX_ITEMS) {
            item++;
            System.out.println("Produced: " + item);
            available = true;
            notify(); 
        }
    }

    @Override
    public void run() {
        while (item < MAX_ITEMS) {
            try {
                produce();
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public synchronized void consume() throws InterruptedException {
        while (!available) {
            wait(); 
        }
        System.out.println("Consumed: " + item);
        available = false;
        notify(); 
    }

    public synchronized boolean isProductionComplete() {
        return item >= MAX_ITEMS; 
    }
}

class Consumer extends Thread {
    private Producer producer;

    public Consumer(Producer producer) {
        this.producer = producer;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (producer) {
                try {
                    if (producer.isProductionComplete()) {
                        break;
                    }
                    producer.consume();
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        System.out.println("Consumption complete.");
    }
}

class PRACT37
 {
    public static void main(String[] args) {
        Producer producer = new Producer();
        Consumer consumer = new Consumer(producer);

        producer.start();
        consumer.start();
    }
}
