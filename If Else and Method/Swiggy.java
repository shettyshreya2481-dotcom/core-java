class  Swiggy {

    static double getFoodPrice(String name, int quantity) {

        if (name == "Chole Bhatura") return 70 * quantity;
        else if (name == "Burotu Burger") return 80 * quantity;
        else if (name == "Chicken Fries") return 60 * quantity;
        else if (name == "Masala Dosa") return 50 * quantity;
        else if (name == "Plain Dosa") return 40 * quantity;
        else if (name == "Vada") return 30 * quantity;
        else if (name == "Chicken Pizza") return 120 * quantity;
        else if (name == "Curd Rice") return 60 * quantity;
        else if (name == "Pongal") return 50 * quantity;
        else if (name == "Lemon Rice") return 50 * quantity;
        else if (name == "Veg Fried Rice") return 80 * quantity;
        else if (name == "Egg Fried Rice") return 90 * quantity;
        else if (name == "Chicken Fried Rice") return 110 * quantity;
        else if (name == "Chicken Noodles") return 100 * quantity;
        else if (name == "Chicken Kofta") return 130 * quantity;
        else if (name == "Paneer Pizza") return 140 * quantity;
        else if (name == "Gulab Jamun") return 40 * quantity;
        else if (name == "Veg Sandwich") return 70 * quantity;
        else if (name == "Grilled Chicken") return 150 * quantity;
        else if (name == "Vada Pav") return 20 * quantity;
        else if (name == "Pav Bhaji") return 60 * quantity;
        else if (name == "Misal Pav") return 70 * quantity;
        else if (name == "Samosa") return 15 * quantity;
        else if (name == "Kachori") return 25 * quantity;
        else if (name == "Pani Puri") return 30 * quantity;
        else if (name == "Bhel") return 35 * quantity;
        else if (name == "Ragda") return 40 * quantity;
        else if (name == "Sev Puri") return 30 * quantity;
        else if (name == "Butter Naan") return 25 * quantity;
        else if (name == "Kadai Chicken") return 160 * quantity;
        else if (name == "Manchurian") return 90 * quantity;
        else if (name == "Shahi Paneer") return 140 * quantity;
        else if (name == "Dal Makhani") return 120 * quantity;
        else if (name == "Chole Masala") return 100 * quantity;
        else if (name == "Jeera Rice") return 80 * quantity;
        else if (name == "Veg Biryani") return 130 * quantity;
        else if (name == "Chicken Biryani") return 160 * quantity;
        else if (name == "Ghee Rice") return 90 * quantity;
        else if (name == "Green Chicken") return 170 * quantity;
        else if (name == "Makhana") return 110 * quantity;
        else if (name == "Prawns Pulimunchi") return 200 * quantity;
        else if (name == "Prawns Fry") return 190 * quantity;
        else if (name == "Fish Fry") return 150 * quantity;
        else if (name == "Fish Tawa Fry") return 170 * quantity;
        else if (name == "Ice Cream") return 50 * quantity;

        else {
            System.out.println("No Food Item Found");
            return 0;
        }
    }
}
