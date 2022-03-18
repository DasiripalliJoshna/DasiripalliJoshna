import  java.util.*;

class Bank1 {
    public static void main(String[] args) {

        BankA B1 = new BankA();
        B1.getBalance();
        BankB B2 = new BankB();
        B2.getBalance();
        BankC B3 = new BankC();
        B3.getBalance();
    }
}

    interface Bank {
        public void getBalance();
    }
    class BankA implements Bank {
        public void getBalance() {
            System.out.println("amount deposited $100");

        }
    }
    class BankB implements Bank {
        public void getBalance() {
            System.out.println("amount deposited $150");
        }
    }
    class BankC implements Bank {
        public void getBalance() {
            System.out.println("amount deposited $200");
        }
    }

