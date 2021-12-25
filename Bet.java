public abstract class Bet{
    //instance variables
    protected double awayOdds; 
    protected double homeOdds;
    protected String betType;
    protected String away;
    protected String home;
    
    //constructor
    public Bet(double odds1, double odds2, String newType){
        super();
        awayOdds = odds1;
        homeOdds = odds2;
        betType = newType;
    }
    
    //instance methods
    public String toString(){
        return betType+": ";
    }
}
