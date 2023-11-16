package 디자인패턴;

class Singleton {
    private static class singleInstanceHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return singleInstanceHolder.INSTANCE;
    }
}

public class 싱글톤 {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstance();
        Singleton b = Singleton.getInstance();

        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a == b);
    }
}
