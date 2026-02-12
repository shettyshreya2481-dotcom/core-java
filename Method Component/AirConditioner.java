class AirConditioner{
static boolean isSwitch=true;
static boolean isSwitch(){
if(isSwitch==false){
isSwitch=true;
System.out.println("Turning Air Conditioner On");
}
else if(isSwitch==true){
isSwitch=false;
System.out.println("Turning Air Conditioner Off");
}
return isSwitch;
}}