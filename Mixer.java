class Mixer{
static  boolean isPlug;
static boolean isPlug(){
if(isPlug==false){
isPlug=true;
System.out.println("Turn On Mixer");
}else if(isPlug==true){
isPlug=false;
System.out.println("Turn Off Mixer");
}return isPlug;
}}