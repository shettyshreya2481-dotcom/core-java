class Lg{
static String productName;
static int modelNumber;
static String category;
static double price;
static int warrantyYear;
static String screenSize;
static int energyRating;
static boolean isSmartDevice;
static int stockQuantity;
static String discount;

static boolean deatils(String product,int model,String section,double cost,int year,
                        String display,int rating,boolean isSmart,
						int stock,String offer){
						boolean isProduct=false;
						
						productName=product;
						modelNumber=model;
						discount=offer;
						screenSize=display;
						if(section=="Topload"){
						String[] modellists={"23455","26535","26537"};
						System.out.println("Top Load Washing Machine");
						for(String list:modellists)System.out.println("Available Model:"+list);
						category=section;
						isProduct=true;
						}else{
						System.out.println("Other Category");
						}
						
						if(cost>50000){
						System.out.println("Expensive");
						price=cost;
						isProduct=true;
						}else{
						System.out.println("Budget Friendly");
						price=cost;
						}
						
						if(year>=2){
						System.out.println("Extended Warranty");
						warrantyYear=year;
						isProduct=true;
						}
						
						if(rating==5){
						System.out.println("PowerSaving");
						energyRating=rating;
						isProduct=true;
						}else{
						System.out.println("High Consumption");
						energyRating=rating;
						}
						
						if(isSmart==true){
						System.out.println("Smart Appliance");
						isSmartDevice=isSmart;
						isProduct=true;
						}else{
						System.out.println("Normal Appliance");
						}
						
						if(stock==0){
						System.out.println("Out Of Stock");
						stockQuantity=stock;
						isProduct=true;
						}else{
						System.out.println("In Stock");
						stockQuantity=stock;
						}
						return isProduct;
						}
						
						static void getDetails(String product,int model,String section,double cost,int year,
                        String display,int rating,boolean isSmart,
						int stock,String offer){
							
						Lg.deatils(product, model, section, cost, year,
                         display, rating, isSmart,
						 stock, offer);
						 
						 System.out.println("======Refigerator Details=======");
						 System.out.println("Product Name: " + productName);
                         System.out.println("Model Number: " + modelNumber);
                         System.out.println("Category: " + category);
                         System.out.println("Price: " + price);
                         System.out.println("Warranty: " + warrantyYear + " Years");
                         System.out.println("Screen Size: " + screenSize + " inches");
                         System.out.println("Energy Rating: " + energyRating + " Star");
                         System.out.println("Smart Device: " + isSmartDevice);
                         System.out.println("Stock: " + stockQuantity);
                        System.out.println("Discount: " + discount + "%");
						}}
         
				
						
						
						
						