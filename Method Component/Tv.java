class Tv{
	static boolean isTurn;
	static boolean  isTurn(){
		if(isTurn==false){
			isTurn=true;
			System.out.println("Turn Tv On");
		}else if(isTurn==true){
			isTurn=false;
			System.out.println("Turn Tv Off");
		}
		return isTurn;
}}