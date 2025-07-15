package pillars;

class House {
    String color;
    int numRooms;
    public House(String color, int numRooms) {
        this.color = color;
        this.numRooms = numRooms;
    }
    public void showDetails() {
        System.out.println("House Color: " + color + ", Number of Rooms: " + numRooms);
    }

    public static void main(String[] args) {
        House house1 = new House("Blue", 3);
        House house2 = new House("Red", 5);

        house1.showDetails();
        house2.showDetails();
    }
}
