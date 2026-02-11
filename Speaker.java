class Speaker{
static boolean isSwitch;;
static boolean isSwitch(){
if(isSwitch==false){
isSwitch=true;
System.out.println("Speaker Turn On");
}else if(isSwitch==true){
isSwitch=false;
System.out.println("Speaker Turn Off");
}return isSwitch;
}}