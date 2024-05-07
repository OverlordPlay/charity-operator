public class Main {
    public static void main(String[] args) {

        int amount = 30_000; // сумма платежа
        int score = 100; // баланс
        int bonus = amount / 100; // рассчёт бонусов

        if (amount < 1000) {
            bonus = 0;
        }

        int total = (score + bonus + amount); // баланс с бонусами

        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Баланс: " + total);


    }
}