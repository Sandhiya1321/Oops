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

