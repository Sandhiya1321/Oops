package pillars;

class Restaurant {
    void placeOrder(String item) {
        System.out.println("Order placed for: " + item);
    }
    void placeOrder(String item, int quantity) {
        System.out.println("Order placed for: " + quantity + " x " + item);
    }
    void placeOrder(String item, int quantity, String instructions) {
        System.out.println("Order placed for: " + quantity + " x " + item + " with instruction: " + instructions);
    }
}

class OrderSystem {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.placeOrder("Burger");
        restaurant.placeOrder("Pizza", 2);
        restaurant.placeOrder("Pasta", 1, "Extra cheese");
    }
}
