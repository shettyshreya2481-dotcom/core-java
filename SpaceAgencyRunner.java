class SpaceAgencyRunner {

    public static void main(String[] args) {

        SpaceAgency agency = new SpaceAgency();

        agency.agencyId = 901;
        agency.agencyName = "ISRO";
        agency.country = "India";
        agency.headquarters = "Bengaluru";
        agency.foundedYear = 1969;
        agency.directorName = "S. Somanath";

        agency.numberOfScientists = 16000;
        agency.numberOfEmployees = 20000;

        agency.launchSites = 3;

        agency.satellitesLaunched = 120;
        agency.rocketsDeveloped = 25;
        agency.spaceMissions = 80;

        agency.researchCenters = 12;

        agency.annualBudget = 14000.50;

        agency.internationalCollaborations = true;

        agency.trainingPrograms = true;
        agency.internshipPrograms = true;

        agency.website = "www.isro.gov.in";
        agency.contactEmail = "contact@isro.gov.in";

        agency.phoneNumber = 8022212345L;

        agency.spaceStations = 1;

        agency.lunarMissions = 3;
        agency.marsMissions = 2;

        agency.innovationLabs = 5;

        agency.securityDivision = true;

        System.out.println("Agency Id: " + agency.agencyId);
        System.out.println("Agency Name: " + agency.agencyName);
        System.out.println("Country: " + agency.country);
        System.out.println("Headquarters: " + agency.headquarters);
        System.out.println("Founded Year: " + agency.foundedYear);
        System.out.println("Director Name: " + agency.directorName);
        System.out.println("Number Of Scientists: " + agency.numberOfScientists);
        System.out.println("Number Of Employees: " + agency.numberOfEmployees);
        System.out.println("Launch Sites: " + agency.launchSites);
        System.out.println("Satellites Launched: " + agency.satellitesLaunched);
        System.out.println("Rockets Developed: " + agency.rocketsDeveloped);
        System.out.println("Space Missions: " + agency.spaceMissions);
        System.out.println("Research Centers: " + agency.researchCenters);
        System.out.println("Annual Budget: " + agency.annualBudget);
        System.out.println("International Collaborations: " + agency.internationalCollaborations);
        System.out.println("Training Programs: " + agency.trainingPrograms);
        System.out.println("Internship Programs: " + agency.internshipPrograms);
        System.out.println("Website: " + agency.website);
        System.out.println("Contact Email: " + agency.contactEmail);
        System.out.println("Phone Number: " + agency.phoneNumber);
        System.out.println("Space Stations: " + agency.spaceStations);
        System.out.println("Lunar Missions: " + agency.lunarMissions);
        System.out.println("Mars Missions: " + agency.marsMissions);
        System.out.println("Innovation Labs: " + agency.innovationLabs);
        System.out.println("Security Division: " + agency.securityDivision);
    }
}