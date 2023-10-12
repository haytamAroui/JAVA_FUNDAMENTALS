package Les3.Oefening;

//Schrijf een programma dat input vraagt naar welke dag dat het is en deze dan ook uitprint.
//
//Gebruik je enum van de vorige opdracht in combinatie met een switch statement.
public class DagenApp {
    public static void main(String[] args) {
        Dagen[] myDagArr = Dagen.values();
        for (Dagen col : myDagArr) {
            System.out.println(col+ " at index " + col.ordinal());
        }
        Dagen days = Dagen.Donderdag;
        switch (days) {
            case Maandag:
                System.out.println("Vandaag is : Maandag");
                break;
            case Dinsdag:
                System.out.println("Vandaag is : Dinsdag");
                break;
            case Woensdag:
                System.out.println("Vandaag is : Woendag");
                break;
            case Donderdag:
                System.out.println("Vandaag is : Donderdag ");
                break;
            case Vrijdag:
                System.out.println("Vandaag is : Vrijdag ");
                break;
            case Zaterdag:
                System.out.println("Vandaag is : Zaterdag ");
                break;
            case Zondag:
                System.out.println("Vandaag is : Zondag");
                break;
        }
    }

}
