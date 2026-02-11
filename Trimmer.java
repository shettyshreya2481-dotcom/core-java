class Timmer{
	static boolean isButton;
	static boolean isButton(){
		if(isButton==false){
			isButton=true;
			System.out.println("Trimmer is On");
		}else if(isButton==true){
			isButton=false;
			System.out.println("Trimmer is Off");
		}return isButton;
}}
		