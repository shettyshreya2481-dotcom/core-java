class Nikon{
static  int resolution;
static int  sensorsize;
static double aperture;
static int iso;

static boolean cameraProperties(int res,int sensor,double aper,int sense){
boolean isProperty=false;
if(res>=720&&res<=1920){
System.out.println("HD View");
resolution=res;
isProperty=true;

}else{
System.out.println("Not Provide HD View");
}

if(sensor>12){
System.out.println("High quality");
sensorsize=sensor;
isProperty=true;
}else{
System.out.println("Low Quality Image");
}

if(aper<=2.0){
System.out.println("Good Quality for low Light");
aperture=aper;
isProperty=true;
}else{
System.out.println("Not Good ");
}

if(sense>800){
System.out.println("Low Light Mode");
iso=sense;
isProperty=true;
}else{
System.out.println("High Light Mode");
}

if(isProperty==true&&isProperty==true&&isProperty==true&&isProperty==true){
isProperty=true;
}
return isProperty;
}

static  void getCameraDetails(int res, int sensor,double aper,int sense){
Nikon.cameraProperties(res, sensor, aper, sense);
System.out.println("Camera Resolution"+resolution);
System.out.println("Quality"+sensorsize);
System.out.println("Aperture"+aperture);
System.out.println("Iso"+iso);
}}




