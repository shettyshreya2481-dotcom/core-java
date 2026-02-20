class Fridge{
static boolean isTurn;
static int currentTemp=4;
static int minTemp=0;
static int maxTemp=5;
static void increaseTemperature(){
	if(isSwitch==false){
		isSwitch=true;
		System.out.println("Electric Stove is turning On");
		System.out.println("No Of Arguments"+0);
	}
			if(currentTemp<maxTemp){
				currentTemp=currentTemp+1;
				System.out.println("Increase Volume"+currentTemp);
			}else{
					System.out.println("Already High Volume");
				}
}
	static void decreaseTemperature(){
		//if(isSwitch==false)
		if(!isSwitch){
			isSwitch=true;
			System.out.println("Elecgtric Stove is Turning On");
			System.out.println("No Of Arguments"+0);
		}
		if(currentTemp>minTemp){
			currentTemp=currentTemp-1;
			System.out.println("Decerease Volume"+currentTemp);
		}else{
				System.out.println("Stop");
}}
}
