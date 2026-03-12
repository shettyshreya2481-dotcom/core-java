class Racket {

    String brand;
    String color;
    String type;
    double price;
    double weight;

    // Default Constructor
    Racket() {
        brand = "Yonex";
        color = "Black";
        type = "Badminton";
        price = 2500.0;
        weight = 85.0;
    }

    // Parameterized Constructor
    Racket(String brand, String color, String type, double price, double weight) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.price = price;
        this.weight = weight;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Color: " + color + ", Type: " + type +
                ", Price: " + price + ", Weight: " + weight);
    }
}