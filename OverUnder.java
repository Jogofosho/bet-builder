public class OverUnder extends Bet{
    //instance variables
    protected double line;
    
    //constructor
    public OverUnder(double underOdds, double overOdds, double points){
        super(underOdds, overOdds, "Over/Under, "+points+" points");
        line = points;
    }

    //instance methods

/*
 * Expected output:
 * [away team] vs. [home team]
 * Over/Under, [points]: 
 * Over - [awayOdds]
 * Under - [homeOdds]
 */
    public String toString(){
        return super.toString()+"\n"
                +"Under - "+String.format("%.2f", awayOdds)+"\n"
                +"Over - "+String.format("%.2f", homeOdds)+"\n";
    }//toString
}
