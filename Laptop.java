class Laptop{
	static boolean isSwitch;
	static int currentVolume=4;
	static int maxVolume=8;
	static int minVolume=5;
	//static boolean isPower(){
	static void volume(){
		if(isSwitch==false){
			isSwitch=true;
			System.out.println("Laptop is Turning On");
			//System.out.println("Laptop is On Increase Volume");
 if(currentVolume<maxVolume){
	currentVolume=currentVolume-1;
		System.out.println("Laptop is On decrease Volume");
	System.out.println("Current Volume:"+currentVolume);
}
//
//	System.out.println("Volume Turned Off");
//}
else if(currentVolume>minVolume){
	System.out.println("Increase Volume");
	currentVolume=currentVolume+1;
System.out.println("Current Volume:"+currentVolume);
}
else if(isSwitch==true){
	isSwitch=false;
	System.out.println("Turn Off Laptop");
}

}//}
//return isSwitch;
	}
	}
