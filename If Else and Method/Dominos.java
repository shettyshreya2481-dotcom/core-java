class Dominos {

    static double getPrice(String item, int quantity) {

        if (item == "Margherita") return 99 * quantity;
        else if (item == "Farmhouse") return 249 * quantity;
        else if (item == "Peppy Paneer") return 269 * quantity;
        else if (item == "Veg Extravaganza") return 299 * quantity;
        else if (item == "Deluxe Veggie") return 259 * quantity;
        else if (item == "Paneer Makhani") return 279 * quantity;
        else if (item == "Mexican Green Wave") return 239 * quantity;
        else if (item == "Cheese n Corn") return 199 * quantity;
        else if (item == "Veggie Paradise") return 229 * quantity;
        else if (item == "Chicken Dominator") return 319 * quantity;

        else if (item == "Pepper Barbecue Chicken") return 299 * quantity;
        else if (item == "Chicken Sausage") return 249 * quantity;
        else if (item == "Chicken Golden Delight") return 279 * quantity;
        else if (item == "Non Veg Supreme") return 319 * quantity;
        else if (item == "Chicken Fiesta") return 259 * quantity;

        else if (item == "Indi Tandoori Paneer") return 309 * quantity;
        else if (item == "Indi Chicken Tikka") return 319 * quantity;

        else if (item == "Garlic Breadsticks") return 129 * quantity;
        else if (item == "Stuffed Garlic Bread") return 169 * quantity;
        else if (item == "Cheese Garlic Bread") return 149 * quantity;

        else if (item == "Veg Pasta") return 139 * quantity;
        else if (item == "Non Veg Pasta") return 159 * quantity;

        else if (item == "Taco Mexicana Veg") return 129 * quantity;
        else if (item == "Taco Mexicana Non Veg") return 149 * quantity;

        else if (item == "Veg Parcel") return 99 * quantity;
        else if (item == "Chicken Parcel") return 119 * quantity;

        else if (item == "Butterscotch Mousse Cake") return 99 * quantity;
        else if (item == "Choco Lava Cake") return 109 * quantity;
        else if (item == "Red Velvet Lava Cake") return 129 * quantity;

        else if (item == "Pepsi 475ml") return 60 * quantity;
        else if (item == "7Up 475ml") return 60 * quantity;
        else if (item == "Mirinda 475ml") return 60 * quantity;
        else if (item == "Lipton Ice Tea") return 70 * quantity;

        else if (item == "Capsicum") return 35 * quantity;
        else if (item == "Onion") return 35 * quantity;
        else if (item == "Tomato") return 35 * quantity;
        else if (item == "Jalapeno") return 40 * quantity;
        else if (item == "Golden Corn") return 40 * quantity;
        else if (item == "Paneer") return 60 * quantity;
        else if (item == "Extra Cheese") return 75 * quantity;

        else if (item == "Chicken Tikka") return 80 * quantity;
        else if (item == "Barbecue Chicken") return 80 * quantity;
        else if (item == "Chicken Sausage Topping") return 70 * quantity;

        else if (item == "Ketchup") return 1 * quantity;
        else if (item == "Cheese Dip") return 25 * quantity;
        else if (item == "Mayonnaise Dip") return 25 * quantity;

        else if (item == "Classic Margherita Combo") return 199 * quantity;
        else if (item == "Meal for 2 Veg") return 399 * quantity;
        else if (item == "Meal for 2 Non Veg") return 499 * quantity;

        else if (item == "Pizza Mania Combo") return 299 * quantity;
        else if (item == "Burger Pizza Veg") return 139 * quantity;
        else if (item == "Burger Pizza Non Veg") return 159 * quantity;

        else if (item == "Chocolate Brownie") return 99 * quantity;
        else if (item == "Vanilla Ice Cream") return 79 * quantity;
        else if (item == "Strawberry Ice Cream") return 79 * quantity;

        else {
            System.out.println("Item not found");
            return 0;
        }
    }
}
