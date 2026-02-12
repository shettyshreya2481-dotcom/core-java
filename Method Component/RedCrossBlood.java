class RedCrossBlood{
	
//parameter
static void createDonorAccount(String name,String emailId,String password,
         String confirmPassword,int zipCode){

System.out.println("Name Of the Donor:"+name);
System.out.println("EmailId Of The Donor:"+emailId);
System.out.println("Password of the Donor:"+password);
System.out.println("Confirmation Of Password:"+confirmPassword);
System.out.println("ZipCode Of Organization:"+zipCode);
}

public static void main(String[] userAccount){
//Invoke a Call:-Arguments
createDonorAccount("Shreya Shetty","shettyshreya23@gmail.com","shreya344","shreya344",568675);

}}