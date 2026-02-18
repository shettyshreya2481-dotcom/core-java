class  ElectricStove{
static boolean isSwitch=true;
static int currentVolume=4;
static int minVolume=0;
static int maxVolume=5;
static void increaseVolume(){
	if(isSwitch==false){
		isSwitch=true;
		System.out.println("Electric Stove is turning On");
		System.out.println("No Of Arguments"+0);
	}
			if(currentVolume<maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("Increase Volume"+currentVolume);
			}else{
					System.out.println("Already High Volume");
				}
}
	static void decreaseVolume(){
		//if(isSwitch==false)
		if(!isSwitch){
			isSwitch=true;
			System.out.println("Elecgtric Stove is Turning On");
			System.out.println("No Of Arguments"+0);
		}
		if(currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("Decerease Volume"+currentVolume);
		}else{
				System.out.println("Stop");
}}
}