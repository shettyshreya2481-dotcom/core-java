class ZomatoExecutor{
public static void main(String[] foodItem){
String name="Veg Burger";
int quantity=2;
double price=Zomato.getFoodies(name,quantity);
System.out.println("Food Item"+name);
System.out.println("quantity:"+quantity);
System.out.println("Total Price:"+price);
}}