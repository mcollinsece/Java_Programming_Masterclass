public class highScoreChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Matthew", calculateHighScorePosition(1500));
        displayHighScorePosition("Mark", calculateHighScorePosition(900));
        displayHighScorePosition("Luke", calculateHighScorePosition(400));
        displayHighScorePosition("John", calculateHighScorePosition(50));

    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position +
                " on the high score table.");

    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }
        else if (playerScore >= 500 && playerScore < 1000){
            return 2;
        }
        else if (playerScore >= 100 && playerScore < 500){
            return 3;
        }
        else {
            return 4;
        }

    }
}
