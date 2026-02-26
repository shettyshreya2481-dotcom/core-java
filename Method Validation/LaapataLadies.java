class LaapataLadies{

static int ratings;
static int duration;
static String genre;
static double boxOfficeCollection;
static int releaseYear;

static boolean details(int  rate,int time,String section,double collection,int year){
boolean isMovie=false;
if(rate>=8&&rate<=10){
System.out.println("BlockBuster Movie");
ratings=rate;
isMovie=true;
}else{
System.out.println("Average Movie:"+ratings);
}

if(time>=180){
System.out.println("Long Movie");
duration=time;
isMovie=true;
}else if(time<180){
System.out.println("Series");
}

if(section=="Action"){
System.out.println("It's a Action Movie");
genre=section;
isMovie=true;
}else if(section=="Horror"){
System.out.println("It's a Horror Movie");
genre=section;
isMovie=true;
}else if(section=="Family"){
System.out.println("Family Friendly");
genre=section;
isMovie=true;
}else{
System.out.println("Other");
}

if(collection>=1000000.0){
System.out.println("Hit Movie");
boxOfficeCollection=collection;
isMovie=true;
}else{
System.out.println("Flop Movie");
}

if(year>=2024 && year<2025){
System.out.println("New Movie");

releaseYear=year;
isMovie=true;
}else{
System.out.println("Old Movie");
releaseYear=year;
}

return isMovie;
}

static void getDetails(int  rate,int time,String section,double collection,int year){
LaapataLadies.details(rate,time,section,collection,year);
System.out.println("Ratings:"+ratings);
System.out.println("Duration:"+duration);
System.out.println("Genere:"+genre);
System.out.println("Collection:"+boxOfficeCollection);
System.out.println("Release year:"+releaseYear);
}}



