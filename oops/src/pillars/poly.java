package pillars;

class Pay {
    void processPayment(double amount) {
        System.out.println("Processing payment of $" + amount);
    }
}
class CreditCard extends Pay {
    @Override
    void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card.");
    }
}

class PayPal extends Pay {
    @Override
    void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using PayPal.");
    }
}

class Upi extends Pay {
    @Override
    void processPayment(double amount) {
        System.out.println("Paid $" + amount + " using UPI.");
    }
}

class ECommercePlatform {
    public static void main(String[] args) {
        Pay payment1 = new CreditCard();
        Pay payment2 = new PayPal();
        Pay payment3 = new Upi();

        payment1.processPayment(1000);
        payment2.processPayment(500);
        payment3.processPayment(300);
    }
}