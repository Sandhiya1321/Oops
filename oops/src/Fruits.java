import java.util.Scanner;

class Fruits {
    private int fruitID;
    private String name;
    private int price;
    private int rating;

    public Fruits(int fruitID, String name, int price, int rating) {
        this.fruitID = fruitID;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int getFruitID() {
        return fruitID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public static Fruits findMaximumPriceByRating(Fruits[] fruits, int rate) {
        Fruits maxPriceFruit = null;
        for (Fruits fruit : fruits) {
            if (fruit.getRating() == rate) {
                if (maxPriceFruit == null || fruit.getPrice() > maxPriceFruit.getPrice()) {
                    maxPriceFruit = fruit;
                }
            }
        }
        return maxPriceFruit;
    }
}

class SolutionFruits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Fruits[] fru = new Fruits[5];
        for (int i = 0; i < fru.length; i++) {
            System.out.print("Enter the ID: ");
            int fruitID = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter the name: ");
            String fruitName = scan.nextLine();
            System.out.print("Enter the price: ");
            int price = scan.nextInt();
            scan.nextLine();
            System.out.print("Enter the rating: ");
            int rating = scan.nextInt();
            scan.nextLine();

            fru[i] = new Fruits(fruitID, fruitName, price, rating);
        }
        System.out.print("Enter the expected rating: ");
        int rate = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter the expected fruit name: ");
        String name = scan.nextLine();

        Fruits res = Fruits.findMaximumPriceByRating(fru, rate);
        if (res != null && res.getName().equalsIgnoreCase(name)) {
            System.out.println("Fruit ID: " + res.getFruitID() + " | Name: " + res.getName() + " | Price: " + res.getPrice() + " | Rating: " + res.getRating());
        } else {
            System.out.println("No such fruit.");
        }

        scan.close();
    }
}
