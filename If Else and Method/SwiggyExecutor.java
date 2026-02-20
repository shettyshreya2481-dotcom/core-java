class SwiggyExecutor{
public static void main(String[] foodItem){
String name="Fish Fry";
int quantity=2;
double price=Swiggy.getFoodPrice(name,quantity);
System.out.println("Food Item"+name);
System.out.println("quantity:"+quantity);
System.out.println("Total Price:"+price);
}}