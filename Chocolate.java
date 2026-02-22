class Chocolate{
static String[] chocolate(String choco){
if(choco=="Vanilla"){
String[] vani={"dairyMilk","Turbo"};
return vani;
}else if(choco=="strawBerry"){
System.out.println("No chocolate");
}
return null;
}
static void search(String[] chocos){
	if(chocos==null){
		System.out.println("No value");
	}else{
for(String choco:chocos){
System.out.println(choco);
}}}


static void searchList(String[] chocoList){
for(String chip:chocoList){
	System.out.println(chip);
String[] chocos=Chocolate.chocolate(chip);
Chocolate.search(chocos);
}}}