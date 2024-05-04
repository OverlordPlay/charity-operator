public class Main {
    public static void main(String[] args) {

        int amount = 30_000; // сумма платежа
        int x = 100; // баланс

        int y = (x + amount); // баланс + платёж
        int bonus = amount / 100; // рассчёт бонусов
        int z = (y + bonus); // баланс с бонусами


        if (amount >= 1000) {
            bonus = amount / 100;
            System.out.println("Итоговый бонус: " + bonus);
            System.out.println("Баланс: " + z);

        } else if (amount < 1000) {
            bonus = 0;
            System.out.println("Итоговый бонус: " + bonus);
            System.out.println("Баланс: " + z);
        }

    }
}