public class Account {
    int id;
    double balance;
    String userFullName;
    byte age;
    String img;


    void withdrawal(double balanceWithdrawal) {
        balance -= balanceWithdrawal;

    }

    void deposit(double balanceDeposit) {
        balance += balanceDeposit;
    }

    String getInfo() {
        return "User ID: " + id + "\n" +
                "User name: " + userFullName + "\n" +
                "User age: " + age + "\n" +
                "User balance: " + balance + " $\n" +
                "User img: " + img + "\n";
    }
}
