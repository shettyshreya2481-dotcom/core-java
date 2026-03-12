class HospitalRunner {

    public static void main(String[] args) {

        Hospital hospital = new Hospital();

        hospital.hospitalName = "City Care Hospital";
        hospital.location = "Rajajinagar";
        hospital.city = "Bengaluru";
        hospital.state = "Karnataka";
        hospital.country = "India";
        hospital.email = "citycare@gmail.com";
        hospital.website = "www.citycare.com";
        hospital.directorName = "Dr. Mehta";
        hospital.visitingHours = "9AM - 6PM";

        hospital.hospitalId = 101;
        hospital.establishedYear = 2005;
        hospital.numberOfDoctors = 120;
        hospital.numberOfNurses = 200;
        hospital.numberOfBeds = 350;
        hospital.icuBeds = 50;
        hospital.operationTheatres = 10;
        hospital.rating = 4.5;

        hospital.contactNumber = 9876543210L;

        hospital.emergencyFacility = true;
        hospital.ambulanceServices = true;
        hospital.pharmacyAvailable = true;
        hospital.bloodBankAvailable = true;
        hospital.diagnosticLab = true;
        hospital.insuranceSupport = true;
        hospital.parkingFacility = true;

        System.out.println("Hospital Name: " + hospital.hospitalName);
        System.out.println("City: " + hospital.city);
        System.out.println("Doctors: " + hospital.numberOfDoctors);
        System.out.println("Beds: " + hospital.numberOfBeds);
        System.out.println("Rating: " + hospital.rating);
    }
}