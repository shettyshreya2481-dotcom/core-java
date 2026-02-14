class Speaker{
static boolean isSwitch;
static int currentVolume=2;
static int maxVolume=5;
static int minVolume=0;
static void increaseVolume(){
	if(isSwitch==false){
		isSwitch=true;
		System.out.println("Turn On Speaker");
		System.out.println("No Of Arguments"+0);
	}
	if(currentVolume<maxVolume){
		currentVolume=currentVolume+1;
		System.out.println("Current Volume"+currentVolume);
		
	}else{
		System.out.println("Already Volume is High");
}}
static void decreaseVolume(){
	if(!isSwitch){
		isSwitch=false;
		System.out.println("Turn On Speaker");
		System.out.println("No Of Arguments"+0);

	}
	if(currentVolume<maxVolume){
		currentVolume=currentVolume-1;
		System.out.println("Current Volume"+currentVolume);
		
	}else{
		System.out.println("Already Volume is High");
}}}
/*static boolean isSwitch(){
if(isSwitch==false){
isSwitch=true;
System.out.println("Speaker Turn On");
}else if(isSwitch==true){
isSwitch=false;
System.out.println("Speaker Turn Off");
}return isSwitch;*/
