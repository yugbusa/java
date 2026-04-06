class GoodMorning implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Good Morning");
                Thread.sleep(1000);   
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class GoodAfternoon implements Runnable {
    public void run() {
        try {
            while (true) {
                System.out.println("Good Afternoon");
                Thread.sleep(3000);   
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class GreetingThreads {
    public static void main(String[] args) {
        Runnable gm = new GoodMorning();
        Runnable ga = new GoodAfternoon();

        Thread t1 = new Thread(gm);
        Thread t2 = new Thread(ga);

        t1.start();
        t2.start();
    }
}