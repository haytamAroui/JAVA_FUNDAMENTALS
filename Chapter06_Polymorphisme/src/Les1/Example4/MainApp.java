package Les1.Example4;

public class MainApp {
    public static void main(String[] args) {
        // Upcasting

        Parent parent = new Child();
        parent.name = "Intec Brussel";
        System.out.println(parent.name);
        parent.method();

        //Impliciet proberen te downcasten. U krijgt een compileerfout.
        //Parent cannot be converted to Les1.Example4.Child
        //Child child = new Parent();


        // Downcasting Explicitly

        Child child = (Child)parent;
        System.out.println(child.name);
        child.method();
    }
}
