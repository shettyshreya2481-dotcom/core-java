class SoftwareCompanyRunner {

    public static void main(String[] args) {

        SoftwareCompany company = new SoftwareCompany();

        company.companyId = 501;
        company.companyName = "TechNova Solutions";
        company.headquarters = "Bangalore";
        company.country = "India";
        company.foundedYear = 2010;
        company.ceoName = "Ankit Sharma";

        company.numberOfEmployees = 12000;
        company.numberOfOffices = 15;

        company.mainProducts = "Cloud Platform";
        company.programmingLanguagesUsed = "Java, Python, JavaScript";

        company.annualRevenue = 2500.75;
        company.stockPrice = 450.50;
        company.marketCap = 50000.80;

        company.website = "www.technova.com";
        company.contactEmail = "contact@technova.com";

        company.phoneNumber = 9876543210L;

        company.researchTeams = 20;

        company.cloudServices = true;
        company.aiProjects = true;
        company.cybersecurityDivision = true;
        company.internshipPrograms = true;
        company.trainingPrograms = true;

        company.clientCompanies = 300;
        company.developmentCenters = 8;
        company.innovationLabs = 5;

        System.out.println("Company Id: " + company.companyId);
        System.out.println("Company Name: " + company.companyName);
        System.out.println("Headquarters: " + company.headquarters);
        System.out.println("Country: " + company.country);
        System.out.println("Founded Year: " + company.foundedYear);
        System.out.println("CEO Name: " + company.ceoName);
        System.out.println("Number Of Employees: " + company.numberOfEmployees);
        System.out.println("Number Of Offices: " + company.numberOfOffices);
        System.out.println("Main Products: " + company.mainProducts);
        System.out.println("Programming Languages Used: " + company.programmingLanguagesUsed);
        System.out.println("Annual Revenue: " + company.annualRevenue);
        System.out.println("Stock Price: " + company.stockPrice);
        System.out.println("Market Cap: " + company.marketCap);
        System.out.println("Website: " + company.website);
        System.out.println("Contact Email: " + company.contactEmail);
        System.out.println("Phone Number: " + company.phoneNumber);
        System.out.println("Research Teams: " + company.researchTeams);
        System.out.println("Cloud Services: " + company.cloudServices);
        System.out.println("AI Projects: " + company.aiProjects);
        System.out.println("Cybersecurity Division: " + company.cybersecurityDivision);
        System.out.println("Internship Programs: " + company.internshipPrograms);
        System.out.println("Training Programs: " + company.trainingPrograms);
        System.out.println("Client Companies: " + company.clientCompanies);
        System.out.println("Development Centers: " + company.developmentCenters);
        System.out.println("Innovation Labs: " + company.innovationLabs);
    }
}