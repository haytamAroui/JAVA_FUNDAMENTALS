package Opdracht1;
/*boot() dans Robot imprimera un message indiquant que le robot démarre. Cette méthode de démarrage
être appelé pendant la construction. Elle imprimera également le nom du robot (Unitname).
obot is een class met 2 constructors, 1 no args en eentje met een String als parameter (unitName). Bij
de no-args constructor geef je als unitName “nameless Robot”.
*/


public class Robot {
    private String unitName;

    public void boot() {
        this.unitName= unitName;
    }

    public String getUnitName() {
        return unitName;
    }
}
