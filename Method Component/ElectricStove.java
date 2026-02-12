class  ElectricStove{
static boolean isSwitch;
static boolean isSwitch(){
if(isSwitch==false){
isSwitch=true;
System.out.println("ElectricStove is On");
}else if(isSwitch==true){
isSwitch=false;
System.out.println("ElectricStove is Off");
}
return isSwitch;}}
