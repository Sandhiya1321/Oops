package pillars;
interface Payment {
    void pay(double amount);
}
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using UPI.");
    }
}
class PayPalPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

class PaymentSystem {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment upi = new UpiPayment();
        Payment paypal = new PayPalPayment();

        creditCard.pay(1000);
        upi.pay(500);
        paypal.pay(2000);
    }
}
