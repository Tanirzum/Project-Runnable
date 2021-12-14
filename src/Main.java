public class Main {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello")).start();
        System.out.println("World");
        new Thread(() -> System.out.println("worlD")).start();
    }
}
