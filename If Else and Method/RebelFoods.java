class RebelFoods {
static double foodItem(String name,int quantity){
    if (name == "Classic Veg Wrap") return 70 * quantity;
    else if (name == "Aloo Tikki Wrap") return 80 * quantity;
    else if (name == "Jeera Rice Bowl") return 60 * quantity;
    else if (name == "Barley Salad Bowl") return 50 * quantity;
    else if (name == "Rumali Roti") return 40 * quantity;
    else if (name == "Garlic Breadsticks") return 30 * quantity;
    else if (name == "Butter Chicken Wrap") return 120 * quantity;
    else if (name == "Onion Salad") return 60 * quantity;
    else if (name == "Tomato Shorba") return 50 * quantity;
    else if (name == "Green Coriander Chutney") return 50 * quantity;
    else if (name =="Gobi 65") return 80 * quantity;
    else if (name == "Cabbage Stir Fry Bowl") return 90 * quantity;
    else if (name == "Peanut Masala Bowl") return 110 * quantity;
    else if (name == "Millet Khichdi Bowl") return 100 * quantity;
    else if (name == "Choco Lava Cake") return 130 * quantity;
    else if (name == "Palak Paneer Rice Bowl") return 140 * quantity;
    else if (name == "Gulab Sharbat") return 40 * quantity;
    else if (name == "Chocolate Truffle Pastry") return 70 * quantity;
    else if (name == "Grilled Chicken Wrap") return 150 * quantity;
    else if (name == "Vada Pav Slider") return 20 * quantity;
    else if (name == "Pav Bhaji Rice Bowl") return 60 * quantity;
    else if (name == "Misal Pav Combo") return 70 * quantity;
    else if (name == "Samosa Chaat") return 15 * quantity;
    else if (name == "Raj Kachori") return 25 * quantity;
    else if (name == "Pani Puri Shots") return 30 * quantity;
    else if (name == "Bhel Chaat") return 35 * quantity;
    else if (name == "Ragda Chaat Bowl") return 40 * quantity;
    else if (name == "Sev Puri Chaat") return 30 * quantity;
    else if (name == "Butter Naan") return 25 * quantity;
    else if (name == "Kadai Chicken Bowl") return 160 * quantity;
    else if (name == "Chicken Manchurian Bowl") return 90 * quantity;
    else if (name == "Shahi Paneer Bowl") return 140 * quantity;
    else if (name == "Dal Makhani Rice Bowl") return 120 * quantity;
    else if (name == "Chole Rice Bowl") return 100 * quantity;
    else if (name == "Jeera Rice with Gravy") return 80 * quantity;
    else if (name == "Veg Dum Biryani") return 130 * quantity;
    else if (name == "Chicken Dum Biryani") return 160 * quantity;
    else if (name == "Ghee Rice with Curry") return 90 * quantity;
    else if (name == "Hariyali Chicken Bowl") return 170 * quantity;
    else if (name == "Makhana Dessert Bowl") return 110 * quantity;
    else if (name == "Prawns Biryani") return 200 * quantity;
    else if (name == "Prawns Fry Bowl") return 190 * quantity;
    else if (name == "Fish Fry Meal") return 150 * quantity;
    else if (name == "Fish Tawa Masala") return 170 * quantity;
    else if (name == "Ice Cream Tub") return 50 * quantity;

    else {
        System.out.println("No Food Item Found");
        return 0;
    }
}}
