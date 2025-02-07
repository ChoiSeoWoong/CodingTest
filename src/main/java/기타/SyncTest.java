package 기타;

public class SyncTest {
    public static void main(String[] args) {
        System.out.println("1");
        printA();
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }

    public static void printA() {
        try {
            Thread.sleep(3000);
            System.out.println("A");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
