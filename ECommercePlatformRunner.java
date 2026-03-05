class ECommercePlatformRunner {

    public static void main(String[] args) {

        ECommercePlatform platform = new ECommercePlatform();

        platform.platformId = 201;
        platform.platformName = "ShopEasy";
        platform.websiteUrl = "www.shopeasy.com";
        platform.foundedYear = 2015;
        platform.founderName = "Rohan Gupta";
        platform.headquarters = "Bangalore";
        platform.numberOfSellers = 50000;
        platform.numberOfProducts = 200000;
        platform.numberOfCustomers = 1000000;

        platform.mobileAppAvailable = true;
        platform.paymentMethods = "UPI, Credit Card, Debit Card";
        platform.deliveryPartners = "Delhivery, BlueDart";
        platform.returnPolicy = "7 Days Return";

        platform.customerSupportNumber = 9876543210L;

        platform.emailSupport = "support@shopeasy.com";
        platform.ratingSystem = true;
        platform.productCategories = "Electronics, Fashion, Home";
        platform.warehouseLocations = 15;
        platform.internationalShipping = true;

        platform.dailyVisitors = 500000;
        platform.annualRevenue = 1200.75;

        platform.securityFeatures = "SSL, OTP Verification";
        platform.discountPrograms = true;
        platform.loyaltyPoints = true;
        platform.aiRecommendations = true;

        System.out.println("Platform Id: " + platform.platformId);
        System.out.println("Platform Name: " + platform.platformName);
        System.out.println("Website URL: " + platform.websiteUrl);
        System.out.println("Founded Year: " + platform.foundedYear);
        System.out.println("Founder Name: " + platform.founderName);
        System.out.println("Headquarters: " + platform.headquarters);
        System.out.println("Number Of Sellers: " + platform.numberOfSellers);
        System.out.println("Number Of Products: " + platform.numberOfProducts);
        System.out.println("Number Of Customers: " + platform.numberOfCustomers);
        System.out.println("Mobile App Available: " + platform.mobileAppAvailable);
        System.out.println("Payment Methods: " + platform.paymentMethods);
        System.out.println("Delivery Partners: " + platform.deliveryPartners);
        System.out.println("Return Policy: " + platform.returnPolicy);
        System.out.println("Customer Support Number: " + platform.customerSupportNumber);
        System.out.println("Email Support: " + platform.emailSupport);
        System.out.println("Rating System: " + platform.ratingSystem);
        System.out.println("Product Categories: " + platform.productCategories);
        System.out.println("Warehouse Locations: " + platform.warehouseLocations);
        System.out.println("International Shipping: " + platform.internationalShipping);
        System.out.println("Daily Visitors: " + platform.dailyVisitors);
        System.out.println("Annual Revenue: " + platform.annualRevenue);
        System.out.println("Security Features: " + platform.securityFeatures);
        System.out.println("Discount Programs: " + platform.discountPrograms);
        System.out.println("Loyalty Points: " + platform.loyaltyPoints);
        System.out.println("AI Recommendations: " + platform.aiRecommendations);
    }
}