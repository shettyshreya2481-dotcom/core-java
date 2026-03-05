class GymRunner {

    public static void main(String[] args) {

        Gym gym = new Gym();

        gym.gymId = 701;
        gym.gymName = "PowerFit Gym";
        gym.location = "Rajajinagar";
        gym.city = "Bengaluru";
        gym.trainerName = "Rahul";

        gym.numberOfTrainers = 8;
        gym.equipmentCount = 120;

        gym.membershipPlans = "Monthly, Quarterly, Yearly";

        gym.monthlyFee = 1500;
        gym.annualFee = 15000;

        gym.openingTime = "5:00 AM";
        gym.closingTime = "10:00 PM";

        gym.yogaClasses = true;
        gym.zumbaClasses = true;
        gym.personalTraining = true;

        gym.lockerFacility = true;
        gym.showerFacility = true;

        gym.parkingSpaces = 20;

        gym.website = "www.powerfitgym.com";

        gym.contactNumber = 9876543210L;

        gym.email = "info@powerfitgym.com";

        gym.membershipCount = 350;

        gym.nutritionPrograms = true;
        gym.supplementsShop = true;

        gym.rating = 4.4;

        System.out.println("Gym Id: " + gym.gymId);
        System.out.println("Gym Name: " + gym.gymName);
        System.out.println("Location: " + gym.location);
        System.out.println("City: " + gym.city);
        System.out.println("Trainer Name: " + gym.trainerName);
        System.out.println("Number Of Trainers: " + gym.numberOfTrainers);
        System.out.println("Equipment Count: " + gym.equipmentCount);
        System.out.println("Membership Plans: " + gym.membershipPlans);
        System.out.println("Monthly Fee: " + gym.monthlyFee);
        System.out.println("Annual Fee: " + gym.annualFee);
        System.out.println("Opening Time: " + gym.openingTime);
        System.out.println("Closing Time: " + gym.closingTime);
        System.out.println("Yoga Classes: " + gym.yogaClasses);
        System.out.println("Zumba Classes: " + gym.zumbaClasses);
        System.out.println("Personal Training: " + gym.personalTraining);
        System.out.println("Locker Facility: " + gym.lockerFacility);
        System.out.println("Shower Facility: " + gym.showerFacility);
        System.out.println("Parking Spaces: " + gym.parkingSpaces);
        System.out.println("Website: " + gym.website);
        System.out.println("Contact Number: " + gym.contactNumber);
        System.out.println("Email: " + gym.email);
        System.out.println("Membership Count: " + gym.membershipCount);
        System.out.println("Nutrition Programs: " + gym.nutritionPrograms);
        System.out.println("Supplements Shop: " + gym.supplementsShop);
        System.out.println("Rating: " + gym.rating);
    }
}