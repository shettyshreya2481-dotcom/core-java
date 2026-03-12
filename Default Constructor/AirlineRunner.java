class AirlineRunner {

    public static void main(String[] args) {

        Airline airline = new Airline();

        airline.airlineId = 201;
        airline.airlineName = "Sky India Airways";
        airline.headquarters = "Delhi";
        airline.country = "India";
        airline.foundedYear = 2001;
        airline.fleetSize = 120;
        airline.numberOfDestinations = 80;
        airline.ceoName = "Rahul Sharma";
        airline.alliance = "Star Alliance";
        airline.website = "www.skyindia.com";
        airline.customerCareNumber = 9876543210L;
        airline.email = "support@skyindia.com";
        airline.cargoService = true;
        airline.loyaltyProgram = true;
        airline.baggageAllowance = 25.5;
        airline.inFlightEntertainment = true;
        airline.mealService = true;
        airline.wifiAvailability = true;
        airline.checkInOptions = "Online / Airport";
        airline.ticketClasses = "Economy, Business";
        airline.safetyRating = 5;
        airline.airportLounges = 15;
        airline.mobileApp = true;
        airline.annualRevenue = 12000.75;
        airline.employeesCount = 8500;

          System.out.println("Airline Id: " + airline.airlineId);
        System.out.println("Airline Name: " + airline.airlineName);
        System.out.println("Headquarters: " + airline.headquarters);
        System.out.println("Country: " + airline.country);
        System.out.println("Founded Year: " + airline.foundedYear);
        System.out.println("Fleet Size: " + airline.fleetSize);
        System.out.println("Number Of Destinations: " + airline.numberOfDestinations);
        System.out.println("CEO Name: " + airline.ceoName);
        System.out.println("Alliance: " + airline.alliance);
        System.out.println("Website: " + airline.website);
        System.out.println("Customer Care Number: " + airline.customerCareNumber);
        System.out.println("Email: " + airline.email);
        System.out.println("Cargo Service: " + airline.cargoService);
        System.out.println("Loyalty Program: " + airline.loyaltyProgram);
        System.out.println("Baggage Allowance: " + airline.baggageAllowance);
        System.out.println("In Flight Entertainment: " + airline.inFlightEntertainment);
        System.out.println("Meal Service: " + airline.mealService);
        System.out.println("Wifi Availability: " + airline.wifiAvailability);
        System.out.println("Check In Options: " + airline.checkInOptions);
        System.out.println("Ticket Classes: " + airline.ticketClasses);
        System.out.println("Safety Rating: " + airline.safetyRating);
        System.out.println("Airport Lounges: " + airline.airportLounges);
        System.out.println("Mobile App: " + airline.mobileApp);
        System.out.println("Annual Revenue: " + airline.annualRevenue);
        System.out.println("Employees Count: " + airline.employeesCount);
    }
}