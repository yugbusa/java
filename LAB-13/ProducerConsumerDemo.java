class QueueBuffer {
    private int data;
    private boolean hasData = false;

    synchronized void produce(int value) {
        try {
            while (hasData) {
                wait();  
            }
            data = value;
            hasData = true;
            System.out.println("Producer produced: " + value);
            notify();  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized int consume() {
        int value = 0;
        try {
            while (!hasData) {
                wait();  
            }
            value = data;
            hasData = false;
            System.out.println("Consumer consumed: " + value);
            notify();  
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }
}

class Producer extends Thread {
    private QueueBuffer buffer;

    Producer(QueueBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.produce(i);
            try { Thread.sleep(500); } catch (InterruptedException e) {}
        }
    }
}

class Consumer extends Thread {
    private QueueBuffer buffer;

    Consumer(QueueBuffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            buffer.consume();
            try { Thread.sleep(800); } catch (InterruptedException e) {}
        }
    }
}

public class ProducerConsumerDemo {
    public static void main(String[] args) {
        QueueBuffer buffer = new QueueBuffer();
        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}