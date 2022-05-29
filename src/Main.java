public class Main {
    public static void main(String[] args) {
        int startingScore = 100;
        int payScore1 = 1300;
        int payScore2 = 150;
        int bonus = 0;
        int result;

        if (payScore1 > 1000) {
            bonus = payScore1 / 100;
            result = bonus + startingScore + payScore1;
        } else {
            result = startingScore + payScore2;
        }

        System.out.println("Finish score: " + result);
        System.out.println("Bonus: " + bonus);
    }
}