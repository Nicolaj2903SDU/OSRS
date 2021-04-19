import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Player player = new Player ();

        // Empty line
        System.out.println();

        // Cooking
        System.out.println(player.cooking99(player.getCurrentCookingXP()));

        // Fishing
        System.out.println(player.fishingl99(player.getCurrentFishingXP()));

        // Fletching
        System.out.println(player.fletching99(player.getCurrentFletchingXP()));

        // Prayer
        System.out.println(player.prayer99(player.getCurrentPrayerXP()));

        // Mining
        System.out.println(player.mining99(player.getCurrentMiningXP()));
    }
}
