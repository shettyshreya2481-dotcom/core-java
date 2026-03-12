class BraceletRunner {

    public static void main(String[] args) {

        Bracelet b1 = new Bracelet("Tanishq","Chain","Gold","Yellow",25000,20,6,true,false,"Classic","Wedding",2,true,"Tata",10,"Round",true,"India","High",5);

        Bracelet b2 = new Bracelet("Malabar","Bangle","Silver","White",5000,15,6,false,true,"Modern","Party",1,false,"MalabarGroup",15,"Oval",false,"India","Medium",4);

        Bracelet b3 = new Bracelet("Kalyan","Charm","Gold","Rose",18000,18,7,true,false,"Heart","Gift",2,true,"KalyanJewels",8,"Round",true,"India","High",5);

        Bracelet b4 = new Bracelet("Zara","Fashion","Steel","Black",1200,10,6,false,false,"Simple","Casual",0,true,"Zara",25,"Flat",false,"Spain","Medium",3);

        Bracelet b5 = new Bracelet("H&M","Beaded","Plastic","Blue",800,8,6,false,false,"Beads","Casual",0,true,"HM",30,"Round",true,"Sweden","Low",3);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
    }
}