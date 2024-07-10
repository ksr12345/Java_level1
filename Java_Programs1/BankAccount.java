public class BankAccount {
    private double balance;
    private final int account_no;

    public BankAccount(int account_no, double balance){
        this.balance = balance;
        this.account_no = account_no;
    }

    public int getAccount_no(){
        return account_no;
    }
    public double getBalance(){
        return balance;
    }

    public void withdraw(int amt){
        balance -= amt;
    }

    public void deposit(int amt){
        balance += amt;
    }

    public static void main(String[] args){
        BankAccount acc = new BankAccount(321456785,4000.0);
        System.out.println("Account no: "+ acc.getAccount_no());
        System.out.println("Balance: "+ acc.getBalance());
        acc.withdraw(200);
        System.out.println("Balance after withdrawal: "+ acc.getBalance());
        acc.deposit(700);
        System.out.println("Balance after deposit: "+ acc.getBalance());
    }

}
