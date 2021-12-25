import java.util.ArrayList;

/**
 * Game should hold the teams that are playing and print that out.
 * Then, print out each Bet stored in the respective arrays using the
 * toString methods of those objects.
 */

public class Game{
    // instance variables
    protected String home;
    protected String away;
    protected ArrayList<Bet> gameBets;
    protected ArrayList<PropBet> playerProps;
    
    //constructor
    public Game(){}
    
    public Game(String awayTeam, String homeTeam){
        away = awayTeam;
        home = homeTeam;
        gameBets = new ArrayList<Bet>();
        playerProps = new ArrayList<PropBet>();
    }
    
    //instance methods
    public String printGameBets(){
        String toReturn = "****Game Bets****\n";
        int count = 1;
        
        for (Bet i : gameBets){
            toReturn += (count++)+") "+i+"\n";
        }
        
        return toReturn;
    }
    
    public String printPropBets(){
        String toReturn = "****Player Props****\n";
        int count = 1;
        
        for (PropBet i : playerProps){
            toReturn += (count++)+") "+i+"\n";   
        }
        
        return toReturn;
    }
    
    public void addGameBet(Bet newBet){
        gameBets.add(newBet);
    }
    
    public void addPropBet(PropBet newProp){
        playerProps.add(newProp);
    }
    
    public String getAwayTeam(){
        return away;
    }
    
    public String getHomeTeam(){
        return home;
    }
    
    public String toString(){
        return away+" vs. "+home+" \n"+printGameBets()+printPropBets();
    }
}
