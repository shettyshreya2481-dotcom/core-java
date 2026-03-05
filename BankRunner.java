class BankRunner {

    public static void main(String[] args) {

        Bank bank = new Bank();

        bank.bankId = 101;
        bank.bankName = "National Bank";
        bank.branchName = "Rajajinagar Branch";
        bank.city = "Bengaluru";
        bank.state = "Karnataka";
        bank.country = "India";
        bank.managerName = "Anil Kumar";

        bank.numberOfEmployees = 50;
        bank.numberOfAccounts = 20000;
        bank.atmCount = 5;

        bank.lockerFacility = true;
        bank.loanServices = true;
        bank.internetBanking = true;
        bank.mobileBanking = true;

        bank.customerCareNumber = 1800123456L;

        bank.email = "support@nationalbank.com";
        bank.website = "www.nationalbank.com";

        bank.interestRate = 6.5;

        bank.branchCode = "NB001";
        bank.ifscCode = "NATB0001234";

        bank.annualRevenue = 500.75;

        bank.securitySystem = true;
        bank.parkingFacility = true;

        bank.establishedYear = 1995;

        bank.rating = 4.3;

        System.out.println("Bank Id: " + bank.bankId);
        System.out.println("Bank Name: " + bank.bankName);
        System.out.println("Branch Name: " + bank.branchName);
        System.out.println("City: " + bank.city);
        System.out.println("State: " + bank.state);
        System.out.println("Country: " + bank.country);
        System.out.println("Manager Name: " + bank.managerName);
        System.out.println("Number Of Employees: " + bank.numberOfEmployees);
        System.out.println("Number Of Accounts: " + bank.numberOfAccounts);
        System.out.println("ATM Count: " + bank.atmCount);
        System.out.println("Locker Facility: " + bank.lockerFacility);
        System.out.println("Loan Services: " + bank.loanServices);
        System.out.println("Internet Banking: " + bank.internetBanking);
        System.out.println("Mobile Banking: " + bank.mobileBanking);
        System.out.println("Customer Care Number: " + bank.customerCareNumber);
        System.out.println("Email: " + bank.email);
        System.out.println("Website: " + bank.website);
        System.out.println("Interest Rate: " + bank.interestRate);
        System.out.println("Branch Code: " + bank.branchCode);
        System.out.println("IFSC Code: " + bank.ifscCode);
        System.out.println("Annual Revenue: " + bank.annualRevenue);
        System.out.println("Security System: " + bank.securitySystem);
        System.out.println("Parking Facility: " + bank.parkingFacility);
        System.out.println("Established Year: " + bank.establishedYear);
        System.out.println("Rating: " + bank.rating);
    }
}