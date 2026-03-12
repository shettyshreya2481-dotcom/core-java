class MovieTheaterRunner {

    public static void main(String[] args) {

        MovieTheatre theatre = new MovieTheatre();

        theatre.theatreId = 301;
        theatre.theatreName = "Galaxy Cinemas";
        theatre.city = "Bengaluru";
        theatre.location = "Rajajinagar";
        theatre.numberOfScreens = 5;
        theatre.seatingCapacity = 800;

        theatre.soundSystem = "Dolby Atmos";
        theatre.screenType = "IMAX";

        theatre.parkingSlots = 200;
        theatre.ticketPrice = 250;

        theatre.onlineBooking = true;
        theatre.foodCourt = true;
        theatre.airConditioning = true;

        theatre.securityStaff = 15;
        theatre.emergencyExit = true;

        theatre.projectorType = "4K Digital";
        theatre.wifiAvailability = true;

        theatre.contactNumber = 9876543210L;

        theatre.website = "www.galaxycinema.com";
        theatre.ownerName = "Ramesh Shetty";

        theatre.establishedYear = 2015;
        theatre.dailyShows = 20;
        theatre.premiumSeats = 120;

        theatre.rating = 4.5;

        theatre.cleaningStaff = 10;

        System.out.println("Theatre Id: " + theatre.theatreId);
        System.out.println("Theatre Name: " + theatre.theatreName);
        System.out.println("City: " + theatre.city);
        System.out.println("Location: " + theatre.location);
        System.out.println("Number Of Screens: " + theatre.numberOfScreens);
        System.out.println("Seating Capacity: " + theatre.seatingCapacity);
        System.out.println("Sound System: " + theatre.soundSystem);
        System.out.println("Screen Type: " + theatre.screenType);
        System.out.println("Parking Slots: " + theatre.parkingSlots);
        System.out.println("Ticket Price: " + theatre.ticketPrice);
        System.out.println("Online Booking: " + theatre.onlineBooking);
        System.out.println("Food Court: " + theatre.foodCourt);
        System.out.println("Air Conditioning: " + theatre.airConditioning);
        System.out.println("Security Staff: " + theatre.securityStaff);
        System.out.println("Emergency Exit: " + theatre.emergencyExit);
        System.out.println("Projector Type: " + theatre.projectorType);
        System.out.println("Wifi Availability: " + theatre.wifiAvailability);
        System.out.println("Contact Number: " + theatre.contactNumber);
        System.out.println("Website: " + theatre.website);
        System.out.println("Owner Name: " + theatre.ownerName);
        System.out.println("Established Year: " + theatre.establishedYear);
        System.out.println("Daily Shows: " + theatre.dailyShows);
        System.out.println("Premium Seats: " + theatre.premiumSeats);
        System.out.println("Rating: " + theatre.rating);
        System.out.println("Cleaning Staff: " + theatre.cleaningStaff);
    }
}