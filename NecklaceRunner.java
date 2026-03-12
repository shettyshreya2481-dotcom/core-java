class NecklaceRunner {

    public static void main(String[] args) {

        Necklace n1 = new Necklace("Tanishq","Chain","Gold","Yellow",45000,25,18,true,false,"Temple","Wedding",2,true,"Tata",5,"Round",true,"India","High",5);

        Necklace n2 = new Necklace("Malabar","Layered","Silver","White",9000,20,16,false,true,"Modern","Party",1,true,"MalabarGroup",8,"Oval",false,"India","Medium",4);

        Necklace n3 = new Necklace("Kalyan","Pendant","Gold","Rose",30000,22,17,true,false,"Heart","Gift",2,true,"KalyanJewels",6,"Round",true,"India","High",5);

        Necklace n4 = new Necklace("Zara","Fashion","Alloy","Black",1500,10,15,false,false,"Minimal","Casual",0,true,"Zara",20,"Flat",false,"Spain","Medium",3);

        Necklace n5 = new Necklace("H&M","Beaded","Plastic","Blue",700,8,14,false,false,"Beads","Casual",0,true,"HM",30,"Round",true,"Sweden","Low",3);

        n1.display();
        n2.display();
        n3.display();
        n4.display();
        n5.display();
    }
}