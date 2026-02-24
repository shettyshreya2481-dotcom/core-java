class MetroStation{

static String greenline[]={"Madavara","Chikkabidarakallu","Manjunatha Nagara","Nagasandra",
                           "	Dasarahalli","Jalahalli","Peenya Industry","Rajajinagar"};
static String yellowlline[]={"Rashtreeya Vidyalaya Road","Ragigudda","jayadeva Hospital","BtmLayout","Central Silk Board",
			                             "Bommanahalli"};
static  String  purpleLine[]={"kunadalahalli","Seetharamapalya","Hoodi","Garudacharpalya",
								"Benniganahalli","Swami Vivekananada Road"};
								
static int bengaluruInfo[]={456788,574143,569874};


static void regionalCodeInfo(){
	System.out.println("Bengaluru Regional Info:");
	for(int info:MetroStation.bengaluruInfo){
		System.out.println(info);
}}

 static  void GreenlineInfo(){
	 
	 System.out.println("GreenLine List:");
	 
for (String greenInfo:MetroStation.greenline){

System.out.println("Greenline List:"+greenInfo);
}
}

static void YellowlineInfo(){
	System.out.println("Yellow Line list:");
	
for(String yellowInfo:MetroStation.yellowlline){
	
System.out.println("Yelloline list:"+yellowInfo);
}

}
static void PurplelineInfo(){
	System.out.println("PurpleLine List:");
	
for(String purpleInfo:MetroStation.purpleLine){

System.out.println("Purple list:"+purpleInfo);

}}}



	  