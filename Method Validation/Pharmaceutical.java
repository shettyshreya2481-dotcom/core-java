class Pharmaceutical {

    static String medicineName;
    static String manufacturer;
    static double price;
    static int expiryYear;
    static int dosageMg;
    static int tabletCount;
    static String category;
    static boolean isPrescriptionRequired;
    static int stockQuantity;
    static double rating;

    static boolean details(String name, String company, double cost,
                           int expYear, int dose, int count,
                           String type, boolean prescription,
                           int stock, double rate) {

        boolean isMedicine = false;

        medicineName = name;
        manufacturer = company;
        price = cost;
        expiryYear = expYear;
        dosageMg = dose;
        tabletCount = count;
        category = type;
        isPrescriptionRequired = prescription;
        stockQuantity = stock;
        rating = rate;

        // Expiry check
        if (expiryYear >= 2026) {
            System.out.println("Medicine is Safe");
            isMedicine = true;
        } else {
            System.out.println("Medicine Expired");
        }

        // Price check
        if (price >= 500) {
            System.out.println("Costly Medicine");
        } else {
            System.out.println("Affordable Medicine");
        }

        // Dosage check
        if (dosageMg >= 500) {
            System.out.println("High Power Dosage");
        } else {
            System.out.println("Normal Dosage");
        }

        // Stock check
        if (stockQuantity > 0) {
            System.out.println("Stock Available");
            isMedicine = true;
        } else {
            System.out.println("Out of Stock");
        }

        // Prescription check
        if (isPrescriptionRequired) {
            System.out.println("Doctor Prescription Required");
        } else {
            System.out.println("Over The Counter Medicine");
        }

        // Rating check
        if (rating >= 4) {
            System.out.println("Top Rated Medicine");
        } else {
            System.out.println("Average Rated Medicine");
        }

        return isMedicine;
    }

    static void getDetails(String name, String company, double cost,
                           int expYear, int dose, int count,
                           String type, boolean prescription,
                           int stock, double rate) {

        Pharmaceutical.details(name, company, cost, expYear, dose, count,
                               type, prescription, stock, rate);

        System.out.println("\n------ MEDICINE DETAILS ------");
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Price: " + price);
        System.out.println("Expiry Year: " + expiryYear);
        System.out.println("Dosage: " + dosageMg + " mg");
        System.out.println("Tablet Count: " + tabletCount);
        System.out.println("Category: " + category);
        System.out.println("Prescription Required: " + isPrescriptionRequired);
        System.out.println("Stock: " + stockQuantity);
        System.out.println("Rating: " + rating);
    }
}