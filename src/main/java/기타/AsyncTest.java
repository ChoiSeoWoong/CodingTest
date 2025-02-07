package 기타;

public class AsyncTest {
    public static void main(String[] args) {
        System.out.println("1");
        Thread thread = new Thread(AsyncTest::printA);
        thread.start();
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

