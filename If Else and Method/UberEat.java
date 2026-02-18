class UberEat {

    static double getFoodPrice(String name, int quantity) {

        if (name == "Chole Kulche") return 70 * quantity;
        else if (name == "Parota") return 80 * quantity;
        else if (name == "Fries") return 60 * quantity;
        else if (name == "Rawa Dosa") return 50 * quantity;
        else if (name == "Godi Dosa") return 40 * quantity;
        else if (name == "Vermicille") return 30 * quantity;
        else if (name == "Kulfi") return 80 * quantity;
        else if (name == "Paneer Palak") return 60 * quantity;
        else if (name == "Spicy Pongal") return 50 * quantity;
        else if (name == "Lemon Rice") return 50 * quantity;
        else if (name == "Veg Fried Rice") return 80 * quantity;
        else if (name == "Egg Fried Rice") return 90 * quantity;
        else if (name == "Chicken Fried Rice") return 110 * quantity;
        else if (name == "Chicken Noodles") return 100 * quantity;
        else if (name == "Chicken Kofta") return 130 * quantity;
        else if (name == "Paneer Pizza") return 140 * quantity;
        else if (name == "Rasgulla") return 40 * quantity;
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
        else if (name == "Potato Twister") return 190 * quantity;
        else if (name == "Maggi") return 150 * quantity;
        else if (name == "Fish RawaFry") return 170 * quantity;
        else if (name == "Lollipop") return 50 * quantity;

        else {
            System.out.println("No Food Item Found");
            return 0;
        }
    }
}
