class BMS implements Runnable {
    public void run() {
        while (true) {
            System.out.println("BMS College of Engineering");
            try {
                Thread.sleep(10000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class CSE extends Thread {
    public void run() {
        while (true) {
            System.out.println("CSE");
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class main {
    public static void main(String[] args) {
        Runnable r1=new BMS();
        Thread t1 = new Thread(r1);
        CSE t2 = new CSE();

        t1.start();
        t2.start();
    }
}
