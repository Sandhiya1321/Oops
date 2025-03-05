 class bankAccount {
    private double balance;

    public bankAccount(double balance){
        this.balance=balance;
    }
    public void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("new balance is:"+balance);
        }
        else{
            System.out.println("invalid deposit");
        }

    }
    public void withdraw(double amount){
        if(amount>0){
            System.out.println("withdraw successful");
        }
        else{
            System.out.println("insufficient balance");
        }
    }
    public double getBalance(){
        return balance;

    }

     public static void main(String[] args) {
         bankAccount bank=new bankAccount(7000000);
         bank.getBalance();
         bank.withdraw(7000);
         bank.deposit(0);
         System.out.println("accountBalance:"+bank.getBalance());
     }

}
