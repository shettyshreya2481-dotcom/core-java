class Phone{
static boolean isSwitch;
static boolean isSwitch(){
if(isSwitch==false){
isSwitch=true;
System.out.println("Phone Turned On");
}else if(isSwitch==true){
isSwitch=false;
System.out.println("Phone turned Off");
}return isSwitch;
}}
