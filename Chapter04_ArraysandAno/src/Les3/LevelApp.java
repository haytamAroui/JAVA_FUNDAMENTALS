package Les3;

public class LevelApp {
    public static void main(String[] args) {
        Level c2 = Level.MEDIUM;
        switch (c2) {
            case LOW:
                System.out.println("Low Level");
                break;
            case MEDIUM:
                System.out.println("Medium Level");
                break;
            case HIGH:
                System.out.println("High Level");
                break;
        }
    }
}
