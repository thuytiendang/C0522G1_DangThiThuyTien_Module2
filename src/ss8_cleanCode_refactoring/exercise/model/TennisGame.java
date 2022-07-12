package ss8_cleanCode_refactoring.exercise.model;

public class TennisGame {
    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;

    public static String getScore(String firstPlayerName, String secondPlayerName, int firstScore, int secondScore) {
        String score = "";
        if (firstScore == secondScore) {
            return getScore(firstScore);
        } else if (firstScore >= 4 || secondScore >= 4) {
            return getResult(firstScore, secondScore);
        } else {
            return currentScore( firstScore, secondScore, score);
        }
    }

    /**
     *
     * @param firstScore : điểm số của người chơi 1
     * @return điểm số của người chơi thứ nhất theo cách gọi tỏng tennis
     */
    public static String getScore(int firstScore){
        switch (firstScore) {
            case LOVE:
                return "Love-All";
            case FIFTEEN:
                return "Fifteen-All";
            case THIRTY:
                return "Thirty-All";
            case FORTY:
                return "Forty-All";
            default:
                return "Deuce";
        }
    }

    /**
     *
     * @param firstScore : điểm số của nguwoif chơi 1
     * @param secondScore : điểm số của người chơi 2
     * @return kết quả là advantage hoặc win;
     */
    public static String getResult(int firstScore, int secondScore){
        int minusResult = firstScore - secondScore;
        if (minusResult == 1){
            return "Advantage player1";
        }
        else if (minusResult == -1) {
            return "Advantage player2";
        }
        else if (minusResult >= 2) {
            return "Win for player1";
        }
        else {
            return "Win for player2";
        }
    }

    /**
     *
     * @param firstScore :điểm số của người chơi thứ nhất
     * @param secondScore :điểm số của người chơi thứ hai
     * @param score : điểm ghi được hiên tại
     * @return : điểm ghi được hiên tại
     */
    public static String currentScore(int firstScore, int secondScore, String score){
        StringBuilder scoreBuilder = new StringBuilder(score);
        for (int i = 1; i < 3; i++) {
            int tempScore;
            if (i == 1) tempScore = firstScore;
            else {
                scoreBuilder.append("-");
                tempScore = secondScore;
            }
            switch (tempScore) {
                case 0:
                    scoreBuilder.append("Love");
                    break;
                case 1:
                    scoreBuilder.append("Fifteen");
                    break;
                case 2:
                    scoreBuilder.append("Thirty");
                    break;
                case 3:
                    scoreBuilder.append("Forty");
                    break;
            }
        }
        score = scoreBuilder.toString();
        return score;
    }
}
