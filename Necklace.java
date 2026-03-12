class Necklace {

    String brand;
    String type;
    String material;
    String color;
    double price;
    double weight;
    int length;
    boolean isGold;
    boolean isSilver;
    String design;
    String occasion;
    int warranty;
    boolean isAdjustable;
    String manufacturer;
    int stock;
    String shape;
    boolean isHandmade;
    String country;
    String quality;
    int rating;

    Necklace(String brand, String type, String material, String color, double price,
             double weight, int length, boolean isGold, boolean isSilver, String design,
             String occasion, int warranty, boolean isAdjustable, String manufacturer,
             int stock, String shape, boolean isHandmade, String country, String quality,
             int rating) {

        this.brand = brand;
        this.type = type;
        this.material = material;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.length = length;
        this.isGold = isGold;
        this.isSilver = isSilver;
        this.design = design;
        this.occasion = occasion;
        this.warranty = warranty;
        this.isAdjustable = isAdjustable;
        this.manufacturer = manufacturer;
        this.stock = stock;
        this.shape = shape;
        this.isHandmade = isHandmade;
        this.country = country;
        this.quality = quality;
        this.rating = rating;
    }

    void display() {
        System.out.println(brand + " " + type + " " + material + " " + color + " " + price + " " +
        weight + " " + length + " " + isGold + " " + isSilver + " " + design + " " + occasion + " " +
        warranty + " " + isAdjustable + " " + manufacturer + " " + stock + " " + shape + " " +
        isHandmade + " " + country + " " + quality + " " + rating);
    }
}