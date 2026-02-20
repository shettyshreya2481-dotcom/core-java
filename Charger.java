class Charger{
static String brandName;
static boolean isdiscontinuedManufacturer;
static double price;

static String getbrandName(){
return "Samsung";
}
static boolean isdiscontinuedManufacturer(){
if(isdiscontinuedManufacturer==false){
System.out.println(" Manufacturing Discontinued:No");
}else{
System.out.println("Manufacturing Discontinued:Yes");
}
return isdiscontinuedManufacturer;
}
static double price(){
return 1200;
}
}
