class Box8 {
static double boxItems(String name,int quantity){
    if (name == "Veg Dal Rice Box") return 70 * quantity;
    else if (name == "Aloo Patty Wrap") return 80 * quantity;
    else if (name == "Plain Rice Box") return 60 * quantity;
    else if (name == "Healthy Millet Bowl") return 50 * quantity;
    else if (name == "Chapati Meal") return 40 * quantity;
    else if (name == "Sandwich Combo") return 30 * quantity;
    else if (name == "Butter Chicken Rice Box") return 120 * quantity;
    else if (name == "Onion Salad") return 60 * quantity;
    else if (name == "Tomato Dal Box") return 50 * quantity;
    else if (name == "Coriander Chutney") return 50 * quantity;
    else if (name =="Gobi Masala Box") return 80 * quantity;
    else if (name == "Cabbage Sabzi Meal") return 90 * quantity;
    else if (name == "Peanut Masala Rice") return 110 * quantity;
    else if (name == "Millet Khichdi Box") return 100 * quantity;
    else if (name == "Chocolate Dessert Box") return 130 * quantity;
    else if (name == "Palak Paneer Meal") return 140 * quantity;
    else if (name == "Gulab Drink") return 40 * quantity;
    else if (name == "Mini Cake Dessert") return 70 * quantity;
    else if (name == "Grilled Chicken Rice Box") return 150 * quantity;
    else if (name == "Vada Pav Combo") return 20 * quantity;
    else if (name == "Pav Bhaji Meal") return 60 * quantity;
    else if (name == "Misal Pav Combo") return 70 * quantity;
    else if (name == "Samosa Meal") return 15 * quantity;
    else if (name == "Kachori Meal") return 25 * quantity;
    else if (name == "Pani Puri Combo") return 30 * quantity;
    else if (name == "Bhel Combo") return 35 * quantity;
    else if (name == "Ragda Meal") return 40 * quantity;
    else if (name == "Sev Puri Combo") return 30 * quantity;
    else if (name == "Butter Naan Meal") return 25 * quantity;
    else if (name == "Kadai Chicken Rice Box") return 160 * quantity;
    else if (name == "Manchurian Rice Box") return 90 * quantity;
    else if (name == "Shahi Paneer Rice Box") return 140 * quantity;
    else if (name == "Dal Makhani Rice Box") return 120 * quantity;
    else if (name == "Chole Rice Box") return 100 * quantity;
    else if (name == "Jeera Rice Meal") return 80 * quantity;
    else if (name == "Veg Biryani Box") return 130 * quantity;
    else if (name == "Chicken Biryani Box") return 160 * quantity;
    else if (name == "Ghee Rice Box") return 90 * quantity;
    else if (name == "Green Chicken Meal") return 170 * quantity;
    else if (name == "Makhana Sweet Box") return 110 * quantity;
    else if (name == "Prawns Rice Box") return 200 * quantity;
    else if (name == "Prawns Fry Meal") return 190 * quantity;
    else if (name == "Fish Fry Rice Box") return 150 * quantity;
    else if (name == "Fish Tawa Rice Box") return 170 * quantity;
    else if (name == "Ice Cream Dessert") return 50 * quantity;

    else {
        System.out.println("No Food Item Found");
        return 0;
    }
}}
