class PoliceStationRunner {

    public static void main(String[] args) {

        PoliceStation station = new PoliceStation();

        station.stationId = 801;
        station.stationName = "Rajajinagar Police Station";
        station.location = "Rajajinagar";
        station.city = "Bengaluru";
        station.state = "Karnataka";
        station.country = "India";

        station.stationHead = "Inspector Ramesh";

        station.numberOfOfficers = 20;
        station.numberOfConstables = 50;

        station.patrolVehicles = 10;

        station.crimeReportingSystem = true;
        station.emergencyResponseUnit = true;

        station.contactNumber = 100L;

        station.email = "rajajinagarps@police.in";
        station.website = "www.ksp.gov.in";

        station.lockupCells = 5;
        station.investigationRooms = 4;

        station.cctvMonitoring = true;

        station.wirelessUnits = 15;

        station.cyberCrimeUnit = true;
        station.womenHelpDesk = true;

        station.dailyComplaints = 25;

        station.solvedCases = 300;

        station.rating = 4.2;

        station.establishedYear = 1985;

        System.out.println("Station Id: " + station.stationId);
        System.out.println("Station Name: " + station.stationName);
        System.out.println("Location: " + station.location);
        System.out.println("City: " + station.city);
        System.out.println("State: " + station.state);
        System.out.println("Country: " + station.country);
        System.out.println("Station Head: " + station.stationHead);
        System.out.println("Number Of Officers: " + station.numberOfOfficers);
        System.out.println("Number Of Constables: " + station.numberOfConstables);
        System.out.println("Patrol Vehicles: " + station.patrolVehicles);
        System.out.println("Crime Reporting System: " + station.crimeReportingSystem);
        System.out.println("Emergency Response Unit: " + station.emergencyResponseUnit);
        System.out.println("Contact Number: " + station.contactNumber);
        System.out.println("Email: " + station.email);
        System.out.println("Website: " + station.website);
        System.out.println("Lockup Cells: " + station.lockupCells);
        System.out.println("Investigation Rooms: " + station.investigationRooms);
        System.out.println("CCTV Monitoring: " + station.cctvMonitoring);
        System.out.println("Wireless Units: " + station.wirelessUnits);
        System.out.println("Cyber Crime Unit: " + station.cyberCrimeUnit);
        System.out.println("Women Help Desk: " + station.womenHelpDesk);
        System.out.println("Daily Complaints: " + station.dailyComplaints);
        System.out.println("Solved Cases: " + station.solvedCases);
        System.out.println("Rating: " + station.rating);
        System.out.println("Established Year: " + station.establishedYear);
    }
}