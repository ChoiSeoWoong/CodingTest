package 기타;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLockTest {

    static ReentrantLock lock1 = new ReentrantLock();
    static ReentrantLock lock2 = new ReentrantLock();

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        SecondThread secondThread = new SecondThread();

        firstThread.start();
        secondThread.start();
    }

    private static class FirstThread extends Thread {
        @Override
        public void run() {
            lock1.lock();
            System.out.println("First thread는 object1의 lock을 획득했습니다.");

//            System.out.println("First thread는 object2의 lock을 획득해야 합니다. 따라서 대기합니다.");

            try {
                if (lock2.tryLock(2000, TimeUnit.MILLISECONDS)) {
                    try {  //lock을 획득해야 실행되어야하는 로직
                        System.out.println("실행");
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        lock2.unlock();
                        System.out.println("First thread는 lock을 획득했습니다.");
                    }
                } else {
                    System.out.println("교착상태가 발생했습니다! ");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock1.unlock();
            }

            System.out.println("First thread 종료");
        }
    }

    private static class SecondThread extends Thread {
        @Override
        public void run() {
            lock2.lock();
            System.out.println("Second thread는 object2의 lock을 획득했습니다.");

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                if (lock1.tryLock(2000, TimeUnit.MILLISECONDS)) {
                    try { //lock을 획득해야 실행되어야하는 로직
                        System.out.println("실행");
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        lock1.unlock();
                        System.out.println("Second thread는 lock을 획득했습니다.");
                    }
                } else {
                    System.out.println("교착상태가 발생했습니다 ! 타임아웃을 실행합니다.");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock2.unlock();
            }

            System.out.println("Second thread 종료");
        }
    }
}
