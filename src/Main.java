public class Main {
    public static void main(String[] args) {

        int account = 500; //начальный счет
        int money = 1300;  //сумма пополнения

        if (money > 1000) {
            System.out.println((account + (money / 100)) + "Баланс");
            System.out.println((money / 100) + "Бонус");
        } else {
            System.out.println((money + account) + "Баланс");
        }

    }
}
}