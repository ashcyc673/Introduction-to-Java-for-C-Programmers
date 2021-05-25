public class StrangeBank {
    private int balance;
    private String currency;

    public StrangeBank() {
        balance = 0;
        currency = "";
    }

    public synchronized void withdraw() throws InterruptedException {
        while (this.balance == 0) {
            System.out.println("***Warning*** Zero balance!! ***Warning***");
            wait();
        }
        this.balance = 0;
        notify();
        System.out.println("You have successfully withdrew the money");
    }

    public synchronized void deposit(String currency, int amount) throws InterruptedException {
        while (this.balance != 0) {
            if (!this.currency.equals(currency)) {
                System.out.println("***Warning*** Different type currency!! ***Warning***");
                wait();
            }
        }
        if (!this.currency.equals(currency))
            this.currency = currency;
        this.balance += amount;
        notify();
        display(currency, amount);
    }

    public void display(String currency, int amount){

            switch (currency) {
            case "dollar" -> System.out.print(" $ ");
            case "euro" -> System.out.print(" € ");
            case "pound" -> System.out.print(" £ ");
            default -> System.out.println("***Warning*** Unsupported Currency Type ***Warning***");
        }
        System.out.print(amount);
        System.out.println(" has been deposited. ");
    }
}