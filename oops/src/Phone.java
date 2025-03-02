import java.util.Scanner;

public class Phone {
    String name;
    int model;
    int price;
    String color;
    int ram;
    String quality;

    public Phone(String name, int model, int price, String color, int ram, String quality) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.color = color;
        this.ram = ram;
        this.quality = quality;
    }

    public void show() {
        System.out.println("Brand: " + name + " | Model: " + model + " | Price: " + price);
    }

    public void showDetails() {
        System.out.println("Brand: " + name + " | Model: " + model + " | Price: " + price + " | Color: " + color + " | RAM: " + ram + "GB | Quality: " + quality);
    }
}

class PhoneSolution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Phone[] sol = new Phone[5];
        sol[0] = new Phone("Mi", 7, 50000, "Black", 6, "Good");
        sol[1] = new Phone("iPhone", 3, 80000, "White", 4, "Excellent");
        sol[2] = new Phone("Oppo", 7, 60000, "Blue", 8, "Very Good");
        sol[3] = new Phone("Jio", 8, 9000, "Red", 2, "Average");
        sol[4] = new Phone("Nothing", 1, 90000, "Transparent", 12, "Premium");

        boolean exit = false;
        do {
            System.out.println("Welcome to the Phone Showroom!");
            System.out.println("1. View available mobiles");
            System.out.println("2. Select a mobile to explore further");
            System.out.println("3. Pick your preferred color");
            System.out.println("4. Review RAM and quality details");
            System.out.println("5. Examine pricing and complimentary items");
            System.out.println("6. Proceed to buy");
            System.out.println("7. Exit");
            System.out.print("Please enter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Mobiles available in the showroom:");
                    for (Phone phone : sol) {
                        phone.show();
                    }
                    break;
                case 2:
                    System.out.println("Select a mobile model you are interested in:");
                    for (int i = 0; i < sol.length; i++) {
                        System.out.println("Model " + (i + 1) + ": " + sol[i].model);
                    }

                    System.out.print("Enter your choice (1-5): ");
                    int modelChoice = scan.nextInt();
                    scan.nextLine();

                    if (modelChoice > 0 && modelChoice <= sol.length) {
                        int index = modelChoice - 1;
                        System.out.println("You have chosen Model: " + sol[index].model);
                        sol[index].showDetails();
                        System.out.print("Would you like to proceed with the purchase? (yes/no): ");
                        String buyChoice = scan.nextLine();
                        if (buyChoice.equalsIgnoreCase("yes")) {
                            System.out.println("Thank you for your purchase!");
                        } else {
                            System.out.println("Feel free to explore other options.");
                        }
                    } else {
                        System.out.println("Invalid selection. Please try again.");
                    }
                    break;
                case 3:
                    System.out.println("Choose your preferred color:");
                    for (int i = 0; i < sol.length; i++) {
                        System.out.println("Model " + (i + 1) + ": " + sol[i].model + " | Available color: " + sol[i].color);
                    }
                    break;
                case 4:
                    System.out.println("Review RAM and quality details:");
                    for (int i = 0; i < sol.length; i++) {
                        System.out.println("Model " + (i + 1) + ": " + sol[i].model + " | RAM: " + sol[i].ram + "GB | Quality: " + sol[i].quality);
                    }
                    break;
                case 5:
                    System.out.println("Examine pricing and complimentary items:");
                    for (int i = 0; i < sol.length; i++) {
                        System.out.println("Model " + (i + 1) + ": " + sol[i].model + " | Price: " + sol[i].price);
                        System.out.println("Complimentary items: Charger, Earphones, and Protective Case");
                    }
                    break;
                case 6:
                    System.out.println("Proceed to buy:");
                    System.out.print("Enter the model number you want to buy: ");
                    int buyModel = scan.nextInt();
                    scan.nextLine();
                    if (buyModel > 0 && buyModel <= sol.length) {
                        int index = buyModel - 1;
                        System.out.println("You have chosen to buy Model: " + sol[index].model);
                        System.out.println("Price: " + sol[index].price);
                        System.out.println("Complimentary items: Charger, Earphones, and Protective Case");
                        System.out.print("Confirm your purchase? (yes/no): ");
                        String confirmPurchase = scan.nextLine();
                        if (confirmPurchase.equalsIgnoreCase("yes")) {
                            System.out.println("Thank you for your purchase! Your order will be processed shortly.");
                        } else {
                            System.out.println("Purchase canceled. Feel free to explore other options.");
                        }
                    } else {
                        System.out.println("Invalid model number. Please try again.");
                    }
                    break;
                case 7:
                    exit = true;
                    System.out.println("Thank you for visiting the Phone Showroom. Have a wonderful day!");
                    break;
                default:
                    System.out.println("Invalid choice. Kindly try again.");
            }
        } while (!exit);

        scan.close();
    }
}
