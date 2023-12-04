public class Account {

    //region Поля
    private int balance;
    private String owner;
    //endregion

    //region Свойства
    public String getOwner() {
        return owner;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        if(balance < 0 ) {
            throw new IllegalArgumentException("Баланс не должен быть отрицательным.");
        }
        this.balance = balance;
    }
    //endregion

    //region Методы
    /**
     * Метод пополнения вклада.
     * @param money сумма пополнения.
     */
    public void deposit(int money) {
        if(money < 0){
            throw new IllegalArgumentException("Пополнение счета не должно быть отрицательным.");
        }
        int newBalance = balance + money;
        balance = newBalance;
    }

    /**
     * Метод снятия денег из вклада.
     * @param money сумма снятия.
     */
    public void withdrawal(int money) {
        if(money > balance) {
            throw new InsufficientFundsException("Невозможно выполнить операцию, мало средств на счете.");
        }
        int newBalance = balance - money;
        balance = newBalance;
    }
    //endregion
}
