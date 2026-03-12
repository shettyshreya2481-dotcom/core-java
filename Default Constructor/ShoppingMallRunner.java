class ShoppingMallRunner {

    public static void main(String[] args) {

        ShoppingMall mall = new ShoppingMall();

        mall.mallId = 601;
        mall.mallName = "Orion Mall";
        mall.city = "Bengaluru";
        mall.location = "Rajajinagar";

        mall.numberOfFloors = 6;
        mall.numberOfShops = 250;

        mall.parkingCapacity = 1500;
        mall.cinemaScreens = 10;
        mall.foodCourts = 2;

        mall.elevators = 12;
        mall.escalators = 20;

        mall.securityCameras = 500;

        mall.openingTime = "10:00 AM";
        mall.closingTime = "10:00 PM";

        mall.website = "www.orionmall.com";

        mall.contactNumber = 9876543210L;

        mall.email = "info@orionmall.com";
        mall.ownerName = "Brigade Group";

        mall.annualVisitors = 5000000;

        mall.cleaningStaff = 50;
        mall.maintenanceStaff = 30;

        mall.playArea = true;
        mall.eventSpaces = 3;

        mall.rating = 4.6;

        mall.establishedYear = 2012;

        System.out.println("Mall Id: " + mall.mallId);
        System.out.println("Mall Name: " + mall.mallName);
        System.out.println("City: " + mall.city);
        System.out.println("Location: " + mall.location);
        System.out.println("Number Of Floors: " + mall.numberOfFloors);
        System.out.println("Number Of Shops: " + mall.numberOfShops);
        System.out.println("Parking Capacity: " + mall.parkingCapacity);
        System.out.println("Cinema Screens: " + mall.cinemaScreens);
        System.out.println("Food Courts: " + mall.foodCourts);
        System.out.println("Elevators: " + mall.elevators);
        System.out.println("Escalators: " + mall.escalators);
        System.out.println("Security Cameras: " + mall.securityCameras);
        System.out.println("Opening Time: " + mall.openingTime);
        System.out.println("Closing Time: " + mall.closingTime);
        System.out.println("Website: " + mall.website);
        System.out.println("Contact Number: " + mall.contactNumber);
        System.out.println("Email: " + mall.email);
        System.out.println("Owner Name: " + mall.ownerName);
        System.out.println("Annual Visitors: " + mall.annualVisitors);
        System.out.println("Cleaning Staff: " + mall.cleaningStaff);
        System.out.println("Maintenance Staff: " + mall.maintenanceStaff);
        System.out.println("Play Area: " + mall.playArea);
        System.out.println("Event Spaces: " + mall.eventSpaces);
        System.out.println("Rating: " + mall.rating);
        System.out.println("Established Year: " + mall.establishedYear);
    }
}