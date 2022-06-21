public class Main {

    public static void main(String[] args) {
        int balance = 100;
        int amount = 12_431;
        int bonus;
        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int totalAmount = balance + amount + bonus;

        System.out.println("на счете: " + totalAmount);
        System.out.println("бонус:" + bonus);
    }
}