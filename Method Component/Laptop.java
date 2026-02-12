class Laptop{
static boolean isPower;
static boolean isPower(){
if(isPower==false){
isPower=true;
System.out.println("Laptop Switch On");
}else if(isPower==true){
isPower=false;
System.out.println("Laptop Switch Off");
}return isPower;
}}