class ShoeLace {

    String brand;
    String color;
    String material;
    int length;
    double price;
    boolean isElastic;
    String shape;
    String type;
    String manufacturer;
    int stock;

    ShoeLace(String brand, String color, String material, int length, double price,
             boolean isElastic, String shape, String type, String manufacturer, int stock) {

        this.brand = brand;
        this.color = color;
        this.material = material;
        this.length = length;
        this.price = price;
        this.isElastic = isElastic;
        this.shape = shape;
        this.type = type;
        this.manufacturer = manufacturer;
        this.stock = stock;
    }

    void display() {
        System.out.println(brand + " " + color + " " + material + " " + length + " " + price +
        " " + isElastic + " " + shape + " " + type + " " + manufacturer + " " + stock);
    }
}