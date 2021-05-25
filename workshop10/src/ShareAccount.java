import java.util.ArrayList;
import java.util.Collections;

public class ShareAccount {

    public static Thread NewDeposit(StrangeBank account, String currency, int amount) {
        return new Thread(() -> {
            try {
                account.deposit(currency, amount);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        });
    }

    public static Thread NewWithdraw(StrangeBank account) {
        return new Thread(() -> {
            try{
                account.withdraw();
            }catch(Exception exception){
                exception.printStackTrace();
            }
        });
    }

    public static void main(String[] args)  {
        StrangeBank account = new StrangeBank();

        ArrayList<Thread> ThreadPool = new ArrayList<>();

        ThreadPool.add(NewDeposit(account, "dollar", 1));
        ThreadPool.add(NewDeposit(account, "euro", 2));
        ThreadPool.add(NewDeposit(account, "pound", 3));
        ThreadPool.add(NewWithdraw(account));
        ThreadPool.add(NewWithdraw(account));
        ThreadPool.add(NewWithdraw(account));

        Collections.shuffle(ThreadPool);

        for (Thread transaction : ThreadPool) {
            transaction.start();
        }
    }
}