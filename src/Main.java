public class Main {
    public static void main(String[] args) {
        int startingScore = 100;
        int pay = 1200;
        int bonus = 0;
        int result;

        if (pay > 1000) {
            bonus = pay / 100;
            result = bonus + startingScore + pay;
        } else {
            result = startingScore + pay;
        }

        System.out.println("Finish score: " + result);
        System.out.println("Bonus: " + bonus);
    }
}