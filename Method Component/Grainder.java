class Grainder{
static boolean isPlug;
static boolean isPlug(){
if(isPlug==false){
isPlug=true;
System.out.println("Grinder is On");
}else if(isPlug ==true){
isPlug=false;
System.out.println("Grinder is Off");
}
return isPlug;
}}