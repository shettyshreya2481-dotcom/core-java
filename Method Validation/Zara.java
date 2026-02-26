class Zara {

    static String brand;
    static String type;
    static String size;
    static String color;
    static double price;
    static double discount;
    static boolean isOnSale;
    static String fabric;
    static int qualityRating;
    static boolean isBranded;
    static int stockQuantity;
    static String occasionType;

    static boolean details(String b, String t, String s, String c,
                           double p, double d, boolean sale,
                           String f, int rating, boolean branded,
                           int stock, String occasion) {

        boolean isCloth = false;

        brand = b;
        type = t;
        size = s;
        color = c;
        price = p;
        discount = d;
        isOnSale = sale;
        fabric = f;
        qualityRating = rating;
        isBranded = branded;
        stockQuantity = stock;
        occasionType = occasion;

        // Price check
        if (price >= 2000) {
            System.out.println("Premium Cloth");
            isCloth = true;
        } else {
            System.out.println("Budget Cloth");
        }

        // Discount check
        if (discount >= 50) {
            System.out.println("Mega Sale");
            isCloth = true;
        } else {
            System.out.println("Regular Discount");
        }

        // Fabric check
        if (fabric.equals("Cotton")) {
            System.out.println("Summer Wear");
            isCloth = true;
        } else {
            System.out.println("All Season Wear");
        }

        // Quality check
        if (qualityRating >= 4) {
            System.out.println("High Quality");
            isCloth = true;
        } else {
            System.out.println("Average Quality");
        }

        // Stock check
        if (stockQuantity > 0) {
            System.out.println("In Stock");
            isCloth = true;
        } else {
            System.out.println("Out of Stock");
        }

        // Brand check
        if (isBranded) {
            System.out.println("Branded Cloth");
        } else {
            System.out.println("Non-Branded Cloth");
        }

        // Occasion check
        if (occasionType.equals("Party")) {
            System.out.println("Party Wear");
        } else if (occasionType.equals("Formal")) {
            System.out.println("Formal Wear");
        } else {
            System.out.println("Casual Wear");
        }

        return isCloth;
    }

    static void getDetails(String b, String t, String s, String c,
                           double p, double d, boolean sale,
                           String f, int rating, boolean branded,
                           int stock, String occasion) {

        Zara.details(b, t, s, c, p, d, sale, f, rating, branded, stock, occasion);

        System.out.println("\n---- CLOTH DETAILS ----");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("On Sale: " + isOnSale);
        System.out.println("Fabric: " + fabric);
        System.out.println("Quality Rating: " + qualityRating);
        System.out.println("Branded: " + isBranded);
        System.out.println("Stock: " + stockQuantity);
        System.out.println("Occasion: " + occasionType);
    }
}