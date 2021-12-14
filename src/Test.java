public class Test implements Runnable {
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread threadFirst = new Thread(new Test());
        threadFirst.start();
        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
