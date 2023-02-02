import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account[] accounts = new Account[10];
        Account account1 = new Account();
        account1.id = 1;
        account1.userFullName = "Sanzhar Abdymomunov";
        account1.age = 19;
        account1.balance = 10000;
        account1.img = "Cute guy ;)";
        account1.getInfo();

        accounts[0] = account1;

        Account account2 = new Account();
        account2.id = 2;
        account2.userFullName = "Tilek uulu Ernazar";
        account2.age = 19;
        account2.balance = 13000;
        account2.img = "Truda is a loving guy :)";
        account2.getInfo();
        accounts[1] = account2;

        Account account3 = new Account();
        account3.id = 3;
        account3.userFullName = "Nurseit Sadirov";
        account3.age = 17;
        account3.balance = 8420;
        account3.img = "He also tries to keep up :)";
        account3.getInfo();
        accounts[2] = account3;

        for (int i = 0; i < accounts.length - 1; i++) {
            System.out.println(accounts[i].getInfo());
            if (i == 2) {
                break;
            }
        }


        boolean trueOrFalse = true;
        while (trueOrFalse) {
            System.out.println("Select user accounts");
            int selectUser = new Scanner(System.in).nextInt();
            switch (selectUser) {
                case 1 -> {
                    System.out.println("Deposit: 1            Withdrawal: 2");
                    int selectMode = new Scanner(System.in).nextInt();
                    switch (selectMode) {
                        case 1 -> {
                            System.out.println("Select mode \n1: Top up your account from another account           2:Top up your account with cash");
                            int selectMode1 = new Scanner(System.in).nextInt();
                            switch (selectMode1) {
                                case 1 -> {
                                    System.out.println("Select User ID ");
                                    for (int j = 0; j < accounts.length - 1; j++) {
                                        System.out.println(accounts[j].userFullName + "\n" + accounts[j].id + "\n");
                                        if (j == 2) {
                                            break;
                                        }
                                    }
                                    System.out.println("Select ID ");
                                    int selectID = new Scanner(System.in).nextInt();
                                    if (selectID != 1) {
                                        switch (selectID) {
                                            case 2 -> {
                                                System.out.println("Enter the amount");
                                                int cash = new Scanner(System.in).nextInt();
                                                account2.withdrawal(cash);
                                                account1.deposit(cash);
                                                System.out.println("New balance: " + account1.balance);
                                            }
                                            case 3 -> {
                                                System.out.println("Enter the amount");
                                                int cash = new Scanner(System.in).nextInt();
                                                account3.withdrawal(cash);
                                                account1.deposit(cash);
                                                System.out.println("New balance: " + account1.balance);
                                            }
                                        }
                                    } else {
                                        System.out.println("Choose a different ID");
                                    }
                                }//case 1 SelectMode1
                                case 2 -> {
                                    System.out.println("Enter the amount");
                                    int cash = new Scanner(System.in).nextInt();
                                    account1.deposit(cash);
                                    System.out.println("New balance: " + account1.balance);

                                } //case 2 SelectMode1
                            }//swichSelectMode 1

                        }//Case 1 SelectMode
                        case 2 -> {
                            System.out.println("Select mode\nTransfer to another account: 1        Withdraw cash: 2");
                            int selectModeWithdraw = new Scanner(System.in).nextInt();
                            switch (selectModeWithdraw) {
                                case 1 -> {
                                    System.out.println("You have chosen to 'transfer to another account'");
                                    System.out.println("Select account ID");
                                    for (int j = 0; j < accounts.length; j++) {
                                        System.out.println(accounts[j].id);
                                        if (j == 2){
                                            break;
                                        }
                                    }
                                    int selectAccountId = new Scanner(System.in).nextInt();
                                    switch (selectAccountId) {
                                        case 2 -> {
                                            System.out.println("Enter the amount");
                                            int cashAmount = new Scanner(System.in).nextInt();
                                            account1.withdrawal(cashAmount);
                                            account2.deposit(cashAmount);
                                            System.out.println("New balance " + account1.balance);
                                        }
                                        case 3 -> {
                                            System.out.println("Enter the amount");
                                            int cashAmount = new Scanner(System.in).nextInt();
                                            account1.withdrawal(cashAmount);
                                            account3.deposit(cashAmount);
                                            System.out.println("New balance " + account1.balance);
                                        }
                                    }
                                }
                                case 2 -> {
                                    System.out.println("Have you decided to withdraw cash\nEnter the amount");
                                    int cashAmount = new Scanner(System.in).nextInt();
                                    account1.withdrawal(cashAmount);
                                    System.out.println("New balance: " + account1.balance);
                                }
                            }
                        }
                    }
                }//case 1 SELECTUSER
                case 2 -> {
                    System.out.println("Deposit: 1            Withdrawal: 2");
                    int selectMode = new Scanner(System.in).nextInt();
                    switch (selectMode) {
                        case 1 -> {
                            System.out.println("Select mode \n1: Top up your account from another account           2:Top up your account with cash");
                            int selectMode2 = new Scanner(System.in).nextInt();
                            switch (selectMode2) {
                                case 1 -> {
                                    System.out.println("Select User ID ");
                                    for (int k = 0; k < accounts.length; k++) {
                                        System.out.println(accounts[k].userFullName + "\n" + accounts[k].id + "\n");
                                        if (k == 2){
                                            break;
                                        }
                                    }
                                    System.out.println("Select ID ");
                                    int selectID = new Scanner(System.in).nextInt();
                                    if (selectID != 2 ) {
                                        switch (selectID) {
                                            case 1 -> {
                                                int cash = new Scanner(System.in).nextInt();
                                                account1.withdrawal(cash);
                                                account2.deposit(cash);
                                                System.out.println("New balance: " + account2.balance);
                                            }
                                            case 3 -> {
                                                int cash = new Scanner(System.in).nextInt();
                                                account3.withdrawal(cash);
                                                account2.deposit(cash);
                                                System.out.println("New balance: " + account2.balance);
                                            }
                                        }
                                    }else {
                                        System.out.println("Choose a different ID");
                                    }
                                }//case 1 SelectMode1
                                case 2 -> {
                                    System.out.println("Enter the amount");
                                    int cash = new Scanner(System.in).nextInt();
                                    account2.deposit(cash);
                                    System.out.println("New balance: " + account2.balance);

                                } //case 2 SelectMode1
                            }//swichSelectMode 1

                        }//Case 1 SelectMode
                        case 2 -> {
                            System.out.println("Select mode\nTransfer to another account: 1        Withdraw cash: 2");
                            int selectModeWithdraw = new Scanner(System.in).nextInt();
                            switch (selectModeWithdraw) {
                                case 1 -> {
                                    System.out.println("You have chosen to 'transfer to another account'");
                                    System.out.println("Select account ID");
                                    for (int j = 0; j < accounts.length; j++) {
                                        System.out.println(accounts[j].id);
                                        if (j == 2){
                                            break;
                                        }
                                    }
                                    int selectAccountId = new Scanner(System.in).nextInt();
                                    switch (selectAccountId) {
                                        case 1 -> {
                                            System.out.println("Enter the amount");
                                            int cashAmount = new Scanner(System.in).nextInt();
                                            account2.withdrawal(cashAmount);
                                            account1.deposit(cashAmount);
                                            System.out.println("New balance " + account2.balance);
                                        }
                                        case 3 -> {
                                            System.out.println("Enter the amount");
                                            int cashAmount = new Scanner(System.in).nextInt();
                                            account2.withdrawal(cashAmount);
                                            account3.deposit(cashAmount);
                                            System.out.println("New balance " + account2.balance);
                                        }
                                    }
                                }
                                case 2 -> {
                                    System.out.println("Have you decided to withdraw cash\nEnter the amount");
                                    int cashAmount = new Scanner(System.in).nextInt();
                                    account2.withdrawal(cashAmount);
                                    System.out.println("New balance: " + account2.balance);
                                }
                            }
                        }
                    }
                } //case2 SELECTUSER
                case 3 -> {
                    System.out.println("Deposit: 1            Withdrawal: 2");
                    int selectMode = new Scanner(System.in).nextInt();
                    switch (selectMode) {
                        case 1 -> {
                            System.out.println("Select mode \n1: Top up your account from another account           2:Top up your account with cash");
                            int selectMode2 = new Scanner(System.in).nextInt();
                            switch (selectMode2) {
                                case 1 -> {
                                    System.out.println("Select User ID ");
                                    for (int k = 0; k < accounts.length; k++) {
                                        System.out.println(accounts[k].userFullName + "\n" + accounts[k].id + "\n");
                                        if (k == 2){
                                            break;
                                        }
                                    }
                                    System.out.println("Select ID ");
                                    int selectID = new Scanner(System.in).nextInt();
                                    switch (selectID) {
                                        case 2 -> {
                                            int cash = new Scanner(System.in).nextInt();
                                            account1.withdrawal(cash);
                                            account3.deposit(cash);
                                            System.out.println("New balance: " + account3.balance);
                                        }
                                        case 3 -> {
                                            int cash = new Scanner(System.in).nextInt();
                                            account2.withdrawal(cash);
                                            account3.deposit(cash);
                                            System.out.println("New balance: " + account3.balance);
                                        }
                                    }
                                }//case 1 SelectMode1
                                case 2 -> {
                                    System.out.println("Enter the amount");
                                    int cash = new Scanner(System.in).nextInt();
                                    account3.deposit(cash);
                                    System.out.println("New balance: " + account3.balance);

                                } //case 2 SelectMode1
                            }//swichSelectMode 1

                        }//Case 1 SelectMode
                        case 2 -> {
                            System.out.println("Select mode\nTransfer to another account: 1        Withdraw cash: 2");
                            int selectModeWithdraw = new Scanner(System.in).nextInt();
                            switch (selectModeWithdraw) {
                                case 1 -> {
                                    System.out.println("You have chosen to 'transfer to another account'");
                                    System.out.println("Select account ID");
                                    for (int j = 0; j < accounts.length; j++) {
                                        System.out.println(accounts[j].id);
                                        if (j == 2){
                                            break;
                                        }
                                    }
                                    int selectAccountId = new Scanner(System.in).nextInt();
                                    switch (selectAccountId) {
                                        case 1 -> {
                                            System.out.println("Enter the amount");
                                            int cashAmount = new Scanner(System.in).nextInt();
                                            account3.withdrawal(cashAmount);
                                            account1.deposit(cashAmount);
                                            System.out.println("New balance " + account3.balance);
                                        }
                                        case 3 -> {
                                            System.out.println("Enter the amount");
                                            int cashAmount = new Scanner(System.in).nextInt();
                                            account3.withdrawal(cashAmount);
                                            account2.deposit(cashAmount);
                                            System.out.println("New balance " + account3.balance);
                                        }
                                    }
                                }
                                case 2 -> {
                                    System.out.println("Have you decided to withdraw cash\nEnter the amount");
                                    int cashAmount = new Scanner(System.in).nextInt();
                                    account3.withdrawal(cashAmount);
                                    System.out.println("New balance: " + account3.balance);
                                }
                            }
                        }
                    }
                }
            }

        }
    }


    }
