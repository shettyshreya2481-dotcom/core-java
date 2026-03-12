class Helmet{
String brand;
String type;
String color;
int price;
String size;

public Helmet(){
System.out.println("Helmet Details");

}

public Helmet(String brand,String type,String color,int price,String size){
this.brand=brand;
this.type=type;
this.color=color;
this.price=price;
this.size=size;
System.out.println("Brand: " + brand);
System.out.println("Type: " + type);
System.out.println("Color: " + color);
System.out.println("Price: " + price);
System.out.println("Size: " + size);
System.out.println("---------------");
}}