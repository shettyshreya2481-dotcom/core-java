class Gaming {

    static String gameName;
    static String genre;
    static double price;
    static double rating;
    static boolean isMultiplayer;

    static boolean details(String name, String type, double cost,
                           double rate, boolean multiplayer) {

        boolean isGame = false;

        gameName = name;
        genre = type;
        price = cost;
        rating = rate;
        isMultiplayer = multiplayer;

        // Rating check
        if (rating >= 8) {
            System.out.println("Top Rated Game");
            isGame = true;
        } else if (rating >= 5) {
            System.out.println("Average Game");
        } else {
            System.out.println("Low Rated Game");
        }

        // Price check
        if (price >= 4000) {
            System.out.println("Premium Game");
        } else if (price >= 2000) {
            System.out.println("Mid-Range Game");
        } else {
            System.out.println("Budget Game");
        }

        // Multiplayer check
        if (isMultiplayer) {
            System.out.println("Play with Friends");
            isGame = true;
        } else {
            System.out.println("Single Player Mode");
        }

        // Genre check
        if (genre.equals("Action")) {
            System.out.println("High Graphics Required");
        } else if (genre.equals("Racing")) {
            System.out.println("Controller Recommended");
        } else if (genre.equals("RPG")) {
            System.out.println("Story Mode Game");
        } else {
            System.out.println("General Game");
        }

        // Best value logic
        if (rating >= 7 && price < 3000) {
            System.out.println("Best Value Game");
            isGame = true;
        } else if (rating >= 7 && price >= 3000) {
            System.out.println("Hit Game but Costly");
        } else {
            System.out.println("Try Another Game");
        }

        return isGame;
    }

    static void getDetails(String name, String type, double cost,
                           double rate, boolean multiplayer) {

        Gaming.details(name, type, cost, rate, multiplayer);

        System.out.println("\n------ GAME DETAILS ------");
        System.out.println("Game Name: " + gameName);
        System.out.println("Genre: " + genre);
        System.out.println("Price: " + price);
        System.out.println("Rating: " + rating);
        System.out.println("Multiplayer: " + isMultiplayer);
    }
}