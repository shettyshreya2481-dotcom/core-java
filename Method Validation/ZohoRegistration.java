class ZohoRegistration{
 static String firstName;
 static String lastName;
 //static String dob;
 //static String password;
 
 static boolean createAccount(String fName,String lName){
 boolean isValidation=false;
 boolean isfirstN=false;
 boolean islName=false;
 //FirstName Validation
 if(fName!=null&&!fName.isEmpty()){
 System.out.println("");
 firstName=fName;
 isfirstN=true;
 }else{
 System.out.println("Provide First Name");
 }
 //LastName Validation

 if(lName!=null&&!lName.isEmpty()){
	  System.out.println("");
 lastName=lName;
 islName=true;
 }else{
 System.out.println("Provide Last Name");
 }
 
 //Validation
 if(isfirstN==true&&islName==true){
 isValidation=true;
 }
 return isValidation;
 }
 
 static  void getDetails(String firstName,String lastName){
	 ZohoRegistration.createAccount(firstName,lastName);
	 System.out.println(firstName);
	  System.out.println(lastName);
 
 }}
 
 
