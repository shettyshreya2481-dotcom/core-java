class Blinkit {
static double kitchenItems(String name,int quantity){
    if (name == "Toor Dal") return 70 * quantity;
    else if (name == "Wheat Flour") return 80 * quantity;
    else if (name == "Basmati Rice") return 60 * quantity;
    else if (name == "Barley") return 50 * quantity;
    else if (name == "Maida Flour") return 40 * quantity;
    else if (name == "Brown Bread") return 30 * quantity;
    else if (name == "Amul Butter") return 120 * quantity;
    else if (name == "Onion 1kg") return 60 * quantity;
    else if (name == "Tomato 1kg") return 50 * quantity;
    else if (name == "Coriander Leaves") return 50 * quantity;
    else if (name =="Cauliflower") return 80 * quantity;
    else if (name == "Cabbage") return 90 * quantity;
    else if (name == "Peanut 500g") return 110 * quantity;
    else if (name == "Millet Pack") return 100 * quantity;
    else if (name == "Dairy Milk") return 130 * quantity;
    else if (name == "Palak Leaves") return 140 * quantity;
    else if (name == "Rose Water Bottle") return 40 * quantity;
    else if (name == "Eggs Tray") return 70 * quantity;
    else if (name == "Chicken Breast 500g") return 150 * quantity;
    else if (name == "Lays Chips") return 20 * quantity;
    else if (name == "Kurkure") return 60 * quantity;
    else if (name == "Maggi Noodles") return 70 * quantity;
    else if (name == "Samosa Pack") return 15 * quantity;
    else if (name == "Kachori Pack") return 25 * quantity;
    else if (name == "Pani Puri Kit") return 30 * quantity;
    else if (name == "Bhel Mix") return 35 * quantity;
    else if (name == "Ragda Mix") return 40 * quantity;
    else if (name == "Sev Puri Kit") return 30 * quantity;
    else if (name == "Butter Naan Pack") return 25 * quantity;
    else if (name == "Chicken Curry Cut") return 160 * quantity;
    else if (name == "Veg Manchurian Frozen") return 90 * quantity;
    else if (name == "Paneer 500g") return 140 * quantity;
    else if (name == "Dal Makhani Ready Mix") return 120 * quantity;
    else if (name == "Chole Masala Pack") return 100 * quantity;
    else if (name == "Jeera Rice Ready") return 80 * quantity;
    else if (name == "Veg Biryani Ready") return 130 * quantity;
    else if (name == "Chicken Biryani Ready") return 160 * quantity;
    else if (name == "Ghee 1L") return 90 * quantity;
    else if (name == "Green Chicken Masala") return 170 * quantity;
    else if (name == "Makhana 250g") return 110 * quantity;
    else if (name == "Prawns 500g") return 200 * quantity;
    else if (name == "Prawns Frozen") return 190 * quantity;
    else if (name == "Fish Rohu Cut") return 150 * quantity;
    else if (name == "Fish Tawa Cut") return 170 * quantity;
    else if (name == "Ice Cream Tub") return 50 * quantity;

    else {
        System.out.println("No Food Item Found");
        return 0;
    }
}}
