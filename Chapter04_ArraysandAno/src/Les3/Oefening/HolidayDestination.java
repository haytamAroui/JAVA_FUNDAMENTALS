package Les3.Oefening;

public enum HolidayDestination {
    AFGHANISTAN, ALBANIA, ALGERIA, ANDORRA, ANGOLA, ANTIGUA, BARBUDA, ARGENTINA, ARMENIA, Brazil;
    final HolidayDestination destination;

    HolidayDestination() {
        this.destination = this.countryInfo();
    }

    public void countryInfo(HolidayDestination destination) {

        switch (destination) {
            case AFGHANISTAN:
                System.out.println("Afghanistan in Asia");
                break;
            case ALBANIA:
                System.out.println("Albanie in Europe");
                break;
            case ALGERIA:
                System.out.println("Algeria in Africa");
                break;
            case ANDORRA:
                System.out.println("Andorra .....");
                break;
            case ANGOLA:
                System.out.println("Angola.....");
                break;
            case ANTIGUA:
                System.out.println("Antigua");
                break;
            case BARBUDA:
                System.out.println("Barbuda");
                break;
            case ARGENTINA:
                System.out.println("Argentine in south America");
                break;
            case ARMENIA:
                System.out.println("Armenia");
                break;
            case Brazil:
                System.out.println("Brazil");
                break;
            default:
                System.out.println("Unknown country.");
        }
    }
}


