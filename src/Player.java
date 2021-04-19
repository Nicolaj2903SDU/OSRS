public class Player {


    // XP for levels
    private final int level99  = 13034431;    // XP needed for lvl 99
    private final int maxXPInASkill = 200000000;   // 200 mil xp          200.000.000 xp

    // The players current XP
    private int currentCookingXP = 14383042;
    private int currentFishingXP;
    private int currentFletchingXP = 13051906;
    private int currentPrayerXP = 13037141;
    private int currentMiningXP = 9643431;

    // Constructor
//    public Player (int currentCookingXP, int currentFletchingXP, int currentPrayerXP) {
//        this.currentCookingXP = currentCookingXP;
//        this.currentFletchingXP = currentFletchingXP;
//        this.currentPrayerXP = currentPrayerXP;
//    }

    // Player object
//    Player player = new Player(currentCookingXP, currentFletchingXP, currentPrayerXP);

    // Cooking
    public String cooking99 (int currentCookingXP) {
        if (currentCookingXP < level99) {
            int XPNeed = level99 - currentCookingXP;
            return  "Cooking: \n" +
                    "XP till 99: " + XPNeed + "\n";
        }
        else {
            return  "Cooking: \n" +
                    "Already level 99." +
                    "\nTotal XP: " + currentCookingXP +
                    "\nXP above level 99: " + (currentCookingXP - level99) +
                    "\nXP till 200 million: " + (maxXPInASkill-currentCookingXP) + "\n";
        }
    }

    // Fishing
    public String fishingl99 (int currentFishingXP) {
        if (currentFishingXP < level99) {
            int XPNeed = level99 - currentFishingXP;
            return  "Fishing: \n" +
                    "XP till 99: " + XPNeed + "\n";
        }
        else {
            return  "Fishing: \n" +
                    "Already level 99." +
                    "\nTotal XP: " + currentFishingXP +
                    "\nXP above level 99: " + (currentFishingXP - level99) +
                    "\nXP till 200 million: " + (maxXPInASkill-currentFishingXP) + "\n";
        }
    }

    // Fletching
    public String fletching99 (int currentFletchingXP) {
        if (currentFletchingXP < level99) {
            int XPNeed = level99 - currentFletchingXP;
            return  "Fletching: \n" +
                    "XP till 99: " + XPNeed + "\n";
        }
        else {
            return  "Fletching: \n" +
                    "Already level 99." +
                    "\nTotal XP: " + currentFletchingXP +
                    "\nXP above level 99: " + (currentFletchingXP - level99) +
                    "\nXP till 200 million: " + (maxXPInASkill-currentFletchingXP) + "\n";
        }
    }

    // Prayer
    public String prayer99 (int currentPrayerXP) {
        if (currentPrayerXP < level99) {
            int XPNeed = level99 - currentPrayerXP;
            return  "Prayer: \n" +
                    "XP till 99: " + XPNeed + "\n";
        }
        else {
            return  "Prayer: \n" +
                    "Already level 99." +
                    "\nTotal XP: " + currentPrayerXP +
                    "\nXP above level 99: " + (currentPrayerXP - level99) +
                    "\nXP till 200 million: " + (maxXPInASkill-currentPrayerXP) + "\n";
        }
    }

    // Mining
    public String mining99 (int currentMiningXP) {
        if (currentMiningXP < level99) {
            int XPNeed = level99 - currentMiningXP;
            return  "Mining: \n" +
                    "XP till 99: " + XPNeed + "\n";
        }
        else {
            return  "Mining: \n" +
                    "Already level 99." +
                    "\nTotal XP: " + currentMiningXP +
                    "\nXP above level 99: " + (currentMiningXP - level99) +
                    "\nXP till 200 million: " + (maxXPInASkill-currentMiningXP) + "\n";
        }
    }


//  -----------------------------------------

//    public int getLevel99() {
//        return level99;
//    }

    public int getCurrentCookingXP() {
        return currentCookingXP;
    }

    public void setCurrentCookingXP(int currentCookingXP) {
        this.currentCookingXP = currentCookingXP;
    }

    public int getCurrentFishingXP() {
        return currentFishingXP;
    }

    public void setCurrentFishingXP(int currentFishingXP) {
        this.currentFishingXP = currentFishingXP;
    }

    public int getCurrentFletchingXP() {
        return currentFletchingXP;
    }

    public void setCurrentFletchingXP(int currentFletchingXP) {
        this.currentFletchingXP = currentFletchingXP;
    }

    public int getCurrentPrayerXP() {
        return currentPrayerXP;
    }

    public void setCurrentPrayerXP(int currentPrayerXP) {
        this.currentPrayerXP = currentPrayerXP;
    }

    public int getCurrentMiningXP() {
        return currentMiningXP;
    }

    public void setCurrentMiningXP(int currentMiningXP) {
        this.currentMiningXP = currentMiningXP;
    }
//  ---------------------------------------
}
