package Les1.Example5;

public class MainApp {
    public static void main(String[] args) {
        TestInstanceof object01 = new TestInstanceof();
        DifferentTestClass object02 = new DifferentTestClass();
        // Controleren of object01 een instanceof is van.
        System.out.println("Is Object01 an instance of TestInstanceof ? : " + (object01 instanceof TestInstanceof));
        System.out.println("Is Object02 an instance of DifferentTestClass ? : " + (object02 instanceof DifferentTestClass));

        TestInstanceof test = null;
        System.out.println("Is test an instance of TestInstanceof : " + (test instanceof TestInstanceof));


    }

}
