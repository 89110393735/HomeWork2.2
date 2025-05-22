//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int x = 1100;
        if (x < 1000) {
            int x1 = balance + x;
            System.out.println("Баланс телефона:" + x1);
        } else {
            int i = x + x / 100 + 1 + balance;

            System.out.println("Баланс телефона:" + i);
        }
    }
}


// Объявляете переменные для входных данных и
// параметров программы: начального счёта,
// суммы пополнения и тп

// Условным оператором проверяете, превысила ли
// сумма пополнения порог, и для этих двух разных
// сценариев рассчитываете сумму бонуса и выводите
// на экран.

