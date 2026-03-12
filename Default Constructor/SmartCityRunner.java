class SmartCityRunner {

    public static void main(String[] args) {

        SmartCity city = new SmartCity();

        city.cityId = 1;
        city.cityName = "Bengaluru";
        city.state = "Karnataka";
        city.country = "India";
        city.population = 12000000;
        city.area = 709.5;
        city.mayorName = "Ramesh Kumar";

        city.numberOfHospitals = 200;
        city.numberOfSchools = 500;
        city.numberOfUniversities = 40;
        city.numberOfParks = 150;

        city.publicTransportSystem = true;
        city.metroStations = 60;
        city.busStops = 2500;

        city.trafficManagementSystem = true;
        city.wasteManagementSystem = true;
        city.waterSupplySystem = true;
        city.electricityGrid = true;
        city.internetCoverage = true;

        city.cctvCameras = 10000;
        city.pollutionIndex = 45.5;

        city.emergencyServices = true;
        city.tourismPlaces = 25;

        city.annualBudget = 5000.75;
        city.smartInitiatives = true;

        System.out.println("City Id: " + city.cityId);
        System.out.println("City Name: " + city.cityName);
        System.out.println("State: " + city.state);
        System.out.println("Country: " + city.country);
        System.out.println("Population: " + city.population);
        System.out.println("Area: " + city.area);
        System.out.println("Mayor Name: " + city.mayorName);
        System.out.println("Number Of Hospitals: " + city.numberOfHospitals);
        System.out.println("Number Of Schools: " + city.numberOfSchools);
        System.out.println("Number Of Universities: " + city.numberOfUniversities);
        System.out.println("Number Of Parks: " + city.numberOfParks);
        System.out.println("Public Transport System: " + city.publicTransportSystem);
        System.out.println("Metro Stations: " + city.metroStations);
        System.out.println("Bus Stops: " + city.busStops);
        System.out.println("Traffic Management System: " + city.trafficManagementSystem);
        System.out.println("Waste Management System: " + city.wasteManagementSystem);
        System.out.println("Water Supply System: " + city.waterSupplySystem);
        System.out.println("Electricity Grid: " + city.electricityGrid);
        System.out.println("Internet Coverage: " + city.internetCoverage);
        System.out.println("CCTV Cameras: " + city.cctvCameras);
        System.out.println("Pollution Index: " + city.pollutionIndex);
        System.out.println("Emergency Services: " + city.emergencyServices);
        System.out.println("Tourism Places: " + city.tourismPlaces);
        System.out.println("Annual Budget: " + city.annualBudget);
        System.out.println("Smart Initiatives: " + city.smartInitiatives);
    }
}