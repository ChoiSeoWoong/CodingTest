package 기타;

class Outerclass {
    static int x = 10;
    int y = 20;
    private static int z = 30;

    class Innerclass {
        void get() {
            System.out.println("x : " + x);
            System.out.println("y : " + y);
            System.out.println("z : " + z);
        }
    }
}

public class InnerclassTest {
    public static void main(String[] args) {
        // non-static
        Outerclass outerclass = new Outerclass(); //  Outerclass 객체 생성
        Outerclass.Innerclass inner = outerclass.new Innerclass(); // Outerclass 객체를 활용해서 Innerclass 객체 생성
        inner.get();

        // static
//        Outerclass.Innerclass staticInner = new Outerclass.Innerclass();
//        staticInner.get();
    }
}
