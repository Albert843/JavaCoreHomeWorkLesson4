import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        System.out.print("Введите ваше имя (вкладчика): ");
        String name = scanner.nextLine();
        account.setOwner(name);

        System.out.printf("%s, введите первоначальную сумму вклада: ", name);
        int balance = scanner.nextInt();
        account.setBalance(balance);
        System.out.printf("%s, баланс вашего вклада %d руб.\n", account.getOwner(), account.getBalance());

        System.out.printf("%s, пополните ваш счет: ", account.getOwner());
        int deposit = scanner.nextInt();
        account.deposit(deposit);
        System.out.printf("%s, баланс вашего вклада %d руб.\n", account.getOwner(), account.getBalance());

        System.out.printf("%s, какую сумму вы хотите снять со счета?: ", account.getOwner());
        int withdrawal = scanner.nextInt();
        account.withdrawal(withdrawal);
        System.out.printf("%s, баланс вашего вклада %d руб. ", account.getOwner(), account.getBalance());

        scanner.close();
    }
}