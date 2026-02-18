class Magicpin {
static double foodItem(String name,int quantity){

    if (name == "Chole Bhature Combo") return 70 * quantity;
    else if (name == "Tandoori Roti") return 80 * quantity;
    else if (name == "Steamed Rice Plate") return 60 * quantity;
    else if (name == "Barley Khichdi") return 50 * quantity;
    else if (name == "Butter Kulcha") return 40 * quantity;
    else if (name == "Garlic Bread") return 30 * quantity;
    else if (name == "Butter Masala Dosa") return 120 * quantity;
    else if (name == "Onion Uttapam") return 60 * quantity;
    else if (name == "Tomato Soup") return 50 * quantity;
    else if (name == "Coriander Soup") return 50 * quantity;
    else if (name =="Gobi Manchurian") return 80 * quantity;
    else if (name == "Cabbage Paratha") return 90 * quantity;
    else if (name == "Peanut Masala") return 110 * quantity;
    else if (name == "Millet Dosa") return 100 * quantity;
    else if (name == "Chocolate Brownie") return 130 * quantity;
    else if (name == "Palak Paneer") return 140 * quantity;
    else if (name == "Rose Falooda") return 40 * quantity;
    else if (name == "Pastry Cake") return 70 * quantity;
    else if (name == "Grilled Chicken Combo") return 150 * quantity;
    else if (name == "Vada Pav") return 20 * quantity;
    else if (name == "Pav Bhaji") return 60 * quantity;
    else if (name == "Misal Pav") return 70 * quantity;
    else if (name == "Samosa Plate") return 15 * quantity;
    else if (name == "Kachori Plate") return 25 * quantity;
    else if (name == "Pani Puri Plate") return 30 * quantity;
    else if (name == "Bhel Puri") return 35 * quantity;
    else if (name == "Ragda Pattice") return 40 * quantity;
    else if (name == "Sev Puri") return 30 * quantity;
    else if (name == "Butter Naan") return 25 * quantity;
    else if (name == "Kadai Chicken") return 160 * quantity;
    else if (name == "Chicken Manchurian") return 90 * quantity;
    else if (name == "Shahi Paneer") return 140 * quantity;
    else if (name == "Dal Makhani") return 120 * quantity;
    else if (name == "Chole Masala") return 100 * quantity;
    else if (name == "Jeera Rice") return 80 * quantity;
    else if (name == "Veg Biryani") return 130 * quantity;
    else if (name == "Chicken Biryani") return 160 * quantity;
    else if (name == "Ghee Rice") return 90 * quantity;
    else if (name == "Green Chicken Curry") return 170 * quantity;
    else if (name == "Makhana Kheer") return 110 * quantity;
    else if (name == "Prawns Masala") return 200 * quantity;
    else if (name == "Prawns Fry") return 190 * quantity;
    else if (name == "Fish Fry") return 150 * quantity;
    else if (name == "Fish Tawa Fry") return 170 * quantity;
    else if (name == "Ice Cream Sundae") return 50 * quantity;

    else {
        System.out.println("No Food Item Found");
        return 0;
    }
}}
