//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int add  = 1100;
        if (add < 1000) {
            int newBalance = balance + add;
            System.out.println("Баланс телефона:" + newBalance);
        } else {
            int bonusBalance = add / 100 + (balance + add);
            System.out.println("Баланс телефона:" + bonusBalance);
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

