class HotelRunner {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        hotel.hotelId = 401;
        hotel.hotelName = "Royal Palace Hotel";
        hotel.location = "MG Road";
        hotel.city = "Bengaluru";
        hotel.country = "India";
        hotel.ownerName = "Suresh Shetty";

        hotel.numberOfRooms = 120;
        hotel.roomTypes = "Standard, Deluxe, Suite";

        hotel.pricePerNight = 3500;

        hotel.restaurantAvailable = true;
        hotel.swimmingPool = true;
        hotel.gymFacility = true;
        hotel.spaFacility = true;

        hotel.parkingSpaces = 80;

        hotel.wifiAvailability = true;
        hotel.roomService = true;
        hotel.laundryService = true;

        hotel.securityStaff = 10;

        hotel.checkInTime = "12:00 PM";
        hotel.checkOutTime = "11:00 AM";

        hotel.website = "www.royalpalacehotel.com";

        hotel.contactNumber = 9876543210L;

        hotel.email = "info@royalpalacehotel.com";

        hotel.rating = 4.6;

        hotel.establishedYear = 2012;

        System.out.println("Hotel Id: " + hotel.hotelId);
        System.out.println("Hotel Name: " + hotel.hotelName);
        System.out.println("Location: " + hotel.location);
        System.out.println("City: " + hotel.city);
        System.out.println("Country: " + hotel.country);
        System.out.println("Owner Name: " + hotel.ownerName);
        System.out.println("Number Of Rooms: " + hotel.numberOfRooms);
        System.out.println("Room Types: " + hotel.roomTypes);
        System.out.println("Price Per Night: " + hotel.pricePerNight);
        System.out.println("Restaurant Available: " + hotel.restaurantAvailable);
        System.out.println("Swimming Pool: " + hotel.swimmingPool);
        System.out.println("Gym Facility: " + hotel.gymFacility);
        System.out.println("Spa Facility: " + hotel.spaFacility);
        System.out.println("Parking Spaces: " + hotel.parkingSpaces);
        System.out.println("Wifi Availability: " + hotel.wifiAvailability);
        System.out.println("Room Service: " + hotel.roomService);
        System.out.println("Laundry Service: " + hotel.laundryService);
        System.out.println("Security Staff: " + hotel.securityStaff);
        System.out.println("Check In Time: " + hotel.checkInTime);
        System.out.println("Check Out Time: " + hotel.checkOutTime);
        System.out.println("Website: " + hotel.website);
        System.out.println("Contact Number: " + hotel.contactNumber);
        System.out.println("Email: " + hotel.email);
        System.out.println("Rating: " + hotel.rating);
        System.out.println("Established Year: " + hotel.establishedYear);
    }
}