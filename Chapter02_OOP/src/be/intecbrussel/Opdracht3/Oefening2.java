package be.intecbrussel.Opdracht3;
public class Oefening2 {
    public static void main(String[] args) {
        int numGifts = 43;
        int friendShipRank = 0;
        int criticalCount = 0;
        do {
            friendShipRank++;
            if (friendShipRank == 20) {
                break;
            }
            if (friendShipRank % 5 == 0) {
                criticalCount++;
            }
            numGifts--;
        } while (numGifts > 0);
        int totalPoints = friendShipRank + (criticalCount * 2);
        System.out.println("Total points earned: " + totalPoints);
    }
}