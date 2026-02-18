class UberEatExecutor{
public static void main(String[] foodItem){
String name="Fish RawaFry";
int quantity=2;
double price=UberEat.getFoodPrice(name,quantity);
System.out.println("Food Item"+name);
System.out.println("quantity:"+quantity);
System.out.println("Total Price:"+price);
}}