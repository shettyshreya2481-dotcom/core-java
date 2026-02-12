class Fridge{
static boolean isTurn;
static boolean isTurn(){
if(isTurn==false){
isTurn=true;
System.out.println("Fridge Turn On");
}else if(isTurn==true){
isTurn=false;
System.out.println("Fridge Turn Off");
}return isTurn;
}}

