public class BankAccount {

    int balance;
    int previousTransaction;
    String customerName;
    String customerId;

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount; // 가변 인수에 대해 연산후 값을 리턴하지는 않는 메서드
            previousTransaction = amount;
        }
    }


}
