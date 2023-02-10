package 기타;

class ParentTest {
    public void printInt(int value) {
        System.out.println("ParentTest value = " + value);
    }

}

class ChildTest extends ParentTest {
    @Override
    public void printInt(int value) {
        System.out.println("ChildTest value = " + value);
    }
}

public class OverridingTest {
    public static void main(String[] args) {
        ParentTest parentTest = new ChildTest();
        parentTest.printInt(1);

        ChildTest childTest = new ChildTest();
        childTest.printInt(1);
    }
}
