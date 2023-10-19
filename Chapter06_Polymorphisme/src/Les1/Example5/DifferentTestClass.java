package Les1.Example5;

public class DifferentTestClass extends TestInstanceof {
    public static void method01(TestInstanceof test){
        if (test instanceof DifferentTestClass) {
            DifferentTestClass dfc = (DifferentTestClass) test;
            System.out.println("Douwncasting work");
        }

    }
}
