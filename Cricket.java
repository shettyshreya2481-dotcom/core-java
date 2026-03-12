class Cricket {

    String teamName;
    String captain;
    int players;
    String format;
    String ground;
    int overs;
    

    // Default constructor
    Cricket(){
        teamName="India";
        captain="Rohit";
        players=11;
        format="T20";
        ground="Chinnaswamy";
        overs=20;
       
    }

    // Parameterized constructor
    Cricket(String teamName,String captain,int players,String format,String ground,
            int overs){

        this.teamName=teamName;
        this.captain=captain;
        this.players=players;
        this.format=format;
        this.ground=ground;
        this.overs=overs;
        
    }
}