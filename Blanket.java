class Blanket{
String brand;
String color;
String material;
double price;
String size;
boolean isSoft;

Blanket(){
System.out.println("Blanket Details Below:");
}

Blanket(String brand,String color,String material,double price,String size,boolean isSoft){
this.brand=brand;
this.color=color;
this.material=material;
this.price=price;
this.size=size;
this.isSoft=isSoft;
}
void display(){
System.out.println("brand:"+brand);
System.out.println("Color:"+color);
System.out.println("Material:"+material);
System.out.println("Price:"+price);
System.out.println("Size:"+size);
System.out.println("Fabric:"+isSoft);
System.out.println("================");
}
}